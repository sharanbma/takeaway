package com.khanavali.events.orders;

import com.khanavali.events.DeleteEvent;


public class DeleteOrderEvent extends DeleteEvent {

  private final String key;

  public DeleteOrderEvent(final String key) {
    this.key = key;
  }

  public String getKey() {
    return key;
  }
}
