package com.khanavali.model;


/**
 * @author melkotek
 * Created on 15 Oct 2013 at 00:07:22
 * Eclipse IDE
 *
 */

public interface IOrder extends IOrderBase{

	public String getCorrelationId();
	
	public OrderType getOrderType();
	
	public void setOrderType(OrderType orderType);
	
	public double getOrderPrice();
	
	public void setOrderPrice(double price);
	
	public void setQuantity(double qty);
	
	public double getQuantity();
	
	public ICustomer getCustomer();
	
	public void setCustomer(ICustomer customer);
	
	public void setItem(IItem item);
	
	public IItem getItem();
	
}
