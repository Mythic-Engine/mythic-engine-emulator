package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MapsItemId implements Serializable {

	private static final long serialVersionUID = -5476858481552700165L;
	@Column(name = "MapID", nullable = false)
	private Integer mapID;

	@Column(name = "ItemID", nullable = false)
	private Integer itemID;

	public Integer getMapID() {
		return mapID;
	}

	public void setMapID(Integer mapID) {
		this.mapID = mapID;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		MapsItemId entity = (MapsItemId) o;
		return Objects.equals(this.itemID, entity.itemID) &&
			Objects.equals(this.mapID, entity.mapID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemID, mapID);
	}

}