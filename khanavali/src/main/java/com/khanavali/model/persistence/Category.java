package com.khanavali.model.persistence;

import java.io.Serializable;

import javax.persistence.*;

import com.khanavali.model.ICategory;

import java.util.List;


/**
 * The persistent class for the category database table.
 * 
 */
@Entity
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements ICategory,Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;

	private int category;

	private String categoryDescription;

	//bi-directional many-to-one association to Dish
	@OneToMany(mappedBy="category")
	private List<Dish> dishs;

	public Category() {
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getCategory() {
		return this.category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getCategoryDescription() {
		return this.categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public List<Dish> getDishs() {
		return this.dishs;
	}

	public void setDishs(List<Dish> dishs) {
		this.dishs = dishs;
	}

	public Dish addDish(Dish dish) {
		getDishs().add(dish);
		dish.setCategory(this);

		return dish;
	}

	public Dish removeDish(Dish dish) {
		getDishs().remove(dish);
		dish.setCategory(null);

		return dish;
	}

}