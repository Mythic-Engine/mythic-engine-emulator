package com.mythic.database.entities;

import com.mythic.database.EntityBase;
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

}