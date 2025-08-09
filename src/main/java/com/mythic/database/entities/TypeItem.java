package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "types_items")
public class TypeItem extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "EquipSpotTypeID", nullable = false)
	private TypeItemEquipSpot equipSpotTypeID;

	@Column(name = "Name", nullable = false, length = 64)
	private String name;

	@Column(name = "Icon", nullable = false, length = 32)
	private String icon;

}