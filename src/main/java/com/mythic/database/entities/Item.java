package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

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

	public Item getRequiredClassItem() {
		return requiredClassItem;
	}

	public Item setRequiredClassItem(Item requiredClassItem) {
		this.requiredClassItem = requiredClassItem;
		return this;
	}

	public Enhancement getEnhancement() {
		return enhancement;
	}

	public Item setEnhancement(Enhancement enhancement) {
		this.enhancement = enhancement;
		return this;
	}

	public TypeElement getTypeElement() {
		return TypeElement;
	}

	public Item setTypeElement(TypeElement typeElement) {
		TypeElement = typeElement;
		return this;
	}

	public GameClass getClassID() {
		return classID;
	}

	public Item setClassID(GameClass classID) {
		this.classID = classID;
		return this;
	}

	public Faction getFaction() {
		return faction;
	}

	public Item setFaction(Faction faction) {
		this.faction = faction;
		return this;
	}

	public TypeItem getTypeItem() {
		return typeItem;
	}

	public Item setTypeItem(TypeItem typeItem) {
		this.typeItem = typeItem;
		return this;
	}

	public String getName() {
		return name;
	}

	public Item setName(String name) {
		this.name = name;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public Item setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getFile() {
		return file;
	}

	public Item setFile(String file) {
		this.file = file;
		return this;
	}

	public String getLink() {
		return link;
	}

	public Item setLink(String link) {
		this.link = link;
		return this;
	}

	public Integer getLevel() {
		return level;
	}

	public Item setLevel(Integer level) {
		this.level = level;
		return this;
	}

	public Integer getDps() {
		return dps;
	}

	public Item setDps(Integer dps) {
		this.dps = dps;
		return this;
	}

	public Integer getRange() {
		return range;
	}

	public Item setRange(Integer range) {
		this.range = range;
		return this;
	}

	public Integer getRarity() {
		return rarity;
	}

	public Item setRarity(Integer rarity) {
		this.rarity = rarity;
		return this;
	}

	public Integer getCost() {
		return cost;
	}

	public Item setCost(Integer cost) {
		this.cost = cost;
		return this;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Item setQuantity(Integer quantity) {
		this.quantity = quantity;
		return this;
	}

	public Integer getStack() {
		return stack;
	}

	public Item setStack(Integer stack) {
		this.stack = stack;
		return this;
	}

	public Boolean getCoins() {
		return coins;
	}

	public Item setCoins(Boolean coins) {
		this.coins = coins;
		return this;
	}

	public Boolean getTemporary() {
		return temporary;
	}

	public Item setTemporary(Boolean temporary) {
		this.temporary = temporary;
		return this;
	}

	public Boolean getUpgrade() {
		return upgrade;
	}

	public Item setUpgrade(Boolean upgrade) {
		this.upgrade = upgrade;
		return this;
	}

	public Boolean getStaff() {
		return staff;
	}

	public Item setStaff(Boolean staff) {
		this.staff = staff;
		return this;
	}

	public Integer getReqReputation() {
		return reqReputation;
	}

	public Item setReqReputation(Integer reqReputation) {
		this.reqReputation = reqReputation;
		return this;
	}

	public Integer getReqClassPoints() {
		return reqClassPoints;
	}

	public Item setReqClassPoints(Integer reqClassPoints) {
		this.reqClassPoints = reqClassPoints;
		return this;
	}

	public String getReqQuests() {
		return reqQuests;
	}

	public Item setReqQuests(String reqQuests) {
		this.reqQuests = reqQuests;
		return this;
	}

	public Integer getQuestStringIndex() {
		return questStringIndex;
	}

	public Item setQuestStringIndex(Integer questStringIndex) {
		this.questStringIndex = questStringIndex;
		return this;
	}

	public Integer getQuestStringValue() {
		return questStringValue;
	}

	public Item setQuestStringValue(Integer questStringValue) {
		this.questStringValue = questStringValue;
		return this;
	}

	public String getMeta() {
		return meta;
	}

	public Item setMeta(String meta) {
		this.meta = meta;
		return this;
	}

}