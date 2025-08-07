package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "maps_monsters")
public class MapMonster {

	@EmbeddedId
	private MapMonsterId id;

	@MapsId("mapID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MapID", nullable = false)
	private MapEntity mapID;

	@MapsId("monsterID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MonsterID", nullable = false)
	private Monster monsterID;

	public MapMonsterId getId() {
		return id;
	}

	public void setId(MapMonsterId id) {
		this.id = id;
	}

	public MapEntity getMapID() {
		return mapID;
	}

	public void setMapID(MapEntity mapID) {
		this.mapID = mapID;
	}

	public Monster getMonsterID() {
		return monsterID;
	}

	public void setMonsterID(Monster monsterID) {
		this.monsterID = monsterID;
	}

}