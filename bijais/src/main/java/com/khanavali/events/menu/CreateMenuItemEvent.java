package com.khanavali.events.menu;


import com.khanavali.events.CreateEvent;

public class CreateMenuItemEvent extends CreateEvent {

  private MenuItemDetails details;

  public CreateMenuItemEvent(MenuItemDetails details) {
    this.details = details;
  }

  public MenuItemDetails getDetails() {
    return details;
  }
}
