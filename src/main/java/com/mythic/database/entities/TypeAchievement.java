package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "types_achievements")
public class TypeAchievement extends EntityBase {

	@Column(name = "Name", nullable = false, length = 3)
	private String name;

	@Column(name = "FullName", nullable = false, length = 64)
	private String fullName;

	public String getName() {
		return name;
	}

	public TypeAchievement setName(String name) {
		this.name = name;
		return this;
	}

	public String getFullName() {
		return fullName;
	}

	public TypeAchievement setFullName(String fullName) {
		this.fullName = fullName;
		return this;
	}

}