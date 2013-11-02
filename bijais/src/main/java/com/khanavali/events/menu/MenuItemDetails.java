package com.khanavali.events.menu;


public class MenuItemDetails {

  private String id;
  private String name;

  private double cost;

  private int portionSize;

  public MenuItemDetails(String id, String name, double cost, int portionSize) {
    this.id = id;
    this.name = name;
    this.cost = cost;
    this.portionSize = portionSize;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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


  public int getPortionSize() {
	return portionSize;
  }
  
  public void setPortionSize(int portionSize) {
	this.portionSize = portionSize;
  }
  
  
}
