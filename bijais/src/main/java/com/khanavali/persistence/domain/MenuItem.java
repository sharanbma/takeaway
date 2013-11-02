package com.khanavali.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.khanavali.events.menu.MenuItemDetails;

@Entity(name = "MENU_ITEMS")
public class MenuItem {

	@Id
	@Column(name = "MENU_ID")
	private String id;

	private String description;
	
	private String name;

	private String imageUrl;

	private double cost;

	private int portionSize;

	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setPortionSize(int portionSize) {
		this.portionSize = portionSize;
	}
	
	public int getPortionSize() {
		return portionSize;
	}
	
	public MenuItemDetails toStatusDetails() {
		return new MenuItemDetails(id, name, cost, portionSize);
	}

	public static MenuItem fromStatusDetails(MenuItemDetails orderStatusDetails) {
		MenuItem item = new MenuItem();

		item.cost = orderStatusDetails.getCost();
		item.id = orderStatusDetails.getId();
		item.portionSize = orderStatusDetails.getPortionSize();
		item.name = orderStatusDetails.getName();

		return item;
	}
}
