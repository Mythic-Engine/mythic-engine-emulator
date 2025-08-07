package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CodeItemId implements Serializable {

	private static final long serialVersionUID = 7536727870253016269L;
	@Column(name = "ItemID", nullable = false)
	private Integer itemID;

	@Column(name = "CodeID", nullable = false)
	private Integer codeID;

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public Integer getCodeID() {
		return codeID;
	}

	public void setCodeID(Integer codeID) {
		this.codeID = codeID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		CodeItemId entity = (CodeItemId) o;
		return Objects.equals(this.itemID, entity.itemID) &&
			Objects.equals(this.codeID, entity.codeID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemID, codeID);
	}

}