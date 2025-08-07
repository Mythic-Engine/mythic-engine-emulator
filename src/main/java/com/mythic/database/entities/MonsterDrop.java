package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "monsters_drops")
public class MonsterDrop {

	@EmbeddedId
	private MonsterDropId id;

	@MapsId("monsterID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "MonsterID", nullable = false)
	private Monster monsterID;

	@Column(name = "Chance", nullable = false)
	private Float chance;

	@Column(name = "Quantity", nullable = false)
	private Integer quantity;

	public MonsterDropId getId() {
		return id;
	}

	public void setId(MonsterDropId id) {
		this.id = id;
	}

	public Monster getMonsterID() {
		return monsterID;
	}

	public void setMonsterID(Monster monsterID) {
		this.monsterID = monsterID;
	}

	public Float getChance() {
		return chance;
	}

	public void setChance(Float chance) {
		this.chance = chance;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}