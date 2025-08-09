package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "maps_items")
public class MapItem extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MapID", nullable = false)
	private MapEntity mapID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ItemID", nullable = false)
	private Item item;

	public MapEntity getMapID() {
		return mapID;
	}

	public MapItem setMapID(MapEntity mapID) {
		this.mapID = mapID;
		return this;
	}

	public Item getItem() {
		return item;
	}

	public MapItem setItem(Item item) {
		this.item = item;
		return this;
	}

}