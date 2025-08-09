package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "types_bans")
public class TypeBan extends EntityBase {

	@Column(name = "Name", nullable = false, length = 64)
	private String name;

	public String getName() {
		return name;
	}

	public TypeBan setName(String name) {
		this.name = name;
		return this;
	}

}