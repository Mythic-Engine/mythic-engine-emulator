package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "hairs_shops_items")
public class HairShopItem {

	@EmbeddedId
	private HairShopItemId id;

	@MapsId("hairID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "HairID", nullable = false)
	private Hair hairID;

	@MapsId("shopID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ShopID", nullable = false)
	private HairShop shopID;

	public HairShopItemId getId() {
		return id;
	}

	public void setId(HairShopItemId id) {
		this.id = id;
	}

	public Hair getHairID() {
		return hairID;
	}

	public void setHairID(Hair hairID) {
		this.hairID = hairID;
	}

	public HairShop getShopID() {
		return shopID;
	}

	public void setShopID(HairShop shopID) {
		this.shopID = shopID;
	}

}