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

}