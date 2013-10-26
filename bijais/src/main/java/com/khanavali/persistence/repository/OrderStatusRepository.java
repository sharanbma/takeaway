package com.khanavali.persistence.repository;

import com.khanavali.persistence.domain.OrderStatus;

import java.util.List;
import java.util.UUID;

public interface OrderStatusRepository {

  OrderStatus save(OrderStatus orderStatus);

  void delete(UUID key);

  OrderStatus findLatestById(UUID key);

  List<OrderStatus> findAll();
}
