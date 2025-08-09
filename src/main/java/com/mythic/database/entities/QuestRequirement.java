package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "quests_requirements")
public class QuestRequirement extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "QuestID", nullable = false)
	private Quest questID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ItemID", nullable = false)
	private Item item;

	@Column(name = "Quantity")
	private Integer quantity;

	public Quest getQuestID() {
		return questID;
	}

	public QuestRequirement setQuestID(Quest questID) {
		this.questID = questID;
		return this;
	}

	public Item getItem() {
		return item;
	}

	public QuestRequirement setItem(Item item) {
		this.item = item;
		return this;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public QuestRequirement setQuantity(Integer quantity) {
		this.quantity = quantity;
		return this;
	}

}