package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MapsMonsterId implements Serializable {

	private static final long serialVersionUID = 923598743011825256L;
	@Column(name = "Frame", nullable = false, length = 16)
	private String frame;

	@Column(name = "MapID", nullable = false)
	private Integer mapID;

	@Column(name = "MonMapID", nullable = false)
	private Integer monMapID;

	@Column(name = "MonsterID", nullable = false)
	private Integer monsterID;

	public String getFrame() {
		return frame;
	}

	public void setFrame(String frame) {
		this.frame = frame;
	}

	public Integer getMapID() {
		return mapID;
	}

	public void setMapID(Integer mapID) {
		this.mapID = mapID;
	}

	public Integer getMonMapID() {
		return monMapID;
	}

	public void setMonMapID(Integer monMapID) {
		this.monMapID = monMapID;
	}

	public Integer getMonsterID() {
		return monsterID;
	}

	public void setMonsterID(Integer monsterID) {
		this.monsterID = monsterID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		MapsMonsterId entity = (MapsMonsterId) o;
		return Objects.equals(this.monsterID, entity.monsterID) &&
			Objects.equals(this.monMapID, entity.monMapID) &&
			Objects.equals(this.mapID, entity.mapID) &&
			Objects.equals(this.frame, entity.frame);
	}

	@Override
	public int hashCode() {
		return Objects.hash(monsterID, monMapID, mapID, frame);
	}

}