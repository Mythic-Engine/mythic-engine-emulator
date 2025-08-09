package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "types_boosts")
public class TypeBoost extends EntityBase {

	@Column(name = "Name", nullable = false, length = 32)
	private String name;

}