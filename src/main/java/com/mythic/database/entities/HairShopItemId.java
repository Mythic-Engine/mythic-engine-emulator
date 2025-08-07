package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class HairShopItemId implements Serializable {

	private static final long serialVersionUID = -2540859015480668186L;
	@Column(name = "Gender", nullable = false, length = 1)
	private String gender;

	@Column(name = "HairID", nullable = false)
	private Integer hairID;

	@Column(name = "ShopID", nullable = false)
	private Integer shopID;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getHairID() {
		return hairID;
	}

	public void setHairID(Integer hairID) {
		this.hairID = hairID;
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
		HairShopItemId entity = (HairShopItemId) o;
		return Objects.equals(this.gender, entity.gender) &&
			Objects.equals(this.shopID, entity.shopID) &&
			Objects.equals(this.hairID, entity.hairID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(gender, shopID, hairID);
	}

}