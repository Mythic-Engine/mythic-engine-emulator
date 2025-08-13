package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "hairs")
public class Hair extends EntityBase {

	@Column(name = "Gender", nullable = false, length = 1)
	private String gender;

	@Column(name = "Name", nullable = false, length = 16)
	private String name;

	@Column(name = "File", nullable = false, length = 64)
	private String file;

	public String getGender() {
		return gender;
	}

	public Hair setGender(String gender) {
		this.gender = gender;
		return this;
	}

	public String getName() {
		return name;
	}

	public Hair setName(String name) {
		this.name = name;
		return this;
	}

	public String getFile() {
		return file;
	}

	public Hair setFile(String file) {
		this.file = file;
		return this;
	}

}