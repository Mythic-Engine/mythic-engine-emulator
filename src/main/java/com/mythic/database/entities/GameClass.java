package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "classes")
public class GameClass extends EntityBase {

	@Column(name = "Category", nullable = false, length = 2)
	private String category;

	@Lob
	@Column(name = "Description", nullable = false)
	private String description;

	@Lob
	@Column(name = "ManaRegenerationMethods", nullable = false)
	private String manaRegenerationMethods;

	@Lob
	@Column(name = "StatsDescription", nullable = false)
	private String statsDescription;

	public String getCategory() {
		return category;
	}

	public GameClass setCategory(String category) {
		this.category = category;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public GameClass setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getManaRegenerationMethods() {
		return manaRegenerationMethods;
	}

	public GameClass setManaRegenerationMethods(String manaRegenerationMethods) {
		this.manaRegenerationMethods = manaRegenerationMethods;
		return this;
	}

	public String getStatsDescription() {
		return statsDescription;
	}

	public GameClass setStatsDescription(String statsDescription) {
		this.statsDescription = statsDescription;
		return this;
	}

}