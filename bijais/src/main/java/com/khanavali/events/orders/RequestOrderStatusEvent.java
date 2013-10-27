package com.khanavali.events.orders;

import com.khanavali.events.RequestReadEvent;


public class RequestOrderStatusEvent extends RequestReadEvent {
  private String key;

  public RequestOrderStatusEvent(String key) {
    this.key = key;
  }

  public String getKey() {
    return key;
  }
}
