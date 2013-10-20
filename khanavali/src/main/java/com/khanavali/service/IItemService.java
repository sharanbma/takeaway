package com.khanavali.service;

import java.util.List;

import com.khanavali.model.Category;
import com.khanavali.model.IItem;
import com.khanavali.model.Portion;

/**
 * @author melkotek Created on 18 Oct 2013 at 23:45:14 Eclipse IDE
 * 
 */

public interface IItemService {

	public List<IItem> getItemsByRestaurant(String restaurantName);

	public List<IItem> getAllItems();

	public List<IItem> getItemsByCategory(Category category);

	public List<IItem> getAllActiveItems();

	public List<IItem> getItemsByDescription(String description);

	public List<IItem> getDiscountedItems();

	public List<IItem> getItemsByName(String name);

	public List<IItem> getItemsByPriceRange(double priceFrom, double priceTo);

	public IItem createActiveItem(String name, String shortDescription,
			String longDescription, double price, Category category,
			Portion portion, double minPortionSize, double maxStock,List<String> tags);
	
	public boolean disableItem(long itemId);
	
	public boolean disableItem(IItem item);
	
	public boolean deleteItem(long itemId);
	
	public boolean deleteItem(IItem item);
	
	
}
