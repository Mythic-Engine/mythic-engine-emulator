package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "types_logs")
public class TypeLog {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "Name", nullable = false, length = 32)
	private String name;

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

}