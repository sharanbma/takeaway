package com.khanavali.model;

import java.util.List;

/**
 * @author melkotek
 * Created on 15 Oct 2013 at 22:25:35
 * Eclipse IDE
 *
 */

public interface IOrderList extends IOrderBase {

	public List<IOrder> getOrders();

	public ICustomer getCustomer();
	
	public void setCustomer(ICustomer customer);
	
	public void setOrders(List<IOrder> orders);
	
	public void addItemOrder(IItem item, double price, double quantity);
	
	public void addItemOrder(IItem item, double quantity);
	
	public void removeItemOrder(IItem item);
	
	public void updateItemOrder(IItem item, double quantity);
	
	public void addOrder(IOrder order);
	
	public void removeOrder(IOrder order);
	
}
