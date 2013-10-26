package com.khanavali.events.orders;

import com.khanavali.events.CreateEvent;

public class CreateOrderEvent extends CreateEvent {
  private OrderDetails details;

  public CreateOrderEvent(OrderDetails details) {
    this.details = details;
  }

  public OrderDetails getDetails() {
    return details;
  }
}
