package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "types_achievements")
public class TypesAchievement {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "Name", nullable = false, length = 3)
	private String name;

	@Column(name = "FullName", nullable = false, length = 64)
	private String fullName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}