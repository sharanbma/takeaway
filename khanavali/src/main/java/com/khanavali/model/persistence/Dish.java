package com.khanavali.model.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import com.khanavali.model.IItem;
import com.khanavali.model.Portion;


/**
 * The persistent class for the dish database table.
 * 
 */
@Entity
@NamedQuery(name="Dish.findAll", query="SELECT d FROM Dish d")
public class Dish implements IItem,Serializable {
	private static final long serialVersionUID = 1L;

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dish [dishId=");
		builder.append(dishId);
		builder.append(", imageUrl=");
		builder.append(imageUrl);
		builder.append(", longDescription=");
		builder.append(longDescription);
		builder.append(", minPortions=");
		builder.append(minPortions);
		builder.append(", name=");
		builder.append(name);
		builder.append(", portionIncrement=");
		builder.append(portionIncrement);
		builder.append(", portionSize=");
		builder.append(portionSize);
		builder.append(", price=");
		builder.append(price);
		builder.append(", shortDescription=");
		builder.append(shortDescription);
		builder.append(", active=");
		builder.append(active);
		builder.append("]");
		return builder.toString();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long dishId;

	private String imageUrl;

	private String longDescription;

	private int minPortions;

	private String name;

	private double portionIncrement;

	private double portionSize;

	private double price;

	private String shortDescription;
	
	private boolean active;

	public Dish(String name, String shortDescription, String longDescription, String imageUrl, double portionSize, double price, double portionIncrement, int minPortions, boolean active){
		
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.imageUrl = imageUrl;
		this.portionSize = portionSize;
		this.price = price;
		this.portionIncrement = portionIncrement;
		this.minPortions = minPortions;
		this.active = active;
	}
	
	
	//bi-directional many-to-one association to Discount
	@OneToMany(mappedBy="dish")
	private List<Discount> discounts;

	//bi-directional many-to-one association to Portiontype
	@ManyToOne
	@JoinColumn(name="portionTypeId")
	private Portiontype portiontype;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;

	//bi-directional many-to-one association to Dishrelation
	@OneToMany(mappedBy="dish1")
	private List<Dishrelation> dishrelations1;

	//bi-directional many-to-one association to Dishrelation
	@OneToMany(mappedBy="dish2")
	private List<Dishrelation> dishrelations2;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="dish")
	private List<Order> orders;

	//bi-directional many-to-one association to Tag
	@OneToMany(mappedBy="dish")
	private List<Tag> tags;

	public Dish() {
	}

	public long getDishId() {
		return this.dishId;
	}

	public void setDishId(long dishId) {
		this.dishId = dishId;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLongDescription() {
		return this.longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public int getMinPortions() {
		return this.minPortions;
	}

	public void setMinPortions(int minPortions) {
		this.minPortions = minPortions;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPortionIncrement() {
		return this.portionIncrement;
	}

	public void setPortionIncrement(double portionIncrement) {
		this.portionIncrement = portionIncrement;
	}

	public double getPortionSize() {
		return this.portionSize;
	}

	public void setPortionSize(double portionSize) {
		this.portionSize = portionSize;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public List<Discount> getDiscounts() {
		return this.discounts;
	}

	public void setDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
	}

	public Discount addDiscount(Discount discount) {
		getDiscounts().add(discount);
		discount.setDish(this);

		return discount;
	}

	public Discount removeDiscount(Discount discount) {
		getDiscounts().remove(discount);
		discount.setDish(null);

		return discount;
	}

	public Portiontype getPortiontype() {
		return this.portiontype;
	}

	public void setPortiontype(Portiontype portiontype) {
		this.portiontype = portiontype;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Dishrelation> getDishrelations1() {
		return this.dishrelations1;
	}

	public void setDishrelations1(List<Dishrelation> dishrelations1) {
		this.dishrelations1 = dishrelations1;
	}

	public Dishrelation addDishrelations1(Dishrelation dishrelations1) {
		getDishrelations1().add(dishrelations1);
		dishrelations1.setDish1(this);

		return dishrelations1;
	}

	public Dishrelation removeDishrelations1(Dishrelation dishrelations1) {
		getDishrelations1().remove(dishrelations1);
		dishrelations1.setDish1(null);

		return dishrelations1;
	}

	public List<Dishrelation> getDishrelations2() {
		return this.dishrelations2;
	}

	public void setDishrelations2(List<Dishrelation> dishrelations2) {
		this.dishrelations2 = dishrelations2;
	}

	public Dishrelation addDishrelations2(Dishrelation dishrelations2) {
		getDishrelations2().add(dishrelations2);
		dishrelations2.setDish2(this);

		return dishrelations2;
	}

	public Dishrelation removeDishrelations2(Dishrelation dishrelations2) {
		getDishrelations2().remove(dishrelations2);
		dishrelations2.setDish2(null);

		return dishrelations2;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setDish(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setDish(null);

		return order;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public Tag addTag(Tag tag) {
		getTags().add(tag);
		tag.setDish(this);

		return tag;
	}

	public Tag removeTag(Tag tag) {
		getTags().remove(tag);
		tag.setDish(null);

		return tag;
	}

	@Override
	public long getId() {
		return this.getDishId();
	}

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isActive() {
		return this.active;
	}

	@Override
	public Portion getPortionType() {
		// TODO Auto-generated method stub
		return null;
	}

}