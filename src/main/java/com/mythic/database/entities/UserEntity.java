package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends EntityBase {

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name = "users_friends",
		joinColumns = @JoinColumn(name = "UserID", referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name = "FriendID", referencedColumnName = "id")
	)
	private Set<UserEntity> userForFriend = Collections.emptySet();

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
	private LocalDateTime dateCreated;

	@Column(name = "LastUpdated", nullable = false)
	private LocalDateTime lastUpdated;

	@Column(name = "UpgradeExpire", nullable = false)
	private LocalDateTime upgradeExpire;

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

	@OneToMany(mappedBy = "UserID")
	private Set<UserAchievement> userAchievements = Collections.emptySet();

	@OneToMany(mappedBy = "UserID")
	private Set<UserBan> userBans = Collections.emptySet();

	@OneToMany(mappedBy = "UserID")
	private Set<UserBoost> userBoosts = Collections.emptySet();

	@OneToMany(mappedBy = "UserID")
	private Set<UserFaction> userFactions = Collections.emptySet();

	@OneToMany(mappedBy = "UserID")
	private Set<UserFriend> userFriends = Collections.emptySet();

	@OneToMany(mappedBy = "UserID")
	private Set<UserIp> userIps = Collections.emptySet();

	@OneToMany(mappedBy = "UserID")
	private Set<UserItem> userItems = Collections.emptySet();

	@OneToMany(mappedBy = "UserID")
	private Set<UserLog> userLogs = Collections.emptySet();

	@OneToMany(mappedBy = "UserID")
	private Set<UserTransaction> userTransactions = Collections.emptySet();

	public Set<UserEntity> getUserForFriend() {
		return userForFriend;
	}

	public UserEntity setUserForFriend(Set<UserEntity> userForFriend) {
		this.userForFriend = userForFriend;
		return this;
	}
	
	public Guild getGuild() {
		return guild;
	}

	public UserEntity setGuild(Guild guild) {
		this.guild = guild;
		return this;
	}

	public Hair getHair() {
		return hair;
	}

	public UserEntity setHair(Hair hair) {
		this.hair = hair;
		return this;
	}

	public String getName() {
		return name;
	}

	public UserEntity setName(String name) {
		this.name = name;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public UserEntity setPassword(String password) {
		this.password = password;
		return this;
	}

	public Integer getAccess() {
		return access;
	}

	public UserEntity setAccess(Integer access) {
		this.access = access;
		return this;
	}

	public Integer getActivationFlag() {
		return activationFlag;
	}

	public UserEntity setActivationFlag(Integer activationFlag) {
		this.activationFlag = activationFlag;
		return this;
	}

	public Boolean getPermamuteFlag() {
		return permamuteFlag;
	}

	public UserEntity setPermamuteFlag(Boolean permamuteFlag) {
		this.permamuteFlag = permamuteFlag;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public UserEntity setCountry(String country) {
		this.country = country;
		return this;
	}

	public Integer getAge() {
		return age;
	}

	public UserEntity setAge(Integer age) {
		this.age = age;
		return this;
	}

	public String getGender() {
		return gender;
	}

	public UserEntity setGender(String gender) {
		this.gender = gender;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public UserEntity setEmail(String email) {
		this.email = email;
		return this;
	}

	public Integer getLevel() {
		return level;
	}

	public UserEntity setLevel(Integer level) {
		this.level = level;
		return this;
	}

	public Integer getGold() {
		return gold;
	}

	public UserEntity setGold(Integer gold) {
		this.gold = gold;
		return this;
	}

	public Integer getCoins() {
		return coins;
	}

	public UserEntity setCoins(Integer coins) {
		this.coins = coins;
		return this;
	}

	public Integer getExp() {
		return exp;
	}

	public UserEntity setExp(Integer exp) {
		this.exp = exp;
		return this;
	}

	public String getColorHair() {
		return colorHair;
	}

	public UserEntity setColorHair(String colorHair) {
		this.colorHair = colorHair;
		return this;
	}

	public String getColorSkin() {
		return colorSkin;
	}

	public UserEntity setColorSkin(String colorSkin) {
		this.colorSkin = colorSkin;
		return this;
	}

	public String getColorEye() {
		return colorEye;
	}

	public UserEntity setColorEye(String colorEye) {
		this.colorEye = colorEye;
		return this;
	}

	public String getColorBase() {
		return colorBase;
	}

	public UserEntity setColorBase(String colorBase) {
		this.colorBase = colorBase;
		return this;
	}

	public String getColorTrim() {
		return colorTrim;
	}

	public UserEntity setColorTrim(String colorTrim) {
		this.colorTrim = colorTrim;
		return this;
	}

	public String getColorAccessory() {
		return colorAccessory;
	}

	public UserEntity setColorAccessory(String colorAccessory) {
		this.colorAccessory = colorAccessory;
		return this;
	}

	public Integer getGuildRank() {
		return guildRank;
	}

	public UserEntity setGuildRank(Integer guildRank) {
		this.guildRank = guildRank;
		return this;
	}

	public Integer getSlotsBag() {
		return slotsBag;
	}

	public UserEntity setSlotsBag(Integer slotsBag) {
		this.slotsBag = slotsBag;
		return this;
	}

	public Integer getSlotsBank() {
		return slotsBank;
	}

	public UserEntity setSlotsBank(Integer slotsBank) {
		this.slotsBank = slotsBank;
		return this;
	}

	public Integer getSlotsHouse() {
		return slotsHouse;
	}

	public UserEntity setSlotsHouse(Integer slotsHouse) {
		this.slotsHouse = slotsHouse;
		return this;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public UserEntity setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
		return this;
	}

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public UserEntity setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
		return this;
	}

	public LocalDateTime getUpgradeExpire() {
		return upgradeExpire;
	}

	public UserEntity setUpgradeExpire(LocalDateTime upgradeExpire) {
		this.upgradeExpire = upgradeExpire;
		return this;
	}

	public Integer getUpgradeDays() {
		return upgradeDays;
	}

	public UserEntity setUpgradeDays(Integer upgradeDays) {
		this.upgradeDays = upgradeDays;
		return this;
	}

	public Boolean getUpgraded() {
		return upgraded;
	}

	public UserEntity setUpgraded(Boolean upgraded) {
		this.upgraded = upgraded;
		return this;
	}

	public String getQuests() {
		return quests;
	}

	public UserEntity setQuests(String quests) {
		this.quests = quests;
		return this;
	}

	public String getQuests2() {
		return quests2;
	}

	public UserEntity setQuests2(String quests2) {
		this.quests2 = quests2;
		return this;
	}

	public String getLastArea() {
		return lastArea;
	}

	public UserEntity setLastArea(String lastArea) {
		this.lastArea = lastArea;
		return this;
	}

	public String getCurrentServer() {
		return currentServer;
	}

	public UserEntity setCurrentServer(String currentServer) {
		this.currentServer = currentServer;
		return this;
	}

	public String getHouseInfo() {
		return houseInfo;
	}

	public UserEntity setHouseInfo(String houseInfo) {
		this.houseInfo = houseInfo;
		return this;
	}

	public Integer getKillCount() {
		return killCount;
	}

	public UserEntity setKillCount(Integer killCount) {
		this.killCount = killCount;
		return this;
	}

	public Integer getDeathCount() {
		return deathCount;
	}

	public UserEntity setDeathCount(Integer deathCount) {
		this.deathCount = deathCount;
		return this;
	}

	public Set<UserAchievement> getUserAchievements() {
		return userAchievements;
	}

	public UserEntity setUserAchievements(Set<UserAchievement> userAchievements) {
		this.userAchievements = userAchievements;
		return this;
	}

	public Set<UserBan> getUserBans() {
		return userBans;
	}

	public UserEntity setUserBans(Set<UserBan> userBans) {
		this.userBans = userBans;
		return this;
	}

	public Set<UserBoost> getUserBoosts() {
		return userBoosts;
	}

	public UserEntity setUserBoosts(Set<UserBoost> userBoosts) {
		this.userBoosts = userBoosts;
		return this;
	}

	public Set<UserFaction> getUserFactions() {
		return userFactions;
	}

	public UserEntity setUserFactions(Set<UserFaction> userFactions) {
		this.userFactions = userFactions;
		return this;
	}

	public Set<UserFriend> getUserFriends() {
		return userFriends;
	}

	public UserEntity setUserFriends(Set<UserFriend> userFriends) {
		this.userFriends = userFriends;
		return this;
	}

	public Set<UserIp> getUserIps() {
		return userIps;
	}

	public UserEntity setUserIps(Set<UserIp> userIps) {
		this.userIps = userIps;
		return this;
	}

	public Set<UserItem> getUserItems() {
		return userItems;
	}

	public UserEntity setUserItems(Set<UserItem> userItems) {
		this.userItems = userItems;
		return this;
	}

	public Set<UserLog> getUserLogs() {
		return userLogs;
	}

	public UserEntity setUserLogs(Set<UserLog> userLogs) {
		this.userLogs = userLogs;
		return this;
	}

	public Set<UserTransaction> getUserTransactions() {
		return userTransactions;
	}

	public UserEntity setUserTransactions(Set<UserTransaction> userTransactions) {
		this.userTransactions = userTransactions;
		return this;
	}

}