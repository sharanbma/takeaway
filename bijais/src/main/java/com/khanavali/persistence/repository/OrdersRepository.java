package com.khanavali.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.khanavali.persistence.domain.Order;


@Transactional
public interface OrdersRepository extends CrudRepository<Order, String> {

  Order save(Order order);

  void delete(String key);

  Order findById(String key);

  Iterable<Order> findAll();
}
