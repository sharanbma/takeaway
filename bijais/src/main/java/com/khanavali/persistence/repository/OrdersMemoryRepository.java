package com.khanavali.persistence.repository;

import com.khanavali.persistence.domain.Order;

import java.util.*;

public class OrdersMemoryRepository implements OrdersRepository {

  private Map<String, Order> orders;

  public OrdersMemoryRepository(final Map<String, Order> orders) {
    this.orders = Collections.unmodifiableMap(orders);
  }

  @SuppressWarnings("unchecked")
  @Override
  public synchronized Order save(Order order) {

    Map<String, Order> modifiableOrders = new HashMap<String, Order>(orders);
    modifiableOrders.put(order.getId(), order);
    this.orders = Collections.unmodifiableMap(modifiableOrders);

    return (Order)order;
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



@Override
public <S extends Order> Iterable<S> save(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Order findOne(String id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean exists(String id) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Iterable<Order> findAll(Iterable<String> ids) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public long count() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void delete(Order entity) {
	// TODO Auto-generated method stub
	
}

@Override
public void delete(Iterable<? extends Order> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	
}
}
