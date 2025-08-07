package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "quests_rewards")
public class QuestReward {

	@EmbeddedId
	private QuestRewardId id;

	@MapsId("questID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "QuestID", nullable = false)
	private Quest questID;

	@Column(name = "Quantity", nullable = false)
	private Integer quantity;

	public QuestRewardId getId() {
		return id;
	}

	public void setId(QuestRewardId id) {
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