package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "quests_locations")
public class QuestLocation extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MapID", nullable = false)
	private MapEntity mapID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "QuestID", nullable = false)
	private Quest questID;

	public MapEntity getMapID() {
		return mapID;
	}

	public QuestLocation setMapID(MapEntity mapID) {
		this.mapID = mapID;
		return this;
	}

	public Quest getQuestID() {
		return questID;
	}

	public QuestLocation setQuestID(Quest questID) {
		this.questID = questID;
		return this;
	}

}