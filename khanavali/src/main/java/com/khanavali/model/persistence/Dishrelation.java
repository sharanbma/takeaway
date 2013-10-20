package com.khanavali.model.persistence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dishrelations database table.
 * 
 */
@Entity
@Table(name="dishrelations")
@NamedQuery(name="Dishrelation.findAll", query="SELECT d FROM Dishrelation d")
public class Dishrelation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dishRelationId;

	//bi-directional many-to-one association to Dish
	@ManyToOne
	@JoinColumn(name="dishId")
	private Dish dish1;

	//bi-directional many-to-one association to Dish
	@ManyToOne
	@JoinColumn(name="relatedDishId")
	private Dish dish2;

	public Dishrelation() {
	}

	public int getDishRelationId() {
		return this.dishRelationId;
	}

	public void setDishRelationId(int dishRelationId) {
		this.dishRelationId = dishRelationId;
	}

	public Dish getDish1() {
		return this.dish1;
	}

	public void setDish1(Dish dish1) {
		this.dish1 = dish1;
	}

	public Dish getDish2() {
		return this.dish2;
	}

	public void setDish2(Dish dish2) {
		this.dish2 = dish2;
	}

}