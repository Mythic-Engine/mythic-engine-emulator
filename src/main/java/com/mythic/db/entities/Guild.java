/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import com.mythic.db.Database;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Guild implements Serializable {

	private Integer id;
	private String name;
	private String messageOfTheDay;
	private int maxMembers;
	private int hallSize;
	private Date lastUpdated;
	private Set<GuildHall> guildHalls = new HashSet<>(0);
	private Set<UserEntity> userEntities = new HashSet<>(0);

	public Guild() {
	}

	public Guild(String name, String messageOfTheDay, int maxMembers, int hallSize, Date lastUpdated) {
		this.name = name;
		this.messageOfTheDay = messageOfTheDay;
		this.maxMembers = maxMembers;
		this.hallSize = hallSize;
		this.lastUpdated = lastUpdated;
	}

	public Guild(String name, String messageOfTheDay, int maxMembers, int hallSize, Date lastUpdated, Set guildHalls, Set userEntities) {
		this.name = name;
		this.messageOfTheDay = messageOfTheDay;
		this.maxMembers = maxMembers;
		this.hallSize = hallSize;
		this.lastUpdated = lastUpdated;
		this.guildHalls = guildHalls;
		this.userEntities = userEntities;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessageOfTheDay() {
		return this.messageOfTheDay;
	}

	public void setMessageOfTheDay(String messageOfTheDay) {
		this.messageOfTheDay = messageOfTheDay;
	}

	public int getMaxMembers() {
		return this.maxMembers;
	}

	public void setMaxMembers(int maxMembers) {
		this.maxMembers = maxMembers;
	}

	public int getHallSize() {
		return this.hallSize;
	}

	public void setHallSize(int hallSize) {
		this.hallSize = hallSize;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public JSONObject getJSON() {
		JSONArray members = new JSONArray();
		Session session = Database.openSessionAndBegin();
		Guild guildEntity = (Guild) session.get(Guild.class, this.getId());
		JSONObject guild = new JSONObject()
			.element("Name", this.getName())
			.element("MOTD", this.getMessageOfTheDay())
			.element("pending", new JSONObject())
			.element("MaxMembers", this.getMaxMembers())
			.element("dateUpdated", DateFormatUtils.format(this.getLastUpdated(), "yyyy-MM-dd'T'HH:mm:ss"))
			.element("Level", 1)
			.element("HallSize", this.getHallSize())
			.element("guildHall", new JSONArray());

		for (UserEntity user : guildEntity.getUserEntities()) {
			members.element(
				new JSONObject()
					.element("ID", user.getId())
					.element("userName", user.getName())
					.element("Level", user.getLevel())
					.element("Rank", user.getGuildRank())
					.element("Server", user.getCurrentServer())
			);
		}

		guild.element("ul", members);
		Database.endSessionAndCommit(session);
		return guild;
	}

	public Set<GuildHall> getGuildHalls() {
		return this.guildHalls;
	}

	public void setGuildHalls(Set<GuildHall> guildHalls) {
		this.guildHalls = guildHalls;
	}

	public Set<UserEntity> getUserEntities() {
		return this.userEntities;
	}

	public void setUserEntities(Set<UserEntity> userEntities) {
		this.userEntities = userEntities;
	}

}
