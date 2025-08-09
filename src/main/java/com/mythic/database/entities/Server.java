package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "servers")
public class Server extends EntityBase {

	@Column(name = "Name", nullable = false, length = 64)
	private String name;

	@Column(name = "IP", nullable = false, length = 15)
	private String ip;

	@Column(name = "Online", nullable = false)
	private Boolean online = false;

	@Column(name = "Upgrade", nullable = false)
	private Boolean upgrade = false;

	@Column(name = "Chat", nullable = false)
	private Boolean chat = false;

	@Column(name = "Count", nullable = false)
	private Integer count;

	@Column(name = "Max", nullable = false)
	private Integer max;

	@Lob
	@Column(name = "MOTD", nullable = false)
	private String motd;

}