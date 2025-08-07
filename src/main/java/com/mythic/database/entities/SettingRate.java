package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "settings_rates")
public class SettingRate {

	@Id
	@Column(name = "Name", nullable = false, length = 50)
	private String name;

	@Column(name = "Value", nullable = false, length = 50)
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}