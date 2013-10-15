package com.khanavali.model.persistence;

import com.khanavali.model.IItem;

/**
 * @author melkotek
 * Created on 15 Oct 2013 at 22:58:08
 * Eclipse IDE
 *
 */

public class DishFactory {

	public static IItem createDish(String name, String shortDescription, String longDescription,
			String imageUrl, double price, double portionSize, boolean active){
		Dish newDish = new Dish(name, shortDescription, longDescription, imageUrl, price, portionSize, active);
		return newDish;
	}
	
	
}
