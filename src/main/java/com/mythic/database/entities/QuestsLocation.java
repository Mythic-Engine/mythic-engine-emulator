package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "quests_locations")
public class QuestsLocation {

	@EmbeddedId
	private QuestsLocationId id;

	@MapsId("mapID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MapID", nullable = false)
	private Map mapID;

	@MapsId("questID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "QuestID", nullable = false)
	private Quest questID;

	public QuestsLocationId getId() {
		return id;
	}

	public void setId(QuestsLocationId id) {
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