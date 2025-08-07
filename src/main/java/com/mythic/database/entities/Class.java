package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "classes")
public class Class {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManaRegenerationMethods() {
		return manaRegenerationMethods;
	}

	public void setManaRegenerationMethods(String manaRegenerationMethods) {
		this.manaRegenerationMethods = manaRegenerationMethods;
	}

	public String getStatsDescription() {
		return statsDescription;
	}

	public void setStatsDescription(String statsDescription) {
		this.statsDescription = statsDescription;
	}

}