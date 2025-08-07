package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "items_requirements")
public class ItemRequirement {

	@EmbeddedId
	private ItemRequirementId id;

	@Column(name = "Quantity", nullable = false)
	private Integer quantity;

	public ItemRequirementId getId() {
		return id;
	}

	public void setId(ItemRequirementId id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}