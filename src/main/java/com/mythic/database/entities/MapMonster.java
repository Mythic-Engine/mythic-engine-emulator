package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "maps_monsters")
public class MapMonster extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MapID", nullable = false)
	private MapEntity mapID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MonsterID", nullable = false)
	private MonsterEntity monsterID;

	@Column(name = "Frame", nullable = false, length = 16)
	private String frame;

	@Column(name = "MonMapID", nullable = false)
	private Integer monMapID;

	public MapEntity getMapID() {
		return mapID;
	}

	public MapMonster setMapID(MapEntity mapID) {
		this.mapID = mapID;
		return this;
	}

	public MonsterEntity getMonsterID() {
		return monsterID;
	}

	public MapMonster setMonsterID(MonsterEntity monsterID) {
		this.monsterID = monsterID;
		return this;
	}

	public String getFrame() {
		return frame;
	}

	public MapMonster setFrame(String frame) {
		this.frame = frame;
		return this;
	}

	public Integer getMonMapID() {
		return monMapID;
	}

	public MapMonster setMonMapID(Integer monMapID) {
		this.monMapID = monMapID;
		return this;
	}

}