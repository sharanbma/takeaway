package com.khanavali.events.menu;

import com.khanavali.events.RequestReadEvent;

public class RequestMenuItemDetailsEvent extends RequestReadEvent {
  private String id;

  public RequestMenuItemDetailsEvent(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }
}
