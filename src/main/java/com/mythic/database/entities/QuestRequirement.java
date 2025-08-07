package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "quests_requirements")
public class QuestRequirement {

	@EmbeddedId
	private QuestRequirementId id;

	@MapsId("questID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "QuestID", nullable = false)
	private Quest questID;

	@Column(name = "Quantity")
	private Integer quantity;

	public QuestRequirementId getId() {
		return id;
	}

	public void setId(QuestRequirementId id) {
		this.id = id;
	}

	public Quest getQuestID() {
		return questID;
	}

	public void setQuestID(Quest questID) {
		this.questID = questID;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}