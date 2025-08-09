package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "quests_chains")
public class QuestChain extends EntityBase {

	@Column(name = "Name", nullable = false, length = 128)
	private String name;

	public String getName() {
		return name;
	}

	public QuestChain setName(String name) {
		this.name = name;
		return this;
	}

}