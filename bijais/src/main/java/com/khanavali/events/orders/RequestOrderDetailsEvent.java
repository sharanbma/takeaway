package com.khanavali.events.orders;

import com.khanavali.events.RequestReadEvent;

import java.util.UUID;

public class RequestOrderDetailsEvent extends RequestReadEvent {
  private UUID key;

  public RequestOrderDetailsEvent(UUID key) {
    this.key = key;
  }

  public UUID getKey() {
    return key;
  }
}
