package com.khanavali.model;

/**
 * @author melkotek
 * Created on 14 Oct 2013 at 23:48:31
 * Eclipse IDE
 *
 */

public interface IItem {

	public long getId();
	
	public String getName();
	
	public String getShortDescription();
	
	public String getLongDescription();
	
	public String getImageUrl();
	
	public double getPrice();
	
	public double getPortionSize();
	
	public double getDiscount();
	
	public Category getCategory();
	
	public boolean isActive();
	
	public Portion getPortionType();
}
