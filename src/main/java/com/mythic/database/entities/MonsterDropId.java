package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MonsterDropId implements Serializable {

	private static final long serialVersionUID = 1398969429128555364L;
	@Column(name = "ItemID", nullable = false)
	private Integer itemID;

	@Column(name = "MonsterID", nullable = false)
	private Integer monsterID;

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public Integer getMonsterID() {
		return monsterID;
	}

	public void setMonsterID(Integer monsterID) {
		this.monsterID = monsterID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		MonsterDropId entity = (MonsterDropId) o;
		return Objects.equals(this.itemID, entity.itemID) &&
			Objects.equals(this.monsterID, entity.monsterID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemID, monsterID);
	}

}