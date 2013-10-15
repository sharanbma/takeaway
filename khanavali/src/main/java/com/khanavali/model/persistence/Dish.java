package com.khanavali.model.persistence;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.khanavali.model.Category;
import com.khanavali.model.IItem;
import com.khanavali.model.Portion;

/**
 * @author melkotek Created on 15 Oct 2013 at 22:38:32 Eclipse IDE
 * 
 */

@Entity
public class Dish implements IItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	private String shortDescription;

	private String longDescription;

	private String imageUrl;

	private double price;

	private double portionSize;

	private boolean active;

	private List<String> tags;
	
	protected Dish(){};
	
	public Dish(String name, String shortDescription, String longDescription,
			String imageUrl, double price, double portionSize, boolean active) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.imageUrl = imageUrl;
		this.price = price;
		this.portionSize = portionSize;
		this.active = active;
	}

	@Override
	public long getId() {
		return this.id;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getShortDescription() {
		return this.shortDescription;
	}

	@Override
	public String getLongDescription() {
		return this.longDescription;
	}

	@Override
	public String getImageUrl() {
		return this.imageUrl;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public double getPortionSize() {
		return this.portionSize;
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Category getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isActive() {
		return this.active;
	}

	@Override
	public Portion getPortionType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dish [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", shortDescription=");
		builder.append(shortDescription);
		builder.append(", longDescription=");
		builder.append(longDescription);
		builder.append(", imageUrl=");
		builder.append(imageUrl);
		builder.append(", price=");
		builder.append(price);
		builder.append(", portionSize=");
		builder.append(portionSize);
		builder.append(", active=");
		builder.append(active);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public List<String> getTags() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
