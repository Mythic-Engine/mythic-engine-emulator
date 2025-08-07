package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "shops_locations")
public class ShopsLocation {

	@EmbeddedId
	private ShopsLocationId id;

	@MapsId("mapID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MapID", nullable = false)
	private Map mapID;

	@MapsId("shopID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ShopID", nullable = false)
	private Shop shopID;

	public ShopsLocationId getId() {
		return id;
	}

	public void setId(ShopsLocationId id) {
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