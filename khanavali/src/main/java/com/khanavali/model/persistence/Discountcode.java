package com.khanavali.model.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the discountcodes database table.
 * 
 */
@Entity
@Table(name="discountcodes")
@NamedQuery(name="Discountcode.findAll", query="SELECT d FROM Discountcode d")
public class Discountcode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int discountCodeId;

	private byte active;

	@Temporal(TemporalType.DATE)
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	private Date dateTo;

	private String discountCode;

	private double discountPercent;

	//bi-directional many-to-one association to Discount
	@OneToMany(mappedBy="discountcode")
	private List<Discount> discounts;

	public Discountcode() {
	}

	public int getDiscountCodeId() {
		return this.discountCodeId;
	}

	public void setDiscountCodeId(int discountCodeId) {
		this.discountCodeId = discountCodeId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public Date getDateFrom() {
		return this.dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return this.dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getDiscountCode() {
		return this.discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public double getDiscountPercent() {
		return this.discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public List<Discount> getDiscounts() {
		return this.discounts;
	}

	public void setDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
	}

	public Discount addDiscount(Discount discount) {
		getDiscounts().add(discount);
		discount.setDiscountcode(this);

		return discount;
	}

	public Discount removeDiscount(Discount discount) {
		getDiscounts().remove(discount);
		discount.setDiscountcode(null);

		return discount;
	}

}