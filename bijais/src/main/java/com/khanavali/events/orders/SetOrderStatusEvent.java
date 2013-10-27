package com.khanavali.events.orders;

import com.khanavali.events.UpdateEvent;

import java.util.UUID;

public class SetOrderStatusEvent extends UpdateEvent {

  private String key;
  private OrderStatusDetails orderStatus;

  public SetOrderStatusEvent(String key, OrderStatusDetails orderStatus) {
    this.key = key;
    this.orderStatus = orderStatus;
  }

  public String getKey() {
    return key;
  }

  public OrderStatusDetails getOrderStatus() {
    return orderStatus;
  }
}
