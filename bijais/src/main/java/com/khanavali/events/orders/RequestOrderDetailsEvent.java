package com.khanavali.events.orders;

import com.khanavali.events.RequestReadEvent;


public class RequestOrderDetailsEvent extends RequestReadEvent {
  private String key;

  public RequestOrderDetailsEvent(String key) {
    this.key = key;
  }

  public String getKey() {
    return key;
  }
}
