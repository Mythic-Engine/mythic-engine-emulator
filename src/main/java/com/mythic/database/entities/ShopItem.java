package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "shops_items")
public class ShopItem extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ShopID", nullable = false)
	private Shop shopID;

	@Column(name = "ItemID", nullable = false)
	private Integer itemID;

	@Column(name = "QuantityRemain", nullable = false)
	private Integer quantityRemain;

	public Shop getShopID() {
		return shopID;
	}

	public ShopItem setShopID(Shop shopID) {
		this.shopID = shopID;
		return this;
	}

	public Integer getItemID() {
		return itemID;
	}

	public ShopItem setItemID(Integer itemID) {
		this.itemID = itemID;
		return this;
	}

	public Integer getQuantityRemain() {
		return quantityRemain;
	}

	public ShopItem setQuantityRemain(Integer quantityRemain) {
		this.quantityRemain = quantityRemain;
		return this;
	}

}