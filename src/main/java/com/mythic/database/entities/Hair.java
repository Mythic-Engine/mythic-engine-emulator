package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "hairs")
public class Hair extends EntityBase {

	@Column(name = "Gender", nullable = false, length = 1)
	private String gender;

	@Column(name = "Name", nullable = false, length = 16)
	private String name;

	@Column(name = "File", nullable = false, length = 64)
	private String file;

	@Column(name = "LastModified", nullable = false)
	private Instant lastModified;

}