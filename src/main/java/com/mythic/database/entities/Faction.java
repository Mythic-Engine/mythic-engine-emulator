package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "factions")
public class Faction extends EntityBase {

	@Column(name = "Name", nullable = false, length = 20)
	private String name;

}