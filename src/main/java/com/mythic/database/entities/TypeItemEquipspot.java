package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "types_items_equip_spot")
public class TypeItemEquipSpot extends EntityBase {

	@Column(name = "Name", nullable = false, length = 8)
	private String name;

}