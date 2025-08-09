package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "settings_rates")
public class SettingRate extends EntityBase {

	@Id
	@Column(name = "Name", nullable = false, length = 50)
	private String name;

	@Column(name = "Value", nullable = false, length = 50)
	private String value;

}