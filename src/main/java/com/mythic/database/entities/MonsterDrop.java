package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "monsters_drops")
public class MonsterDrop extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MonsterID", nullable = false)
	private MonsterEntity monsterID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ItemID", nullable = false)
	private Item item;

	@Column(name = "Chance", nullable = false)
	private Float chance;

	@Column(name = "Quantity", nullable = false)
	private Integer quantity;

}