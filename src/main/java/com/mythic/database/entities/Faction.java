package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "factions")
public class Faction extends EntityBase {

	@Column(name = "Name", nullable = false, length = 20)
	private String name;

	public String getName() {
		return name;
	}

	public Faction setName(String name) {
		this.name = name;
		return this;
	}

}