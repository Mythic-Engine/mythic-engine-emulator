package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "shops_locations")
public class ShopLocation {

	@EmbeddedId
	private ShopLocationId id;

	@MapsId("mapID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MapID", nullable = false)
	private Map mapID;

	@MapsId("shopID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ShopID", nullable = false)
	private Shop shopID;

	public ShopLocationId getId() {
		return id;
	}

	public void setId(ShopLocationId id) {
		this.id = id;
	}

	public Map getMapID() {
		return mapID;
	}

	public void setMapID(Map mapID) {
		this.mapID = mapID;
	}

	public Shop getShopID() {
		return shopID;
	}

	public void setShopID(Shop shopID) {
		this.shopID = shopID;
	}

}