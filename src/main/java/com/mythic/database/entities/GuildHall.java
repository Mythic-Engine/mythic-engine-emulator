package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "guilds_halls")
public class GuildHall extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "GuildID", nullable = false)
	private Guild guild;

	@Column(name = "Linkage", nullable = false, length = 64)
	private String linkage;

	@Column(name = "Cell", nullable = false, length = 16)
	private String cell;

	@Column(name = "X", nullable = false)
	private Float x;

	@Column(name = "Y", nullable = false)
	private Float y;

	@Lob
	@Column(name = "Interior", nullable = false)
	private String interior;

}