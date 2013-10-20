package com.khanavali.service;

import com.khanavali.model.IItem;
import com.khanavali.model.IOrderList;

/**
 * @author melkotek
 * Created on 18 Oct 2013 at 23:50:00
 * Eclipse IDE
 *
 */

public interface IDiscountService {

	public double getDiscountForOrder(IOrderList order);
	
	public double getDiscountForItem(IItem item);
	
	
}
