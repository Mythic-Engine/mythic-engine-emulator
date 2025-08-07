package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "codes_items")
public class CodeItem {

	@EmbeddedId
	private CodeItemId id;

	@MapsId("codeID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "CodeID", nullable = false)
	private Code codeID;

	public CodeItemId getId() {
		return id;
	}

	public void setId(CodeItemId id) {
		this.id = id;
	}

	public Code getCodeID() {
		return codeID;
	}

	public void setCodeID(Code codeID) {
		this.codeID = codeID;
	}

}