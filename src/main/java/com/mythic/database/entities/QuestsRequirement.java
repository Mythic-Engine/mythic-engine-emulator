package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "quests_requirements")
public class QuestsRequirement {

	@EmbeddedId
	private QuestsRequirementId id;

	@MapsId("questID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "QuestID", nullable = false)
	private Quest questID;

	@Column(name = "Quantity")
	private Integer quantity;

	public QuestsRequirementId getId() {
		return id;
	}

	public void setId(QuestsRequirementId id) {
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