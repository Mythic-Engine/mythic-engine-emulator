package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "hairs_shops")
public class HairShop extends EntityBase {

	@Column(name = "Name", nullable = false, length = 32)
	private String name;

	public String getName() {
		return name;
	}

	public HairShop setName(String name) {
		this.name = name;
		return this;
	}

}