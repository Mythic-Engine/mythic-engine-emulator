package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
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

	public MonsterEntity getMonsterID() {
		return monsterID;
	}

	public MonsterDrop setMonsterID(MonsterEntity monsterID) {
		this.monsterID = monsterID;
		return this;
	}

	public Item getItem() {
		return item;
	}

	public MonsterDrop setItem(Item item) {
		this.item = item;
		return this;
	}

	public Float getChance() {
		return chance;
	}

	public MonsterDrop setChance(Float chance) {
		this.chance = chance;
		return this;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public MonsterDrop setQuantity(Integer quantity) {
		this.quantity = quantity;
		return this;
	}

}