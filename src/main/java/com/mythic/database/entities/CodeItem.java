package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "codes_items")
public class CodeItem extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "CodeID", nullable = false)
	private Code code;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ItemID", nullable = false)
	private Item item;

	public Code getCode() {
		return code;
	}

	public CodeItem setCode(Code code) {
		this.code = code;
		return this;
	}

}