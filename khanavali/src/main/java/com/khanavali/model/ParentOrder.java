package com.khanavali.model;

import java.util.ArrayList;
import java.util.List;

import com.khanavali.model.persistence.Order;

/**
 * @author melkotek
 * Created on 19 Oct 2013 at 18:57:59
 * Eclipse IDE
 *
 */

public class ParentOrder implements IOrderList {

	private String orderId;
	private ICustomer customer;
	private List<IOrder> orders = new ArrayList<IOrder>();
	
	
	@Override
	public String getOrderId() {
		return this.orderId;
	}

	@Override
	public long getOrderTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<IOrder> getOrders() {
		return this.orders;
	}

	@Override
	public void setOrders(List<IOrder> orders) {
		this.orders = orders;
	}

	@Override
	public void addItemOrder(IItem item, double price, double quantity) {
		IOrder order = getOrder(item);
		if(order != null){
			order.setQuantity(order.getQuantity() + quantity);
		} else {
			order = new Order();
			order.setItem(item);
			order.setQuantity(quantity);
			order.setCustomer(this.customer);
			((Order)order).setParentOrder(false);
			order.setOrderPrice(price);
			((Order)order).setStatus(0);
			this.getOrders().add(order);	
		}
		
	}

	private IOrder getOrder(IItem item) {
		for(IOrder order : this.orders){
			if(order.getItem().equals(item)){
				return order;
			}
		}
		return null;
	}

	@Override
	public void removeItemOrder(IItem item) {
		IOrder order = getOrder(item);
		if(order != null){
			this.orders.remove(order);
		}
	}

	@Override
	public void addOrder(IOrder order) {
		this.getOrders().add(order);
	}

	@Override
	public void removeOrder(IOrder order) {
		this.getOrders().remove(order);
	}

	@Override
	public ICustomer getCustomer() {
		return this.customer;
	}

	@Override
	public void setCustomer(ICustomer customer) {
		this.customer = customer;
	}

	@Override
	public void addItemOrder(IItem item, double quantity) {
		this.addItemOrder(item, item.getPrice(), quantity);
	}

	@Override
	public void updateItemOrder(IItem item, double quantity) {
		this.addItemOrder(item,0.0d - quantity);
	}

}
