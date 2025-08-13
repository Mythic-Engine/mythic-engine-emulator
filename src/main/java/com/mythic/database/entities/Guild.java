package com.mythic.database.entities;

import com.mythic.database.Database;
import com.mythic.database.base.EntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.time.DateFormatUtils;
import org.hibernate.Session;

import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "guilds")
public class Guild extends EntityBase {

	@Column(name = "Name", nullable = false, length = 64)
	private String name;

	@Column(name = "MessageOfTheDay", nullable = false, length = 512)
	private String messageOfTheDay;

	@Column(name = "MaxMembers", nullable = false)
	private Integer maxMembers;

	@Column(name = "HallSize", nullable = false)
	private Integer hallSize;

	public String getName() {
		return name;
	}

	public Guild setName(String name) {
		this.name = name;
		return this;
	}

	public String getMessageOfTheDay() {
		return messageOfTheDay;
	}

	public Guild setMessageOfTheDay(String messageOfTheDay) {
		this.messageOfTheDay = messageOfTheDay;
		return this;
	}

	public Integer getMaxMembers() {
		return maxMembers;
	}

	public Guild setMaxMembers(Integer maxMembers) {
		this.maxMembers = maxMembers;
		return this;
	}

	public Integer getHallSize() {
		return hallSize;
	}

	public Guild setHallSize(Integer hallSize) {
		this.hallSize = hallSize;
		return this;
	}
	
	//region JSON
	public JSONObject getJSON() {
		JSONArray members = new JSONArray();
		
		Session session = Database.openSessionAndBegin();
		
		Guild guildEntity = session.get(Guild.class, this.getId());
		
		JSONObject guild = new JSONObject()
			.element("Name", this.getName())
			.element("MOTD", this.getMessageOfTheDay())
			.element("pending", new JSONObject())
			.element("MaxMembers", this.getMaxMembers())
			.element("dateUpdated", this.getDateUpdated().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")))
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
	
	//endregion
	

}