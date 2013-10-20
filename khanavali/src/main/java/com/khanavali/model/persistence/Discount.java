package com.khanavali.model.persistence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the discounts database table.
 * 
 */
@Entity
@Table(name="discounts")
@NamedQuery(name="Discount.findAll", query="SELECT d FROM Discount d")
public class Discount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int discountId;

	//bi-directional many-to-one association to Discountcode
	@ManyToOne
	@JoinColumn(name="discountCountId")
	private Discountcode discountcode;

	//bi-directional many-to-one association to Dish
	@ManyToOne
	@JoinColumn(name="dishId")
	private Dish dish;

	public Discount() {
	}

	public int getDiscountId() {
		return this.discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}

	public Discountcode getDiscountcode() {
		return this.discountcode;
	}

	public void setDiscountcode(Discountcode discountcode) {
		this.discountcode = discountcode;
	}

	public Dish getDish() {
		return this.dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

}