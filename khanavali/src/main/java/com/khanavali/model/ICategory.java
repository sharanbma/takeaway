package com.khanavali.model;

/**
 * @author melkotek
 * Created on 20 Oct 2013 at 15:12:54
 * Eclipse IDE
 *
 */

public interface ICategory {

	public enum Category {
		TIFFIN,
		MAIN,
		STARTER,
		DESSERT,
		DRINK;
	}
	
	public String getCategoryDescription();
	
}
