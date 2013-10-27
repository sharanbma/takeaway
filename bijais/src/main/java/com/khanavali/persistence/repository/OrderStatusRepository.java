package com.khanavali.persistence.repository;

import com.khanavali.persistence.domain.OrderStatus;

import java.util.List;


public interface OrderStatusRepository {

  OrderStatus save(OrderStatus orderStatus);

  void delete(String key);

  OrderStatus findLatestById(String key);

  List<OrderStatus> findAll();
}
