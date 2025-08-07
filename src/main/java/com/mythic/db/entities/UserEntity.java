/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class UserEntity implements Serializable {

	private Integer id;
	private Hair hair;
	private Guild guild;
	private String name;
	private String hash;
	private int access;
	private int activationFlag;
	private boolean permamute;
	private String country;
	private int age;
	private String gender;
	private String email;
	private int level;
	private int gold;
	private int coins;
	private int exp;
	private String colorHair;
	private String colorSkin;
	private String colorEye;
	private String colorBase;
	private String colorTrim;
	private String colorAccessory;
	private int guildRank;
	private int slotsBag;
	private int slotsBank;
	private int slotsHouse;
	private Date dateCreated;
	private Date lastUpdated;
	private Date upgradeExpire;
	private int upgradeDays;
	private boolean upgraded;
	private String quests;
	private String quests2;
	private String lastArea;
	private String currentServer;
	private String houseInfo;
	private int killCount;
	private int deathCount;
	private Set<UserEntity> userEntitiesForUserId = new HashSet<>(0);
	private Set<UserBoost> userBoosts = new HashSet<>(0);
	private Set<UserFaction> userFactions = new HashSet<>(0);
	private UserBan userBan;
	private Set<UserEntity> userEntitiesForFriendId = new HashSet<>(0);
	private Set<UserAchievement> userAchievements = new HashSet<>(0);
	private Set<UserLog> userLogs = new HashSet<>(0);
	private Set<UserIP> userIPs = new HashSet<>(0);
	private Set<UserTransaction> userTransactions = new HashSet<>(0);
	private Set<UserItem> userItems = new HashSet<>(0);

	public UserEntity() {
	}

	public UserEntity(
		Hair hair,
		Guild guild,
		String name,
		String hash,
		int access,
		int activationFlag,
		boolean permamuteFlag,
		String country,
		int age,
		String gender,
		String email,
		int level,
		int gold,
		int coins,
		int exp,
		String colorHair,
		String colorSkin,
		String colorEye,
		String colorBase,
		String colorTrim,
		String colorAccessory,
		int guildRank,
		int slotsBag,
		int slotsBank,
		int slotsHouse,
		Date dateCreated,
		Date lastUpdated,
		Date upgradeExpire,
		int upgradeDays,
		boolean upgraded,
		String quests,
		String quests2,
		String lastArea,
		String currentServer,
		String houseInfo,
		int killCount,
		int deathCount
	) {
		this.hair = hair;
		this.guild = guild;
		this.name = name;
		this.hash = hash;
		this.access = access;
		this.activationFlag = activationFlag;
		this.permamute = permamuteFlag;
		this.country = country;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.level = level;
		this.gold = gold;
		this.coins = coins;
		this.exp = exp;
		this.colorHair = colorHair;
		this.colorSkin = colorSkin;
		this.colorEye = colorEye;
		this.colorBase = colorBase;
		this.colorTrim = colorTrim;
		this.colorAccessory = colorAccessory;
		this.guildRank = guildRank;
		this.slotsBag = slotsBag;
		this.slotsBank = slotsBank;
		this.slotsHouse = slotsHouse;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
		this.upgradeExpire = upgradeExpire;
		this.upgradeDays = upgradeDays;
		this.upgraded = upgraded;
		this.quests = quests;
		this.quests2 = quests2;
		this.lastArea = lastArea;
		this.currentServer = currentServer;
		this.houseInfo = houseInfo;
		this.killCount = killCount;
		this.deathCount = deathCount;
	}

	public UserEntity(
		Hair hair,
		Guild guild,
		String name,
		String hash,
		int access,
		int activationFlag,
		boolean permamuteFlag,
		String country,
		int age,
		String gender,
		String email,
		int level,
		int gold,
		int coins,
		int exp,
		String colorHair,
		String colorSkin,
		String colorEye,
		String colorBase,
		String colorTrim,
		String colorAccessory,
		int guildRank,
		int slotsBag,
		int slotsBank,
		int slotsHouse,
		Date dateCreated,
		Date lastUpdated,
		Date upgradeExpire,
		int upgradeDays,
		boolean upgraded,
		String quests,
		String quests2,
		String lastArea,
		String currentServer,
		String houseInfo,
		int killCount,
		int deathCount,
		Set userEntitiesForUserId,
		Set userBoosts,
		Set userFactions,
		UserBan userBan,
		Set userEntitiesForFriendId,
		Set userAchievements,
		Set userLogs,
		Set userIPs,
		Set userTransactions,
		Set userItems
	) {
		this.hair = hair;
		this.guild = guild;
		this.name = name;
		this.hash = hash;
		this.access = access;
		this.activationFlag = activationFlag;
		this.permamute = permamuteFlag;
		this.country = country;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.level = level;
		this.gold = gold;
		this.coins = coins;
		this.exp = exp;
		this.colorHair = colorHair;
		this.colorSkin = colorSkin;
		this.colorEye = colorEye;
		this.colorBase = colorBase;
		this.colorTrim = colorTrim;
		this.colorAccessory = colorAccessory;
		this.guildRank = guildRank;
		this.slotsBag = slotsBag;
		this.slotsBank = slotsBank;
		this.slotsHouse = slotsHouse;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
		this.upgradeExpire = upgradeExpire;
		this.upgradeDays = upgradeDays;
		this.upgraded = upgraded;
		this.quests = quests;
		this.quests2 = quests2;
		this.lastArea = lastArea;
		this.currentServer = currentServer;
		this.houseInfo = houseInfo;
		this.killCount = killCount;
		this.deathCount = deathCount;
		this.userEntitiesForUserId = userEntitiesForUserId;
		this.userBoosts = userBoosts;
		this.userFactions = userFactions;
		this.userBan = userBan;
		this.userEntitiesForFriendId = userEntitiesForFriendId;
		this.userAchievements = userAchievements;
		this.userLogs = userLogs;
		this.userIPs = userIPs;
		this.userTransactions = userTransactions;
		this.userItems = userItems;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Hair getHair() {
		return this.hair;
	}

	public void setHair(Hair hair) {
		this.hair = hair;
	}

	public Guild getGuild() {
		return this.guild;
	}

	public void setGuild(Guild guild) {
		this.guild = guild;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHash() {
		return this.hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public int getAccess() {
		return this.access;
	}

	public void setAccess(int access) {
		this.access = access;
	}

	public boolean isPermamute() {
		return this.permamute;
	}

	public void setPermamute(boolean permamute) {
		this.permamute = permamute;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getGold() {
		return this.gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getCoins() {
		return this.coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public int getExp() {
		return this.exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getColorHair() {
		return this.colorHair;
	}

	public void setColorHair(String colorHair) {
		this.colorHair = colorHair;
	}

	public String getColorSkin() {
		return this.colorSkin;
	}

	public void setColorSkin(String colorSkin) {
		this.colorSkin = colorSkin;
	}

	public String getColorEye() {
		return this.colorEye;
	}

	public void setColorEye(String colorEye) {
		this.colorEye = colorEye;
	}

	public String getColorBase() {
		return this.colorBase;
	}

	public void setColorBase(String colorBase) {
		this.colorBase = colorBase;
	}

	public String getColorTrim() {
		return this.colorTrim;
	}

	public void setColorTrim(String colorTrim) {
		this.colorTrim = colorTrim;
	}

	public String getColorAccessory() {
		return this.colorAccessory;
	}

	public void setColorAccessory(String colorAccessory) {
		this.colorAccessory = colorAccessory;
	}

	public int getSlotsBag() {
		return this.slotsBag;
	}

	public void setSlotsBag(int slotsBag) {
		this.slotsBag = slotsBag;
	}

	public int getSlotsBank() {
		return this.slotsBank;
	}

	public void setSlotsBank(int slotsBank) {
		this.slotsBank = slotsBank;
	}

	public int getSlotsHouse() {
		return this.slotsHouse;
	}

	public void setSlotsHouse(int slotsHouse) {
		this.slotsHouse = slotsHouse;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Date getUpgradeExpire() {
		return this.upgradeExpire;
	}

	public void setUpgradeExpire(Date upgradeExpire) {
		this.upgradeExpire = upgradeExpire;
	}

	public int getUpgradeDays() {
		return this.upgradeDays;
	}

	public void setUpgradeDays(int upgradeDays) {
		this.upgradeDays = upgradeDays;
	}

	public boolean isUpgraded() {
		return this.upgraded;
	}

	public void setUpgraded(boolean upgraded) {
		this.upgraded = upgraded;
	}

	public String getQuests() {
		return this.quests;
	}

	public void setQuests(String quests) {
		this.quests = quests;
	}

	public String getQuests2() {
		return this.quests2;
	}

	public void setQuests2(String quests2) {
		this.quests2 = quests2;
	}

	public String getLastArea() {
		return this.lastArea;
	}

	public void setLastArea(String lastArea) {
		this.lastArea = lastArea;
	}

	public String getCurrentServer() {
		return this.currentServer;
	}

	public void setCurrentServer(String currentServer) {
		this.currentServer = currentServer;
	}

	public String getHouseInfo() {
		return this.houseInfo;
	}

	public void setHouseInfo(String houseInfo) {
		this.houseInfo = houseInfo;
	}

	public int getKillCount() {
		return this.killCount;
	}

	public void setKillCount(int killCount) {
		this.killCount = killCount;
	}

	public int getDeathCount() {
		return this.deathCount;
	}

	public void setDeathCount(int deathCount) {
		this.deathCount = deathCount;
	}

	public int getActivationFlag() {
		return this.activationFlag;
	}

	public void setActivationFlag(int activationFlag) {
		this.activationFlag = activationFlag;
	}

	public int getGuildRank() {
		return this.guildRank;
	}

	public void setGuildRank(int guildRank) {
		this.guildRank = guildRank;
	}

	public Set<UserEntity> getUserEntitiesForUserId() {
		return this.userEntitiesForUserId;
	}

	public void setUserEntitiesForUserId(Set<UserEntity> userEntitiesForUserId) {
		this.userEntitiesForUserId = userEntitiesForUserId;
	}

	public Set<UserBoost> getUserBoosts() {
		return this.userBoosts;
	}

	public void setUserBoosts(Set<UserBoost> userBoosts) {
		this.userBoosts = userBoosts;
	}

	public Set<UserFaction> getUserFactions() {
		return this.userFactions;
	}

	public void setUserFactions(Set<UserFaction> userFactions) {
		this.userFactions = userFactions;
	}

	public UserBan getUserBan() {
		return this.userBan;
	}

	public void setUserBan(UserBan userBan) {
		this.userBan = userBan;
	}

	public Set<UserEntity> getUserEntitiesForFriendId() {
		return this.userEntitiesForFriendId;
	}

	public void setUserEntitiesForFriendId(Set<UserEntity> userEntitiesForFriendId) {
		this.userEntitiesForFriendId = userEntitiesForFriendId;
	}

	public Set<UserAchievement> getUserAchievements() {
		return this.userAchievements;
	}

	public void setUserAchievements(Set<UserAchievement> userAchievements) {
		this.userAchievements = userAchievements;
	}

	public Set<UserLog> getUserLogs() {
		return this.userLogs;
	}

	public void setUserLogs(Set<UserLog> userLogs) {
		this.userLogs = userLogs;
	}

	public Set<UserIP> getUserIPs() {
		return this.userIPs;
	}

	public void setUserIPs(Set<UserIP> userIPs) {
		this.userIPs = userIPs;
	}

	public Set<UserTransaction> getUserTransactions() {
		return this.userTransactions;
	}

	public void setUserTransactions(Set<UserTransaction> userTransactions) {
		this.userTransactions = userTransactions;
	}

	public Set<UserItem> getUserItems() {
		return this.userItems;
	}

	public void setUserItems(Set<UserItem> userItems) {
		this.userItems = userItems;
	}

}
