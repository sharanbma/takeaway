package com.khanavali.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.khanavali.persistence.domain.Order;


public interface OrdersRepository extends CrudRepository<Order, String> {

  Order save(Order order);

  void delete(String key);

  Order findById(String key);

  Iterable<Order> findAll();
}
