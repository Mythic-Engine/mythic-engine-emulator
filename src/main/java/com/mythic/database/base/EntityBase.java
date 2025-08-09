package com.mythic.database.base;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@MappedSuperclass
public class EntityBase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@CreationTimestamp
	@Column(name = "date_created", updatable = false)
	private LocalDateTime dateCreated;

	@UpdateTimestamp
	@Column(name = "date_updated")
	private LocalDateTime dateUpdated;

	@Column(name = "date_deleted")
	private LocalDateTime dateDeleted;

	public Integer id() {
		return id;
	}

	public EntityBase setId(Integer id) {
		this.id = id;
		return this;
	}

	public LocalDateTime dateCreated() {
		return dateCreated;
	}

	public EntityBase setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
		return this;
	}

	public LocalDateTime dateUpdated() {
		return dateUpdated;
	}

	public EntityBase setDateUpdated(LocalDateTime dateUpdated) {
		this.dateUpdated = dateUpdated;
		return this;
	}

	public LocalDateTime dateDeleted() {
		return dateDeleted;
	}

	public EntityBase setDateDeleted(LocalDateTime dateDeleted) {
		this.dateDeleted = dateDeleted;
		return this;
	}

}
