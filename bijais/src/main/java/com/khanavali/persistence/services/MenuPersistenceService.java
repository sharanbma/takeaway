package com.khanavali.persistence.services;

import com.khanavali.events.menu.*;

public interface MenuPersistenceService {

  AllMenuItemsEvent requestAllMenuItems(RequestAllMenuItemsEvent requestAllMenuItemsEvent);
  MenuItemDetailsEvent requestMenuItemDetails(RequestMenuItemDetailsEvent requestMenuItemDetailsEvent);
  MenuItemDetailsEvent createMenuItem(CreateMenuItemEvent createMenuItemEvent);

}
