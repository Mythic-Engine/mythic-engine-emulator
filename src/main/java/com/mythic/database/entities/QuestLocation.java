package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "quests_locations")
public class QuestLocation {

	@EmbeddedId
	private QuestLocationId id;

	@MapsId("mapID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MapID", nullable = false)
	private Map mapID;

	@MapsId("questID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "QuestID", nullable = false)
	private Quest questID;

	public QuestLocationId getId() {
		return id;
	}

	public void setId(QuestLocationId id) {
		this.id = id;
	}

	public Map getMapID() {
		return mapID;
	}

	public void setMapID(Map mapID) {
		this.mapID = mapID;
	}

	public Quest getQuestID() {
		return questID;
	}

	public void setQuestID(Quest questID) {
		this.questID = questID;
	}

}