package com.khanavali.persistence.repository;

import com.khanavali.persistence.domain.Order;


public interface OrdersRepository {

  Order save(Order order);

  void delete(String key);

  Order findById(String key);

  Iterable<Order> findAll();
}
