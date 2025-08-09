package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "types_elements")
public class TypeElement extends EntityBase {

	@Column(name = "Name", nullable = false, length = 16)
	private String name;

	public String getName() {
		return name;
	}

	public TypeElement setName(String name) {
		this.name = name;
		return this;
	}

}