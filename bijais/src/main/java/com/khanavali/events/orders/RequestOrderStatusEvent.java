package com.khanavali.events.orders;

import com.khanavali.events.RequestReadEvent;

import java.util.UUID;

public class RequestOrderStatusEvent extends RequestReadEvent {
  private UUID key;

  public RequestOrderStatusEvent(UUID key) {
    this.key = key;
  }

  public UUID getKey() {
    return key;
  }
}
