package com.khanavali.persistence.domain;

import com.khanavali.events.orders.OrderDetails;

import javax.persistence.*;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Entity(name = "ORDERS")
public class Order {

  @Column(name = "SUBMISSION_DATETIME")
  private Date dateTimeOfSubmission;

  @ElementCollection(fetch = FetchType.EAGER, targetClass = java.lang.Integer.class)
  @JoinTable(name="ORDER_ORDER_ITEMS", joinColumns=@JoinColumn(name="ID"))
  @MapKeyColumn(name="MENU_ID")
  @Column(name="VALUE")
  private Map<String, Integer> orderItems;

  @Transient
  private OrderStatus orderStatus;

  @Id
  @Column(name = "ORDER_ID")
  private String id;

  @Column(name = "CUSTOMER_ID")
  private long customerId;
  
  public void setCustomerId(long customerId) {
	this.customerId = customerId;
  }
  
  public long getCustomerId() {
	return customerId;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public Order() {
	// TODO Auto-generated constructor stub
  }
  
  public Order(final Date dateTimeOfSubmission, final long customerId) {
	    this.id = UUID.randomUUID().toString();
	    this.dateTimeOfSubmission = dateTimeOfSubmission;
	    this.customerId = customerId;
	  }

  public void setDateTimeOfSubmission(Date dateTimeOfSubmission) {
    this.dateTimeOfSubmission = dateTimeOfSubmission;
  }

  public OrderStatus getStatus() {
    return orderStatus;
  }

  public void setStatus(OrderStatus orderStatus) {
    this.orderStatus = orderStatus;
  }

  public Date getDateTimeOfSubmission() {
    return dateTimeOfSubmission;
  }

  public String getId() {
    return id;
  }

  public void setOrderItems(Map<String, Integer> orderItems) {
    if (orderItems == null) {
      this.orderItems = Collections.emptyMap();
    } else {
      this.orderItems = Collections.unmodifiableMap(orderItems);
    }
  }

  public Map<String, Integer> getOrderItems() {
    return orderItems;
  }

  public OrderDetails toOrderDetails() {
    OrderDetails details = new OrderDetails();

    details.setKey(this.id);
    details.setDateTimeOfSubmission(this.dateTimeOfSubmission);
    details.setOrderItems(this.getOrderItems());

    return details;
  }

  public static Order fromOrderDetails(OrderDetails orderDetails) {
    Order order = new Order(orderDetails.getDateTimeOfSubmission(),orderDetails.getCustomerId());

    //order.id = orderDetails.getKey().toString();
    //order.dateTimeOfSubmission = orderDetails.getDateTimeOfSubmission();
    order.orderItems = orderDetails.getOrderItems();

    return order;
  }
}