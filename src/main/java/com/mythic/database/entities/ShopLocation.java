package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "shops_locations")
public class ShopLocation extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MapID", nullable = false)
	private MapEntity mapID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ShopID", nullable = false)
	private Shop shopID;

	public MapEntity getMapID() {
		return mapID;
	}

	public ShopLocation setMapID(MapEntity mapID) {
		this.mapID = mapID;
		return this;
	}

	public Shop getShopID() {
		return shopID;
	}

	public ShopLocation setShopID(Shop shopID) {
		this.shopID = shopID;
		return this;
	}

}