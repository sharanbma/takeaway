package com.khanavali.service;

import java.util.Date;
import java.util.List;

import com.khanavali.model.ICustomer;
import com.khanavali.model.IItem;
import com.khanavali.model.IOrder;
import com.khanavali.model.IOrderList;

/**
 * @author melkotek
 * Created on 18 Oct 2013 at 23:50:08
 * Eclipse IDE
 *
 */

public interface IOrderService {

	public List<IOrderList> getActiveOrdersForCustomer(long customerId);
	
	public List<IOrderList> getOrdersByDateForCustomer(long customerId, Date dateFrom, Date dateTo);
	
	public List<IOrderList> getOrdersForCustomer(ICustomer customer);
	
	public IOrderList getOrderByOrderId(String orderId);
	
	public IOrderList createOrder(List<IOrder> itimisedOrders);
	
	
}
