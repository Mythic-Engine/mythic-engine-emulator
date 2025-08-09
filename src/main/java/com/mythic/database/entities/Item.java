package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "items")
public class Item extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "EnhID", nullable = false)
	private Enhancement enhancement;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "RequiredClassItemID", nullable = false)
	private Item requiredClassItem;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "TypeElementID", nullable = false)
	private TypeElement TypeElement;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ClassID", nullable = false)
	private GameClass classID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "FactionID", nullable = false)
	private Faction faction;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "TypeItemID", nullable = false)
	private TypeItem typeItem;

	@Column(name = "Name", nullable = false, length = 60)
	private String name;

	@Lob
	@Column(name = "Description", nullable = false)
	private String description;

	@Column(name = "File", nullable = false, length = 64)
	private String file;

	@Column(name = "Link", nullable = false, length = 64)
	private String link;

	@Column(name = "Level", nullable = false)
	private Integer level;

	@Column(name = "DPS", nullable = false)
	private Integer dps;

	@Column(name = "`Range`", nullable = false)
	private Integer range;

	@Column(name = "Rarity", nullable = false)
	private Integer rarity;

	@Column(name = "Cost", nullable = false)
	private Integer cost;

	@Column(name = "Quantity", nullable = false)
	private Integer quantity;

	@Column(name = "Stack", nullable = false)
	private Integer stack;

	@Column(name = "Coins", nullable = false)
	private Boolean coins = false;

	@Column(name = "Temporary", nullable = false)
	private Boolean temporary = false;

	@Column(name = "Upgrade", nullable = false)
	private Boolean upgrade = false;

	@Column(name = "Staff", nullable = false)
	private Boolean staff = false;

	@Column(name = "ReqReputation", nullable = false)
	private Integer reqReputation;

	@Column(name = "ReqClassPoints", nullable = false)
	private Integer reqClassPoints;

	@Column(name = "ReqQuests", nullable = false, length = 64)
	private String reqQuests;

	@Column(name = "QuestStringIndex", nullable = false)
	private Integer questStringIndex;

	@Column(name = "QuestStringValue", nullable = false)
	private Integer questStringValue;

	@Column(name = "Meta", length = 32)
	private String meta;

	@Column(name = "LastModified", nullable = false)
	private Instant lastModified;

}