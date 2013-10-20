package com.khanavali.model.util;

import com.khanavali.model.ICustomer;
import com.khanavali.model.IItem;
import com.khanavali.model.IOrderList;
import com.khanavali.model.ParentOrder;
import com.khanavali.model.persistence.Order;

/**
 * @author melkotek
 * Created on 19 Oct 2013 at 00:45:44
 * Eclipse IDE
 *
 */

public class OrderFactory {

	public static IOrderList makeOrder(ICustomer customer,IItem item, double price, double quantity){
		IOrderList parentOrder = new ParentOrder();
		Order order = new Order();
		order.setItem(item);
		order.setOrderPrice(price);
		order.setQuantity(quantity);
		order.setStatus(0);
		order.setCustomer(customer);
		parentOrder.addOrder(order);
		parentOrder.setCustomer(customer);
		return parentOrder;
	}

	public static IOrderList makeOrder(ICustomer customer,IItem item, double quantity){
		IOrderList parentOrder = new ParentOrder();
		Order order = new Order();
		order.setItem(item);
		order.setOrderPrice(item.getPrice() * quantity);
		order.setQuantity(quantity);
		order.setStatus(0);
		order.setCustomer(customer);
		parentOrder.addOrder(order);
		return parentOrder;
	}
	
	
}
