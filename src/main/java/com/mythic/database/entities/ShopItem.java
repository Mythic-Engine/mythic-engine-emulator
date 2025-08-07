package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "shops_items")
public class ShopItem {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ShopID", nullable = false)
	private Shop shopID;

	@Column(name = "ItemID", nullable = false)
	private Integer itemID;

	@Column(name = "QuantityRemain", nullable = false)
	private Integer quantityRemain;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Shop getShopID() {
		return shopID;
	}

	public void setShopID(Shop shopID) {
		this.shopID = shopID;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public Integer getQuantityRemain() {
		return quantityRemain;
	}

	public void setQuantityRemain(Integer quantityRemain) {
		this.quantityRemain = quantityRemain;
	}

}