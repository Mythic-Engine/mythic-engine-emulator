package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "items_requirements")
public class ItemRequirement extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ItemID", nullable = false)
	private Item item;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ReqItemID", nullable = false)
	private Item reqItem;

	@Column(name = "Quantity", nullable = false)
	private Integer quantity;

	public Item getItem() {
		return item;
	}

	public ItemRequirement setItem(Item item) {
		this.item = item;
		return this;
	}

	public Item getReqItem() {
		return reqItem;
	}

	public ItemRequirement setReqItem(Item reqItem) {
		this.reqItem = reqItem;
		return this;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public ItemRequirement setQuantity(Integer quantity) {
		this.quantity = quantity;
		return this;
	}

}