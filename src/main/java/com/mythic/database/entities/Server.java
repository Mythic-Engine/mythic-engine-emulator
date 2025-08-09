package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
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

	@Column(name = "IP", nullable = false)
	private Integer port;

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

	public String getName() {
		return name;
	}

	public Server setName(String name) {
		this.name = name;
		return this;
	}

	public String getIp() {
		return ip;
	}

	public Server setIp(String ip) {
		this.ip = ip;
		return this;
	}

	public Integer getPort() {
		return port;
	}

	public Server setPort(Integer port) {
		this.port = port;
		return this;
	}

	public Boolean getOnline() {
		return online;
	}

	public Server setOnline(Boolean online) {
		this.online = online;
		return this;
	}

	public Boolean getUpgrade() {
		return upgrade;
	}

	public Server setUpgrade(Boolean upgrade) {
		this.upgrade = upgrade;
		return this;
	}

	public Boolean getChat() {
		return chat;
	}

	public Server setChat(Boolean chat) {
		this.chat = chat;
		return this;
	}

	public Integer getCount() {
		return count;
	}

	public Server setCount(Integer count) {
		this.count = count;
		return this;
	}

	public Integer getMax() {
		return max;
	}

	public Server setMax(Integer max) {
		this.max = max;
		return this;
	}

	public String getMotd() {
		return motd;
	}

	public Server setMotd(String motd) {
		this.motd = motd;
		return this;
	}

}