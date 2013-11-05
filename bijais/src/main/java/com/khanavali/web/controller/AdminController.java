package com.khanavali.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.khanavali.core.services.CustomerService;
import com.khanavali.core.services.MenuService;
import com.khanavali.core.services.OrderService;
import com.khanavali.events.menu.AllMenuItemsEvent;
import com.khanavali.events.menu.MenuItemDetails;
import com.khanavali.events.menu.RequestAllMenuItemsEvent;
import com.khanavali.web.domain.MenuItem;

@Controller
@RequestMapping("/admin")
public class AdminController {

	private static final Logger LOG = LoggerFactory
			.getLogger(AdminController.class);

	@Autowired
	OrderService orderService;

	@Autowired
	CustomerService customerService;

	@Autowired
	MenuService menuService;

	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String menuAdmin(Model model) {
		LOG.info("Menu admin requested");
		model.addAttribute("menuAdminItems",getMenuItems(menuService.requestAllMenuItems(new RequestAllMenuItemsEvent())));
		return "/admin/menu";
	}

	@RequestMapping(value = "/menu/add", method = RequestMethod.POST)
	public String menuAdminAdd(Model model) {
		LOG.info("Menu admin (add) post request");
		return "redirect:/admin/menu";
	}
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String customerAdmin() {
		LOG.info("Customer admin requested");
		return "/admin/customer";
	}

	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public String orderAdmin() {
		LOG.info("Order admin requested");
		return "/admin/order";
	}
	
	private List<MenuItem> getMenuItems(AllMenuItemsEvent requestAllMenuItems) {
		List<MenuItem> menuDetails = new ArrayList<MenuItem>();
		
		for (MenuItemDetails menuItemDetails : requestAllMenuItems.getMenuItemDetails()) {
			menuDetails.add(MenuItem.fromMenuDetails(menuItemDetails));
		}

		return menuDetails;
	}

}
