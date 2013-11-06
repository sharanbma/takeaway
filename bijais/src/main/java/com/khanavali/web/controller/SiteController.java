package com.khanavali.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.khanavali.core.services.CustomerService;
import com.khanavali.core.services.MenuService;
import com.khanavali.events.customer.CreateCustomerEvent;
import com.khanavali.events.customer.CustomerDetails;
import com.khanavali.events.customer.CustomerDetailsEvent;
import com.khanavali.events.customer.RequestCustomerDetailsEvent;
import com.khanavali.events.menu.AllMenuItemsEvent;
import com.khanavali.events.menu.MenuItemDetails;
import com.khanavali.events.menu.RequestAllMenuItemsEvent;
import com.khanavali.web.domain.Basket;
import com.khanavali.web.domain.CustomerInfo;
import com.khanavali.web.domain.MenuItem;

@Controller
@RequestMapping("/")
public class SiteController {

	private static final Logger LOG = LoggerFactory
			.getLogger(SiteController.class);

	@Autowired
	private MenuService menuService;

	@Autowired
	private Basket basket;

	@Autowired
	private CustomerService customerService;

	private List<MenuItem> menuDetails = new ArrayList<MenuItem>();

	@RequestMapping(method = RequestMethod.GET)
	public String getCurrentMenu(Model model) {
		LOG.debug("Yummy MenuItemDetails to home view");

		if (!inited) {
			init();
		}
		model.addAttribute("menuItems", menuDetails);
		return "/splash";
	}

	private volatile boolean inited = false;

	public void init() {
		// Get menu items
		inited = true;
		getMenuItems(menuService
				.requestAllMenuItems(new RequestAllMenuItemsEvent()));

	}

	private List<MenuItem> getMenuItems(AllMenuItemsEvent requestAllMenuItems) {

		for (MenuItemDetails menuItemDetails : requestAllMenuItems
				.getMenuItemDetails()) {
			menuDetails.add(MenuItem.fromMenuDetails(menuItemDetails));
		}

		return menuDetails;
	}

	@ModelAttribute("basket")
	private Basket getBasket() {
		return basket;
	}

	@ModelAttribute("customerInfo")
	private CustomerInfo getCustomer() {
		return new CustomerInfo();
	}

	@RequestMapping(value = "/storeDetails", method = RequestMethod.POST)
	public String createCustomer(
			@ModelAttribute("customerInfo") CustomerInfo customerInfo,
			HttpServletRequest request, HttpServletResponse response,
			Model model, BindingResult bindingResult,
			SessionStatus sessionStatus) {
		CustomerDetails customerDetails = new CustomerDetails(0, "", "", "",
				customerInfo.getEmailAddress(), "");

		if (LOG.isInfoEnabled()) {
			LOG.info("Register for updates request : "
					+ customerInfo.getEmailAddress());
		}

		RequestCustomerDetailsEvent requestCustomerDetailsEvent = new RequestCustomerDetailsEvent(
				0, null, customerInfo.getEmailAddress());
		CustomerDetailsEvent customerDetailsEvent1 = customerService
				.requestCustomerDetails(requestCustomerDetailsEvent);

		KhanavaliValidator validator = new KhanavaliValidator();
		validator.validate(customerInfo, bindingResult);

		if (customerDetailsEvent1.getCustomerDetails() == null
				|| !customerDetailsEvent1.getCustomerDetails().getEmailId()
						.equalsIgnoreCase(customerInfo.getEmailAddress())) {
			CustomerDetailsEvent customerDetailsEvent = customerService
					.createCustomer(new CreateCustomerEvent(customerDetails));
			model.addAttribute("emailId", customerDetailsEvent
					.getCustomerDetails().getEmailId());
			request.setAttribute(
					"successMessage",
					"We have got your contact now, You will be notified when we are ready to accept your orders online");
		} else {
			sessionStatus.setComplete();
			model.addAttribute(
					"errorMessage",
					"We already have your details, You will be notified when we are ready to accept your orders online");

		}
		return "/splash";

	}
}
