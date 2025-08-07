package com.mythic.database.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "users")
public class User {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "GuildID", nullable = false)
	private Guild guildID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "HairID", nullable = false)
	private Hair hairID;

	@Column(name = "Name", nullable = false, length = 32)
	private String name;

	@Column(name = "Hash", nullable = false, length = 17)
	private String hash;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Guild getGuildID() {
		return guildID;
	}

	public void setGuildID(Guild guildID) {
		this.guildID = guildID;
	}

	public Hair getHairID() {
		return hairID;
	}

	public void setHairID(Hair hairID) {
		this.hairID = hairID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public Integer getAccess() {
		return access;
	}

	public void setAccess(Integer access) {
		this.access = access;
	}

	public Integer getActivationFlag() {
		return activationFlag;
	}

	public void setActivationFlag(Integer activationFlag) {
		this.activationFlag = activationFlag;
	}

	public Boolean getPermamuteFlag() {
		return permamuteFlag;
	}

	public void setPermamuteFlag(Boolean permamuteFlag) {
		this.permamuteFlag = permamuteFlag;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getGold() {
		return gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	public Integer getCoins() {
		return coins;
	}

	public void setCoins(Integer coins) {
		this.coins = coins;
	}

	public Integer getExp() {
		return exp;
	}

	public void setExp(Integer exp) {
		this.exp = exp;
	}

	public String getColorHair() {
		return colorHair;
	}

	public void setColorHair(String colorHair) {
		this.colorHair = colorHair;
	}

	public String getColorSkin() {
		return colorSkin;
	}

	public void setColorSkin(String colorSkin) {
		this.colorSkin = colorSkin;
	}

	public String getColorEye() {
		return colorEye;
	}

	public void setColorEye(String colorEye) {
		this.colorEye = colorEye;
	}

	public String getColorBase() {
		return colorBase;
	}

	public void setColorBase(String colorBase) {
		this.colorBase = colorBase;
	}

	public String getColorTrim() {
		return colorTrim;
	}

	public void setColorTrim(String colorTrim) {
		this.colorTrim = colorTrim;
	}

	public String getColorAccessory() {
		return colorAccessory;
	}

	public void setColorAccessory(String colorAccessory) {
		this.colorAccessory = colorAccessory;
	}

	public Integer getGuildRank() {
		return guildRank;
	}

	public void setGuildRank(Integer guildRank) {
		this.guildRank = guildRank;
	}

	public Integer getSlotsBag() {
		return slotsBag;
	}

	public void setSlotsBag(Integer slotsBag) {
		this.slotsBag = slotsBag;
	}

	public Integer getSlotsBank() {
		return slotsBank;
	}

	public void setSlotsBank(Integer slotsBank) {
		this.slotsBank = slotsBank;
	}

	public Integer getSlotsHouse() {
		return slotsHouse;
	}

	public void setSlotsHouse(Integer slotsHouse) {
		this.slotsHouse = slotsHouse;
	}

	public Instant getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Instant dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Instant getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Instant lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Instant getUpgradeExpire() {
		return upgradeExpire;
	}

	public void setUpgradeExpire(Instant upgradeExpire) {
		this.upgradeExpire = upgradeExpire;
	}

	public Integer getUpgradeDays() {
		return upgradeDays;
	}

	public void setUpgradeDays(Integer upgradeDays) {
		this.upgradeDays = upgradeDays;
	}

	public Boolean getUpgraded() {
		return upgraded;
	}

	public void setUpgraded(Boolean upgraded) {
		this.upgraded = upgraded;
	}

	public String getQuests() {
		return quests;
	}

	public void setQuests(String quests) {
		this.quests = quests;
	}

	public String getQuests2() {
		return quests2;
	}

	public void setQuests2(String quests2) {
		this.quests2 = quests2;
	}

	public String getLastArea() {
		return lastArea;
	}

	public void setLastArea(String lastArea) {
		this.lastArea = lastArea;
	}

	public String getCurrentServer() {
		return currentServer;
	}

	public void setCurrentServer(String currentServer) {
		this.currentServer = currentServer;
	}

	public String getHouseInfo() {
		return houseInfo;
	}

	public void setHouseInfo(String houseInfo) {
		this.houseInfo = houseInfo;
	}

	public Integer getKillCount() {
		return killCount;
	}

	public void setKillCount(Integer killCount) {
		this.killCount = killCount;
	}

	public Integer getDeathCount() {
		return deathCount;
	}

	public void setDeathCount(Integer deathCount) {
		this.deathCount = deathCount;
	}

}