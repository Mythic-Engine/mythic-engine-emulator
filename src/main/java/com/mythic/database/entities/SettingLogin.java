package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "settings_login")
public class SettingLogin extends EntityBase {

	@Column(name = "Name", nullable = false, length = 50)
	private String name;

	@Column(name = "Value", nullable = false, length = 50)
	private String value;

	public String getName() {
		return name;
	}

	public SettingLogin setName(String name) {
		this.name = name;
		return this;
	}

	public String getValue() {
		return value;
	}

	public SettingLogin setValue(String value) {
		this.value = value;
		return this;
	}

}