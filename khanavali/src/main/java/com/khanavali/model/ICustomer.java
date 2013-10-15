package com.khanavali.model;

/**
 * @author melkotek
 * Created on 15 Oct 2013 at 22:19:54
 * Eclipse IDE
 *
 */

public interface ICustomer {

	public long getCustomerId();
	
	public String getFirstName();
	
	public String getMiddleName();
	
	public String getLastName();
	
	public String getName();
	
	public IAddress getAddress();
	
	public boolean isActive();
	
	public boolean isBlackListed();
	
	public String getPhoneNumber();
	
	public String getLandlineNumber();
	
	public IPaymentDetails getPaymentDetails();
	
	public String getEmailId();
	
	public IPreferences getPreferences();
	
	public String getUsername();
	
	public String getPassword();
	
	public String getEncryptedPassword();
	
}
