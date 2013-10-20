package com.khanavali.model.persistence;

import java.io.Serializable;

import javax.persistence.*;

import com.khanavali.model.ITag;


/**
 * The persistent class for the tags database table.
 * 
 */
@Entity
@Table(name="tags")
@NamedQuery(name="Tag.findAll", query="SELECT t FROM Tag t")
public class Tag implements ITag,Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tagId;

	//bi-directional many-to-one association to Dish
	@ManyToOne
	@JoinColumn(name="dishId")
	private Dish dish;

	//bi-directional many-to-one association to Tagdefinition
	@ManyToOne
	@JoinColumn(name="tagDefinitionId")
	private Tagdefinition tagdefinition;

	public Tag() {
	}

	public int getTagId() {
		return this.tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public Dish getDish() {
		return this.dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	public Tagdefinition getTagdefinition() {
		return this.tagdefinition;
	}

	public void setTagdefinition(Tagdefinition tagdefinition) {
		this.tagdefinition = tagdefinition;
	}

	@Override
	public String getTag() {
		return this.tagdefinition.getTag();
	}

}