package com.mythic.database.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "quests")
public class Quest {

	@Id
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "AchievementIndexID", nullable = false)
	private Integer achievementIndexID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "QuestChainID", nullable = false)
	private QuestsChain questChainID;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAchievementIndexID() {
		return achievementIndexID;
	}

	public void setAchievementIndexID(Integer achievementIndexID) {
		this.achievementIndexID = achievementIndexID;
	}

	public QuestsChain getQuestChainID() {
		return questChainID;
	}

	public void setQuestChainID(QuestsChain questChainID) {
		this.questChainID = questChainID;
	}

	public Integer getReqClassItemID() {
		return reqClassItemID;
	}

	public void setReqClassItemID(Integer reqClassItemID) {
		this.reqClassItemID = reqClassItemID;
	}

	public Faction getFactionID() {
		return factionID;
	}

	public void setFactionID(Faction factionID) {
		this.factionID = factionID;
	}

	public Integer getReqReputation() {
		return reqReputation;
	}

	public void setReqReputation(Integer reqReputation) {
		this.reqReputation = reqReputation;
	}

	public Integer getReqClassPoints() {
		return reqClassPoints;
	}

	public void setReqClassPoints(Integer reqClassPoints) {
		this.reqClassPoints = reqClassPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndText() {
		return endText;
	}

	public void setEndText(String endText) {
		this.endText = endText;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Integer getGold() {
		return gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	public Integer getReputation() {
		return reputation;
	}

	public void setReputation(Integer reputation) {
		this.reputation = reputation;
	}

	public Integer getClassPoints() {
		return classPoints;
	}

	public void setClassPoints(Integer classPoints) {
		this.classPoints = classPoints;
	}

	public String getRewardType() {
		return rewardType;
	}

	public void setRewardType(String rewardType) {
		this.rewardType = rewardType;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Boolean getUpgrade() {
		return upgrade;
	}

	public void setUpgrade(Boolean upgrade) {
		this.upgrade = upgrade;
	}

	public Boolean getOnce() {
		return once;
	}

	public void setOnce(Boolean once) {
		this.once = once;
	}

	public Integer getQuestChainOrder() {
		return questChainOrder;
	}

	public void setQuestChainOrder(Integer questChainOrder) {
		this.questChainOrder = questChainOrder;
	}

	public Instant getLastModified() {
		return lastModified;
	}

	public void setLastModified(Instant lastModified) {
		this.lastModified = lastModified;
	}

}