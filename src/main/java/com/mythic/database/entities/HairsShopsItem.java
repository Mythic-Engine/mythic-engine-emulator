package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "hairs_shops_items")
public class HairsShopsItem {

	@EmbeddedId
	private HairsShopsItemId id;

	@MapsId("hairID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "HairID", nullable = false)
	private Hair hairID;

	@MapsId("shopID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ShopID", nullable = false)
	private HairsShop shopID;

	public HairsShopsItemId getId() {
		return id;
	}

	public void setId(HairsShopsItemId id) {
		this.id = id;
	}

	public Hair getHairID() {
		return hairID;
	}

	public void setHairID(Hair hairID) {
		this.hairID = hairID;
	}

	public HairsShop getShopID() {
		return shopID;
	}

	public void setShopID(HairsShop shopID) {
		this.shopID = shopID;
	}

}