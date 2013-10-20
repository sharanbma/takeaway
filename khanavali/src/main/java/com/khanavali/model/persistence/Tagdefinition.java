package com.khanavali.model.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tagdefinition database table.
 * 
 */
@Entity
@NamedQuery(name="Tagdefinition.findAll", query="SELECT t FROM Tagdefinition t")
public class Tagdefinition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tagDefinitionId;

	private String tag;

	//bi-directional many-to-one association to Tag
	@OneToMany(mappedBy="tagdefinition")
	private List<Tag> tags;

	public Tagdefinition() {
	}

	public int getTagDefinitionId() {
		return this.tagDefinitionId;
	}

	public void setTagDefinitionId(int tagDefinitionId) {
		this.tagDefinitionId = tagDefinitionId;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public Tag addTag(Tag tag) {
		getTags().add(tag);
		tag.setTagdefinition(this);

		return tag;
	}

	public Tag removeTag(Tag tag) {
		getTags().remove(tag);
		tag.setTagdefinition(null);

		return tag;
	}

}