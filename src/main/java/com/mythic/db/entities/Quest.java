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

public class Quest implements Serializable {

	private Integer id;
	private AchievementIndex achievementIndex;
	private QuestChain questChain;
	private Item reqClassItem;
	private Faction faction;
	private int reqReputation;
	private int reqClassPoints;
	private String name;
	private String description;
	private String endText;
	private int experience;
	private int gold;
	private int reputation;
	private int classPoints;
	private String rewardType;
	private int level;
	private boolean upgrade;
	private boolean once;
	private int questChainOrder;
	private Date lastModified;
	private Set<MapEntity> mapEntities = new HashSet<>(0);
	private Set<QuestReward> questRewards = new HashSet<>(0);
	private Set<QuestRequirement> questRequirements = new HashSet<>(0);

	public Quest() {
	}

	public Quest(
		AchievementIndex achievementIndex,
		QuestChain questChain,
		Item item,
		Faction faction,
		int reqReputation,
		int reqClassPoints,
		String name,
		String description,
		String endText,
		int experience,
		int gold,
		int reputation,
		int classPoints,
		String rewardType,
		int level,
		boolean upgrade,
		boolean once,
		int questChainOrder,
		Date lastModified
	) {
		this.achievementIndex = achievementIndex;
		this.questChain = questChain;
		this.reqClassItem = item;
		this.faction = faction;
		this.reqReputation = reqReputation;
		this.reqClassPoints = reqClassPoints;
		this.name = name;
		this.description = description;
		this.endText = endText;
		this.experience = experience;
		this.gold = gold;
		this.reputation = reputation;
		this.classPoints = classPoints;
		this.rewardType = rewardType;
		this.level = level;
		this.upgrade = upgrade;
		this.once = once;
		this.questChainOrder = questChainOrder;
		this.lastModified = lastModified;
	}

	public Quest(
		AchievementIndex achievementIndex,
		QuestChain questChain,
		Item item,
		Faction faction,
		int reqReputation,
		int reqClassPoints,
		String name,
		String description,
		String endText,
		int experience,
		int gold,
		int reputation,
		int classPoints,
		String rewardType,
		int level,
		boolean upgrade,
		boolean once,
		int questChainOrder,
		Date lastModified,
		Set questRewards,
		Set questRequirements,
		Set mapEntities
	) {
		this.achievementIndex = achievementIndex;
		this.questChain = questChain;
		this.reqClassItem = item;
		this.faction = faction;
		this.reqReputation = reqReputation;
		this.reqClassPoints = reqClassPoints;
		this.name = name;
		this.description = description;
		this.endText = endText;
		this.experience = experience;
		this.gold = gold;
		this.reputation = reputation;
		this.classPoints = classPoints;
		this.rewardType = rewardType;
		this.level = level;
		this.upgrade = upgrade;
		this.once = once;
		this.questChainOrder = questChainOrder;
		this.lastModified = lastModified;
		this.questRewards = questRewards;
		this.questRequirements = questRequirements;
		this.mapEntities = mapEntities;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AchievementIndex getAchievementIndex() {
		return this.achievementIndex;
	}

	public void setAchievementIndex(AchievementIndex achievementIndex) {
		this.achievementIndex = achievementIndex;
	}

	public QuestChain getQuestChain() {
		return this.questChain;
	}

	public void setQuestChain(QuestChain questChain) {
		this.questChain = questChain;
	}

	public Item getReqClassItem() {
		return this.reqClassItem;
	}

	public void setReqClassItem(Item reqClassItem) {
		this.reqClassItem = reqClassItem;
	}

	public Faction getFaction() {
		return this.faction;
	}

	public void setFaction(Faction faction) {
		this.faction = faction;
	}

	public int getReqReputation() {
		return this.reqReputation;
	}

	public void setReqReputation(int reqReputation) {
		this.reqReputation = reqReputation;
	}

	public int getReqClassPoints() {
		return this.reqClassPoints;
	}

	public void setReqClassPoints(int reqClassPoints) {
		this.reqClassPoints = reqClassPoints;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndText() {
		return this.endText;
	}

	public void setEndText(String endText) {
		this.endText = endText;
	}

	public int getExperience() {
		return this.experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getGold() {
		return this.gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getReputation() {
		return this.reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public int getClassPoints() {
		return this.classPoints;
	}

	public void setClassPoints(int classPoints) {
		this.classPoints = classPoints;
	}

	public String getRewardType() {
		return this.rewardType;
	}

	public void setRewardType(String rewardType) {
		this.rewardType = rewardType;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public boolean isUpgrade() {
		return this.upgrade;
	}

	public void setUpgrade(boolean upgrade) {
		this.upgrade = upgrade;
	}

	public boolean isOnce() {
		return this.once;
	}

	public void setOnce(boolean once) {
		this.once = once;
	}

	public int getQuestChainOrder() {
		return this.questChainOrder;
	}

	public void setQuestChainOrder(int questChainOrder) {
		this.questChainOrder = questChainOrder;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Set<MapEntity> getMapEntities() {
		return this.mapEntities;
	}

	public void setMapEntities(Set<MapEntity> mapEntities) {
		this.mapEntities = mapEntities;
	}

	public Set<QuestReward> getQuestRewards() {
		return this.questRewards;
	}

	public void setQuestRewards(Set<QuestReward> questRewards) {
		this.questRewards = questRewards;
	}

	public Set<QuestRequirement> getQuestRequirements() {
		return this.questRequirements;
	}

	public void setQuestRequirements(Set<QuestRequirement> questRequirements) {
		this.questRequirements = questRequirements;
	}

}
