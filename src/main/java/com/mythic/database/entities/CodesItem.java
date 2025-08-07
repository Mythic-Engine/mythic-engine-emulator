package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "codes_items")
public class CodesItem {

	@EmbeddedId
	private CodesItemId id;

	@MapsId("codeID")
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "CodeID", nullable = false)
	private Code codeID;

	public CodesItemId getId() {
		return id;
	}

	public void setId(CodesItemId id) {
		this.id = id;
	}

	public Code getCodeID() {
		return codeID;
	}

	public void setCodeID(Code codeID) {
		this.codeID = codeID;
	}

}