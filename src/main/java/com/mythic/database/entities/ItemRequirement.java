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

}