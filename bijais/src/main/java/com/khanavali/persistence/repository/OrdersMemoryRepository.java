package com.khanavali.persistence.repository;

import com.khanavali.persistence.domain.Order;

import java.util.*;

public class OrdersMemoryRepository implements OrdersRepository {

  private Map<String, Order> orders;

  public OrdersMemoryRepository(final Map<String, Order> orders) {
    this.orders = Collections.unmodifiableMap(orders);
  }

  @Override
  public synchronized Order save(Order order) {

    Map<String, Order> modifiableOrders = new HashMap<String, Order>(orders);
    modifiableOrders.put(order.getId(), order);
    this.orders = Collections.unmodifiableMap(modifiableOrders);

    return order;
  }

  @Override
  public synchronized void delete(String key) {
    if (orders.containsKey(key)) {
      Map<String, Order> modifiableOrders = new HashMap<String, Order>(orders);
      modifiableOrders.remove(key);
      this.orders = Collections.unmodifiableMap(modifiableOrders);
    }
  }

  @Override
  public Order findById(String key) {
    return orders.get(key);
  }

  @Override
  public List<Order> findAll() {
    return Collections.unmodifiableList(new ArrayList<Order>(orders.values()));
  }
}
