package com.mythic.database.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "users_items")
public class UserItem {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "EnhID", nullable = false)
	private Enhancement enhID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "UserID", nullable = false)
	private UserEntity userID;

	@Column(name = "ItemID", nullable = false)
	private Integer itemID;

	@Column(name = "Equipped", nullable = false)
	private Boolean equipped = false;

	@Column(name = "Quantity", nullable = false)
	private Integer quantity;

	@Column(name = "Bank", nullable = false)
	private Boolean bank = false;

	@Column(name = "DatePurchased")
	private Instant datePurchased;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Enhancement getEnhID() {
		return enhID;
	}

	public void setEnhID(Enhancement enhID) {
		this.enhID = enhID;
	}

	public UserEntity getUserID() {
		return userID;
	}

	public void setUserID(UserEntity userID) {
		this.userID = userID;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public Boolean getEquipped() {
		return equipped;
	}

	public void setEquipped(Boolean equipped) {
		this.equipped = equipped;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Boolean getBank() {
		return bank;
	}

	public void setBank(Boolean bank) {
		this.bank = bank;
	}

	public Instant getDatePurchased() {
		return datePurchased;
	}

	public void setDatePurchased(Instant datePurchased) {
		this.datePurchased = datePurchased;
	}

}