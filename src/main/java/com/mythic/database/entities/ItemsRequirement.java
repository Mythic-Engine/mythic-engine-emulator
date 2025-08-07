package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "items_requirements")
public class ItemsRequirement {

	@EmbeddedId
	private ItemsRequirementId id;

	@Column(name = "Quantity", nullable = false)
	private Integer quantity;

	public ItemsRequirementId getId() {
		return id;
	}

	public void setId(ItemsRequirementId id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}