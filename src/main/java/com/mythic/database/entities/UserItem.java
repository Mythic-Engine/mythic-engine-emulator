package com.mythic.database.entities;

import com.mythic.database.base.UserEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "users_items")
public class UserItem extends UserEntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "EnhID", nullable = false)
	private Enhancement enhancement;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ItemID", nullable = false)
	private Item item;

	@Column(name = "Equipped", nullable = false)
	private Boolean equipped = false;

	@Column(name = "Quantity", nullable = false)
	private Integer quantity;

	@Column(name = "Bank", nullable = false)
	private Boolean bank = false;

	public Enhancement getEnhancement() {
		return enhancement;
	}

	public UserItem setEnhancement(Enhancement enhancement) {
		this.enhancement = enhancement;
		return this;
	}

	public Item getItem() {
		return item;
	}

	public UserItem setItem(Item item) {
		this.item = item;
		return this;
	}

	public Boolean getEquipped() {
		return equipped;
	}

	public UserItem setEquipped(Boolean equipped) {
		this.equipped = equipped;
		return this;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public UserItem setQuantity(Integer quantity) {
		this.quantity = quantity;
		return this;
	}

	public Boolean getBank() {
		return bank;
	}

	public UserItem setBank(Boolean bank) {
		this.bank = bank;
		return this;
	}

}