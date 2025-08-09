package com.mythic.database.entities;

import com.mythic.database.base.EntityBase;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "quests")
public class Quest extends EntityBase {

	@Column(name = "AchievementIndexID", nullable = false)
	private Integer achievementIndexID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "QuestChainID", nullable = false)
	private QuestChain questChainID;

	@Column(name = "ReqClassItemID", nullable = false)
	private Integer reqClassItemID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "FactionID", nullable = false)
	private Faction factionID;

	@Column(name = "ReqReputation", nullable = false)
	private Integer reqReputation;

	@Column(name = "ReqClassPoints", nullable = false)
	private Integer reqClassPoints;

	@Column(name = "Name", nullable = false, length = 64)
	private String name;

	@Lob
	@Column(name = "Description", nullable = false)
	private String description;

	@Lob
	@Column(name = "EndText", nullable = false)
	private String endText;

	@Column(name = "Experience", nullable = false)
	private Integer experience;

	@Column(name = "Gold", nullable = false)
	private Integer gold;

	@Column(name = "Reputation", nullable = false)
	private Integer reputation;

	@Column(name = "ClassPoints", nullable = false)
	private Integer classPoints;

	@Column(name = "RewardType", nullable = false, length = 1)
	private String rewardType;

	@Column(name = "Level", nullable = false)
	private Integer level;

	@Column(name = "Upgrade", nullable = false)
	private Boolean upgrade = false;

	@Column(name = "Once", nullable = false)
	private Boolean once = false;

	@Column(name = "QuestChainOrder", nullable = false)
	private Integer questChainOrder;

	@Column(name = "LastModified", nullable = false)
	private Instant lastModified;

	public Integer getAchievementIndexID() {
		return achievementIndexID;
	}

	public Quest setAchievementIndexID(Integer achievementIndexID) {
		this.achievementIndexID = achievementIndexID;
		return this;
	}

	public QuestChain getQuestChainID() {
		return questChainID;
	}

	public Quest setQuestChainID(QuestChain questChainID) {
		this.questChainID = questChainID;
		return this;
	}

	public Integer getReqClassItemID() {
		return reqClassItemID;
	}

	public Quest setReqClassItemID(Integer reqClassItemID) {
		this.reqClassItemID = reqClassItemID;
		return this;
	}

	public Faction getFactionID() {
		return factionID;
	}

	public Quest setFactionID(Faction factionID) {
		this.factionID = factionID;
		return this;
	}

	public Integer getReqReputation() {
		return reqReputation;
	}

	public Quest setReqReputation(Integer reqReputation) {
		this.reqReputation = reqReputation;
		return this;
	}

	public Integer getReqClassPoints() {
		return reqClassPoints;
	}

	public Quest setReqClassPoints(Integer reqClassPoints) {
		this.reqClassPoints = reqClassPoints;
		return this;
	}

	public String getName() {
		return name;
	}

	public Quest setName(String name) {
		this.name = name;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Quest setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getEndText() {
		return endText;
	}

	public Quest setEndText(String endText) {
		this.endText = endText;
		return this;
	}

	public Integer getExperience() {
		return experience;
	}

	public Quest setExperience(Integer experience) {
		this.experience = experience;
		return this;
	}

	public Integer getGold() {
		return gold;
	}

	public Quest setGold(Integer gold) {
		this.gold = gold;
		return this;
	}

	public Integer getReputation() {
		return reputation;
	}

	public Quest setReputation(Integer reputation) {
		this.reputation = reputation;
		return this;
	}

	public Integer getClassPoints() {
		return classPoints;
	}

	public Quest setClassPoints(Integer classPoints) {
		this.classPoints = classPoints;
		return this;
	}

	public String getRewardType() {
		return rewardType;
	}

	public Quest setRewardType(String rewardType) {
		this.rewardType = rewardType;
		return this;
	}

	public Integer getLevel() {
		return level;
	}

	public Quest setLevel(Integer level) {
		this.level = level;
		return this;
	}

	public Boolean getUpgrade() {
		return upgrade;
	}

	public Quest setUpgrade(Boolean upgrade) {
		this.upgrade = upgrade;
		return this;
	}

	public Boolean getOnce() {
		return once;
	}

	public Quest setOnce(Boolean once) {
		this.once = once;
		return this;
	}

	public Integer getQuestChainOrder() {
		return questChainOrder;
	}

	public Quest setQuestChainOrder(Integer questChainOrder) {
		this.questChainOrder = questChainOrder;
		return this;
	}

	public Instant getLastModified() {
		return lastModified;
	}

	public Quest setLastModified(Instant lastModified) {
		this.lastModified = lastModified;
		return this;
	}

}