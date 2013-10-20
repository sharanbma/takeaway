package com.khanavali.model.persistence;

import java.io.Serializable;

import javax.persistence.*;

import com.khanavali.model.ICustomer;
import com.khanavali.model.IItem;
import com.khanavali.model.IOrder;
import com.khanavali.model.OrderType;

import java.util.List;


/**
 * The persistent class for the order database table.
 * 
 */
@Entity
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements IOrder,Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String orderId;

	private String comments;

	private double orderPrice;

	private boolean parentOrder;

	private double quantity;

	private int status;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="customerId")
	private Customer customer;

	//bi-directional many-to-one association to Dish
	@ManyToOne
	@JoinColumn(name="itemId")
	private Dish dish;

	//bi-directional many-to-one association to Order
	@ManyToOne
	@JoinColumn(name="correlationId")
	private Order order;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="order")
	private List<Order> orders;

	public Order() {
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public double getOrderPrice() {
		return this.orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public boolean getParentOrder() {
		return this.parentOrder;
	}

	public void setParentOrder(boolean parentOrder) {
		this.parentOrder = parentOrder;
	}

	public double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Dish getDish() {
		return this.dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setOrder(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setOrder(null);

		return order;
	}

	@Override
	public long getOrderTime() {
		return 0;
	}

	@Override
	public String getCorrelationId() {
		return this.order.getOrderId();
	}

	@Override
	public OrderType getOrderType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOrderType(OrderType orderType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCustomer(ICustomer customer) {
		this.customer = (Customer) customer;
		
	}

	@Override
	public void setItem(IItem item) {
		if(item instanceof Dish){
			this.setDish((Dish) item);
		}
	}

	@Override
	public IItem getItem() {
		return this.dish;
	}

}