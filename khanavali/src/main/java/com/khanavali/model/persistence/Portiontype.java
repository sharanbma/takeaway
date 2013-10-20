package com.khanavali.model.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the portiontypes database table.
 * 
 */
@Entity
@Table(name="portiontypes")
@NamedQuery(name="Portiontype.findAll", query="SELECT p FROM Portiontype p")
public class Portiontype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int portionTypeId;

	private int portionType;

	private String portionTypeDescription;

	//bi-directional many-to-one association to Dish
	@OneToMany(mappedBy="portiontype")
	private List<Dish> dishs;

	public Portiontype() {
	}

	public int getPortionTypeId() {
		return this.portionTypeId;
	}

	public void setPortionTypeId(int portionTypeId) {
		this.portionTypeId = portionTypeId;
	}

	public int getPortionType() {
		return this.portionType;
	}

	public void setPortionType(int portionType) {
		this.portionType = portionType;
	}

	public String getPortionTypeDescription() {
		return this.portionTypeDescription;
	}

	public void setPortionTypeDescription(String portionTypeDescription) {
		this.portionTypeDescription = portionTypeDescription;
	}

	public List<Dish> getDishs() {
		return this.dishs;
	}

	public void setDishs(List<Dish> dishs) {
		this.dishs = dishs;
	}

	public Dish addDish(Dish dish) {
		getDishs().add(dish);
		dish.setPortiontype(this);

		return dish;
	}

	public Dish removeDish(Dish dish) {
		getDishs().remove(dish);
		dish.setPortiontype(null);

		return dish;
	}

}