package com.khanavali.events.orders;

import com.khanavali.events.CreatedEvent;

public class OrderCreatedEvent extends CreatedEvent {

  private final String newOrderKey;
  private final OrderDetails details;

  public OrderCreatedEvent(final String newOrderKey, final OrderDetails details) {
    this.newOrderKey = newOrderKey;
    this.details = details;
  }

  public OrderDetails getDetails() {
    return details;
  }

  public String getNewOrderKey() {
    return newOrderKey;
  }
}
