package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "types_items")
public class TypesItem {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "EquipSpotTypeID", nullable = false)
	private TypesItemsEquipspot equipSpotTypeID;

	@Column(name = "Name", nullable = false, length = 64)
	private String name;

	@Column(name = "Icon", nullable = false, length = 32)
	private String icon;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TypesItemsEquipspot getEquipSpotTypeID() {
		return equipSpotTypeID;
	}

	public void setEquipSpotTypeID(TypesItemsEquipspot equipSpotTypeID) {
		this.equipSpotTypeID = equipSpotTypeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}