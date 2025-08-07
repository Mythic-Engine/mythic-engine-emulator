package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class QuestLocationId implements Serializable {

	private static final long serialVersionUID = -2726907318324058862L;
	@Column(name = "MapID", nullable = false)
	private Integer mapID;

	@Column(name = "QuestID", nullable = false)
	private Integer questID;

	public Integer getMapID() {
		return mapID;
	}

	public void setMapID(Integer mapID) {
		this.mapID = mapID;
	}

	public Integer getQuestID() {
		return questID;
	}

	public void setQuestID(Integer questID) {
		this.questID = questID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		QuestLocationId entity = (QuestLocationId) o;
		return Objects.equals(this.questID, entity.questID) &&
			Objects.equals(this.mapID, entity.mapID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(questID, mapID);
	}

}