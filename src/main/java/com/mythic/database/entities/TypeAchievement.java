package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "types_achievements")
public class TypeAchievement extends EntityBase {

	public static final int AC_ITEM_PURCHASE = 1;
	public static final int AC_ITEM_SELLBACK = 2;
	public static final int ITEM_PURCHASE = 3;
	public static final int ITEM_SELLBACK = 4;
	public static final int ITEM_REMOVE = 5;
	public static final int INVENTORY_TO_BANK = 7;
	public static final int BANK_INVENTORY_SWAP = 8;
	public static final int BANK_TO_INVENTORY = 9;

	@Column(name = "Name", nullable = false, length = 3)
	private String name;

	@Column(name = "FullName", nullable = false, length = 64)
	private String fullName;

	public String getName() {
		return name;
	}

	public TypeAchievement setName(String name) {
		this.name = name;
		return this;
	}

	public String getFullName() {
		return fullName;
	}

	public TypeAchievement setFullName(String fullName) {
		this.fullName = fullName;
		return this;
	}

}