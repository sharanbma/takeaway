package com.khanavali.web.controller.fixture;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.khanavali.events.menu.AllMenuItemsEvent;
import com.khanavali.events.menu.MenuItemDetails;
import com.khanavali.events.orders.OrderCreatedEvent;
import com.khanavali.events.orders.OrderDetails;
import com.khanavali.events.orders.OrderDetailsEvent;
import com.khanavali.events.orders.OrderStatusDetails;
import com.khanavali.events.orders.OrderStatusEvent;
import com.khanavali.events.orders.RequestOrderDetailsEvent;
import com.khanavali.web.domain.MenuItem;

public class WebDataFixture {
	
	public static final String CUSTOMER_NAME = "Best Customer";
	public static final String NAME = "Yummy Noodles";
	public static final String CHEF_SPECIAL = "Special ";
	public static final String LOW_CAL = "Low cal ";
	public static final BigDecimal COST = new BigDecimal("10.99");
	public static final int MINUTES_TO_PREPARE = 5;
	public static final String STATUS_RECEIVED = "RECEIVED";

  public static OrderCreatedEvent newOrder(String id) {
    return new OrderCreatedEvent(id, new OrderDetails());
  }
  
  public static RequestOrderDetailsEvent orderDetailsRequest(String id) {
	return new RequestOrderDetailsEvent(id);
	
}
  
  public static OrderDetailsEvent orderDetailsEvent(String id) {
	return new OrderDetailsEvent(id, standardOrderDetails(id));
	
}
  
  public static OrderDetails standardOrderDetails () {
	  return standardOrderDetails(UUID.randomUUID().toString());
}
  
  public static OrderDetails standardOrderDetails (String id) {
	  OrderDetails orderDetails = new OrderDetails(id);
	  orderDetails.setName(CUSTOMER_NAME);
	  return orderDetails;
}
  
  public static OrderStatusEvent orderStatusEvent(String id) {
	  return new OrderStatusEvent(id, standardOrderStatusDetails(id));
  }
  
  public static OrderStatusDetails standardOrderStatusDetails(String orderId) {
	  return new OrderStatusDetails(orderId, UUID.randomUUID().toString(), new Date(), STATUS_RECEIVED);
  }

	public static AllMenuItemsEvent allMenuItems() {
		List<MenuItemDetails> menuItemDetails = new ArrayList<MenuItemDetails>();
		menuItemDetails.add(standardMenuItemDetails());
		menuItemDetails.add(standardMenuItemDetails(CHEF_SPECIAL + NAME));
		menuItemDetails.add(standardMenuItemDetails(LOW_CAL + NAME));
		return new AllMenuItemsEvent(menuItemDetails);
	}

	public static MenuItemDetails standardMenuItemDetails(String name) {
		return new MenuItemDetails(UUID.randomUUID().toString(), name, COST, MINUTES_TO_PREPARE);
	}
	
	public static MenuItemDetails standardMenuItemDetails() {
		return standardMenuItemDetails(NAME);
	}
	
	public static MenuItem standardWebMenuItem () {
		return MenuItem.fromMenuDetails(standardMenuItemDetails());
	}

}
