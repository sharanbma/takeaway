package com.khanavali.web.controller;

import com.khanavali.core.services.OrderService;
import com.khanavali.events.orders.CreateOrderEvent;
import com.khanavali.events.orders.OrderCreatedEvent;
import com.khanavali.events.orders.OrderDetails;
import com.khanavali.web.domain.Basket;
import com.khanavali.web.domain.CustomerInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

import java.util.UUID;

@Controller
@RequestMapping("/checkout")
public class CheckoutController {

	private static final Logger LOG = LoggerFactory
			.getLogger(BasketCommandController.class);

	@Autowired
	private Basket basket;

	@Autowired
	private OrderService orderService;

	@RequestMapping(method = RequestMethod.GET)
	public String checkout() {
		return "/checkout";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String doCheckout(
			@Valid @ModelAttribute("customerInfo") CustomerInfo customer,
			BindingResult result, RedirectAttributes redirectAttrs) {
		if (result.hasErrors()) {
			// errors in the form
			// show the checkout form again
			return "/checkout";
		}

		LOG.debug("No errors, continue with processing for Customer {}:",
				customer.getName());

		OrderDetails order = basket
				.createOrderDetailsWithCustomerInfo(customer);

		OrderCreatedEvent event = orderService
				.createOrder(new CreateOrderEvent(order));

		UUID key = event.getNewOrderKey();

		redirectAttrs.addFlashAttribute("message",
				"Your order has been accepted!");

		basket.clear();
		LOG.debug("Basket now has {} items", basket.getSize());

		return "redirect:/order/" + key.toString();
	}

	// {!begin customerInfo}
	@ModelAttribute("customerInfo")
	private CustomerInfo getCustomerInfo() {
		return new CustomerInfo();
	}

	// {!end customerInfo}

	@ModelAttribute("basket")
	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}
}
