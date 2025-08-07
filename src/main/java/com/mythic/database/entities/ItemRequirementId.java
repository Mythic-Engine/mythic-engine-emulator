package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ItemRequirementId implements Serializable {

	private static final long serialVersionUID = 9002467430824055820L;
	@Column(name = "ItemID", nullable = false)
	private Integer itemID;

	@Column(name = "ReqItemID", nullable = false)
	private Integer reqItemID;

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public Integer getReqItemID() {
		return reqItemID;
	}

	public void setReqItemID(Integer reqItemID) {
		this.reqItemID = reqItemID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		ItemRequirementId entity = (ItemRequirementId) o;
		return Objects.equals(this.itemID, entity.itemID) &&
			Objects.equals(this.reqItemID, entity.reqItemID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemID, reqItemID);
	}

}