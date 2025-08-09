package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "quests_rewards")
public class QuestReward extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "QuestID", nullable = false)
	private Quest questID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ItemID", nullable = false)
	private Item item;

	@Column(name = "Quantity", nullable = false)
	private Integer quantity;

	public Quest getQuestID() {
		return questID;
	}

	public QuestReward setQuestID(Quest questID) {
		this.questID = questID;
		return this;
	}

	public Item getItem() {
		return item;
	}

	public QuestReward setItem(Item item) {
		this.item = item;
		return this;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public QuestReward setQuantity(Integer quantity) {
		this.quantity = quantity;
		return this;
	}

}