package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "maps_items")
public class MapsItem {

	@EmbeddedId
	private MapsItemId id;

	@MapsId("mapID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MapID", nullable = false)
	private Map mapID;

	public MapsItemId getId() {
		return id;
	}

	public void setId(MapsItemId id) {
		this.id = id;
	}

	public Map getMapID() {
		return mapID;
	}

	public void setMapID(Map mapID) {
		this.mapID = mapID;
	}

}