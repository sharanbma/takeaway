package com.khanavali.service;

import com.khanavali.model.IAddress;
import com.khanavali.model.ICustomer;

/**
 * @author melkotek
 * Created on 18 Oct 2013 at 23:44:55
 * Eclipse IDE
 *
 */

public interface ICustomerService {

	public ICustomer getCustomerByUserId(String userId);
	
	public ICustomer getCustomerByEmailId(String emailId);
	
	public ICustomer createCustomer(String userid,String emailId, String phoneNum, String mobileNum,IAddress address);
}
