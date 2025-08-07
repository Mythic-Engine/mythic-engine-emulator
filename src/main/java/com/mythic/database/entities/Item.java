package com.mythic.database.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "items")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "EnhID", nullable = false)
	private Enhancement enhID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ReqClassItemID", nullable = false)
	private Item reqClassItemID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ElementTypeID", nullable = false)
	private TypeElement elementTypeID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ClassID", nullable = false)
	private GameClass classID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "FactionID", nullable = false)
	private Faction factionID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ItemTypeID", nullable = false)
	private TypeItem itemTypeID;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Enhancement getEnhID() {
		return enhID;
	}

	public void setEnhID(Enhancement enhID) {
		this.enhID = enhID;
	}

	public Item getReqClassItemID() {
		return reqClassItemID;
	}

	public void setReqClassItemID(Item reqClassItemID) {
		this.reqClassItemID = reqClassItemID;
	}

	public TypeElement getElementTypeID() {
		return elementTypeID;
	}

	public void setElementTypeID(TypeElement elementTypeID) {
		this.elementTypeID = elementTypeID;
	}

	public GameClass getClassID() {
		return classID;
	}

	public void setClassID(GameClass classID) {
		this.classID = classID;
	}

	public Faction getFactionID() {
		return factionID;
	}

	public void setFactionID(Faction factionID) {
		this.factionID = factionID;
	}

	public TypeItem getItemTypeID() {
		return itemTypeID;
	}

	public void setItemTypeID(TypeItem itemTypeID) {
		this.itemTypeID = itemTypeID;
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

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getDps() {
		return dps;
	}

	public void setDps(Integer dps) {
		this.dps = dps;
	}

	public Integer getRange() {
		return range;
	}

	public void setRange(Integer range) {
		this.range = range;
	}

	public Integer getRarity() {
		return rarity;
	}

	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getStack() {
		return stack;
	}

	public void setStack(Integer stack) {
		this.stack = stack;
	}

	public Boolean getCoins() {
		return coins;
	}

	public void setCoins(Boolean coins) {
		this.coins = coins;
	}

	public Boolean getTemporary() {
		return temporary;
	}

	public void setTemporary(Boolean temporary) {
		this.temporary = temporary;
	}

	public Boolean getUpgrade() {
		return upgrade;
	}

	public void setUpgrade(Boolean upgrade) {
		this.upgrade = upgrade;
	}

	public Boolean getStaff() {
		return staff;
	}

	public void setStaff(Boolean staff) {
		this.staff = staff;
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

	public String getReqQuests() {
		return reqQuests;
	}

	public void setReqQuests(String reqQuests) {
		this.reqQuests = reqQuests;
	}

	public Integer getQuestStringIndex() {
		return questStringIndex;
	}

	public void setQuestStringIndex(Integer questStringIndex) {
		this.questStringIndex = questStringIndex;
	}

	public Integer getQuestStringValue() {
		return questStringValue;
	}

	public void setQuestStringValue(Integer questStringValue) {
		this.questStringValue = questStringValue;
	}

	public String getMeta() {
		return meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public Instant getLastModified() {
		return lastModified;
	}

	public void setLastModified(Instant lastModified) {
		this.lastModified = lastModified;
	}

}