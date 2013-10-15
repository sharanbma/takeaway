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
	
	public void setOrders(List<IOrder> orders);
	
	
}
