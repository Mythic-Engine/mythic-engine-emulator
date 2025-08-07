package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ShopsLocationId implements Serializable {

	private static final long serialVersionUID = -3581200308066224167L;
	@Column(name = "MapID", nullable = false)
	private Integer mapID;

	@Column(name = "ShopID", nullable = false)
	private Integer shopID;

	public Integer getMapID() {
		return mapID;
	}

	public void setMapID(Integer mapID) {
		this.mapID = mapID;
	}

	public Integer getShopID() {
		return shopID;
	}

	public void setShopID(Integer shopID) {
		this.shopID = shopID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		ShopsLocationId entity = (ShopsLocationId) o;
		return Objects.equals(this.mapID, entity.mapID) &&
			Objects.equals(this.shopID, entity.shopID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mapID, shopID);
	}

}