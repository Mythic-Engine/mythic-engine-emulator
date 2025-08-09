package com.mythic.database.entities;

import com.mythic.database.EntityBase;
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

}