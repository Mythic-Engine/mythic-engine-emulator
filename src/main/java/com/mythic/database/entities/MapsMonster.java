package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "maps_monsters")
public class MapsMonster {

	@EmbeddedId
	private MapsMonsterId id;

	@MapsId("mapID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MapID", nullable = false)
	private Map mapID;

	@MapsId("monsterID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MonsterID", nullable = false)
	private Monster monsterID;

	public MapsMonsterId getId() {
		return id;
	}

	public void setId(MapsMonsterId id) {
		this.id = id;
	}

	public Map getMapID() {
		return mapID;
	}

	public void setMapID(Map mapID) {
		this.mapID = mapID;
	}

	public Monster getMonsterID() {
		return monsterID;
	}

	public void setMonsterID(Monster monsterID) {
		this.monsterID = monsterID;
	}

}