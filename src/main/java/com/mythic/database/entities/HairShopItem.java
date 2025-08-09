package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "hairs_shops_items")
public class HairShopItem extends EntityBase {

	@Column(name = "Gender", nullable = false, length = 1)
	private String gender;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "HairID", nullable = false)
	private Hair hair;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ShopID", nullable = false)
	private HairShop shop;

}