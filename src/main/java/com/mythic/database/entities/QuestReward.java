package com.mythic.database.entities;

import com.mythic.database.EntityBase;
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

}