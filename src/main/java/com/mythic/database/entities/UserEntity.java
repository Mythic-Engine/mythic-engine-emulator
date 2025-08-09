package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "users")
public class UserEntity extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "GuildID", nullable = false)
	private Guild guild;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "HairID", nullable = false)
	private Hair hair;

	@Column(name = "Name", nullable = false, length = 32)
	private String name;

	@Column(name = "Password", nullable = false, length = 17)
	private String password;

	@Column(name = "Access", nullable = false)
	private Integer access;

	@Column(name = "ActivationFlag", nullable = false)
	private Integer activationFlag;

	@Column(name = "PermamuteFlag", nullable = false)
	private Boolean permamuteFlag = false;

	@Column(name = "Country", nullable = false, length = 2)
	private String country;

	@Column(name = "Age", nullable = false)
	private Integer age;

	@Column(name = "Gender", nullable = false, length = 1)
	private String gender;

	@Column(name = "Email", nullable = false, length = 64)
	private String email;

	@Column(name = "Level", nullable = false)
	private Integer level;

	@Column(name = "Gold", nullable = false)
	private Integer gold;

	@Column(name = "Coins", nullable = false)
	private Integer coins;

	@Column(name = "Exp", nullable = false)
	private Integer exp;

	@Column(name = "ColorHair", nullable = false, length = 6)
	private String colorHair;

	@Column(name = "ColorSkin", nullable = false, length = 6)
	private String colorSkin;

	@Column(name = "ColorEye", nullable = false, length = 6)
	private String colorEye;

	@Column(name = "ColorBase", nullable = false, length = 6)
	private String colorBase;

	@Column(name = "ColorTrim", nullable = false, length = 6)
	private String colorTrim;

	@Column(name = "ColorAccessory", nullable = false, length = 6)
	private String colorAccessory;

	@Column(name = "GuildRank", nullable = false)
	private Integer guildRank;

	@Column(name = "SlotsBag", nullable = false)
	private Integer slotsBag;

	@Column(name = "SlotsBank", nullable = false)
	private Integer slotsBank;

	@Column(name = "SlotsHouse", nullable = false)
	private Integer slotsHouse;

	@Column(name = "DateCreated", nullable = false)
	private Instant dateCreated;

	@Column(name = "LastUpdated", nullable = false)
	private Instant lastUpdated;

	@Column(name = "UpgradeExpire", nullable = false)
	private Instant upgradeExpire;

	@Column(name = "UpgradeDays", nullable = false)
	private Integer upgradeDays;

	@Column(name = "Upgraded", nullable = false)
	private Boolean upgraded = false;

	@Column(name = "Quests", nullable = false, length = 100)
	private String quests;

	@Column(name = "Quests2", nullable = false, length = 100)
	private String quests2;

	@Column(name = "LastArea", nullable = false, length = 64)
	private String lastArea;

	@Column(name = "CurrentServer", nullable = false, length = 16)
	private String currentServer;

	@Lob
	@Column(name = "HouseInfo", nullable = false)
	private String houseInfo;

	@Column(name = "KillCount", nullable = false)
	private Integer killCount;

	@Column(name = "DeathCount", nullable = false)
	private Integer deathCount;

}