/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import net.sf.json.JSONObject;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Item implements Serializable {

	private Integer id;
	private Enhancement enhancement;
	private Item item;
	private ElementType elementType;
	private GameClass gameClass;
	private Faction faction;
	private ItemType itemType;
	private String name;
	private String description;
	private String file;
	private String link;
	private int level;
	private int dps;
	private int range;
	private int rarity;
	private int cost;
	private int quantity;
	private int stack;
	private boolean coins;
	private boolean temporary;
	private boolean upgrade;
	private boolean staff;
	private int reqReputation;
	private int reqClassPoints;
	private String reqQuests;
	private int questStringIndex;
	private int questStringValue;
	private String meta;
	private Date lastModified;
	private Set<ItemRequirement> itemRequirementsForItemId = new HashSet<>(0);
	private Set<Quest> quests = new HashSet<>(0);
	private Set<MapEntity> mapEntities = new HashSet<>(0);
	private Set<ShopItem> shopItems = new HashSet<>(0);
	private Set<QuestReward> questRewards = new HashSet<>(0);
	private Set<MonsterDrop> monsterDrops = new HashSet<>(0);
	private Set<UserItem> userItems = new HashSet<>(0);
	private Set<QuestRequirement> questRequirements = new HashSet<>(0);
	private Set<ItemRequirement> itemRequirementsForReqItemId = new HashSet<>(0);
	private Set<Item> items = new HashSet<>(0);
	private Set<GuildHallBuilding> guildHallBuildings = new HashSet<>(0);
	private Set<Code> codes = new HashSet<>(0);

	public Item() {
	}

	public Item(
		Enhancement enhancement,
		Item item,
		ElementType elementType,
		GameClass gameClass,
		Faction faction,
		ItemType itemType,
		String name,
		String description,
		String file,
		String link,
		int level,
		int dps,
		int range,
		int rarity,
		int cost,
		int quantity,
		int stack,
		boolean coins,
		boolean temporary,
		boolean upgrade,
		boolean staff,
		int reqReputation,
		int reqClassPoints,
		String reqQuests,
		int questStringIndex,
		int questStringValue,
		Date lastModified
	) {
		this.enhancement = enhancement;
		this.item = item;
		this.elementType = elementType;
		this.gameClass = gameClass;
		this.faction = faction;
		this.itemType = itemType;
		this.name = name;
		this.description = description;
		this.file = file;
		this.link = link;
		this.level = level;
		this.dps = dps;
		this.range = range;
		this.rarity = rarity;
		this.cost = cost;
		this.quantity = quantity;
		this.stack = stack;
		this.coins = coins;
		this.temporary = temporary;
		this.upgrade = upgrade;
		this.staff = staff;
		this.reqReputation = reqReputation;
		this.reqClassPoints = reqClassPoints;
		this.reqQuests = reqQuests;
		this.questStringIndex = questStringIndex;
		this.questStringValue = questStringValue;
		this.lastModified = lastModified;
	}

	public Item(
		Enhancement enhancement,
		Item item,
		ElementType elementType,
		GameClass gameClass,
		Faction faction,
		ItemType itemType,
		String name,
		String description,
		String file,
		String link,
		int level,
		int dps,
		int range,
		int rarity,
		int cost,
		int quantity,
		int stack,
		boolean coins,
		boolean temporary,
		boolean upgrade,
		boolean staff,
		int reqReputation,
		int reqClassPoints,
		String reqQuests,
		int questStringIndex,
		int questStringValue,
		String meta,
		Date lastModified,
		Set shopItems,
		Set guildHallBuildings,
		Set items,
		Set monsterDrops,
		Set questRewards,
		Set quests,
		Set itemRequirementsForItemId,
		Set questRequirements,
		Set userItems,
		Set mapEntities,
		Set itemRequirementsForReqItemId,
		Set codes
	) {
		this.enhancement = enhancement;
		this.item = item;
		this.elementType = elementType;
		this.gameClass = gameClass;
		this.faction = faction;
		this.itemType = itemType;
		this.name = name;
		this.description = description;
		this.file = file;
		this.link = link;
		this.level = level;
		this.dps = dps;
		this.range = range;
		this.rarity = rarity;
		this.cost = cost;
		this.quantity = quantity;
		this.stack = stack;
		this.coins = coins;
		this.temporary = temporary;
		this.upgrade = upgrade;
		this.staff = staff;
		this.reqReputation = reqReputation;
		this.reqClassPoints = reqClassPoints;
		this.reqQuests = reqQuests;
		this.questStringIndex = questStringIndex;
		this.questStringValue = questStringValue;
		this.meta = meta;
		this.lastModified = lastModified;
		this.shopItems = shopItems;
		this.guildHallBuildings = guildHallBuildings;
		this.items = items;
		this.monsterDrops = monsterDrops;
		this.questRewards = questRewards;
		this.quests = quests;
		this.itemRequirementsForItemId = itemRequirementsForItemId;
		this.questRequirements = questRequirements;
		this.userItems = userItems;
		this.mapEntities = mapEntities;
		this.itemRequirementsForReqItemId = itemRequirementsForReqItemId;
		this.codes = codes;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Enhancement getEnhancement() {
		return this.enhancement;
	}

	public void setEnhancement(Enhancement enhancement) {
		this.enhancement = enhancement;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public ElementType getElementType() {
		return this.elementType;
	}

	public void setElementType(ElementType elementType) {
		this.elementType = elementType;
	}

	public GameClass getGameClass() {
		return this.gameClass;
	}

	public void setGameClass(GameClass gameClass) {
		this.gameClass = gameClass;
	}

	public Faction getFaction() {
		return this.faction;
	}

	public void setFaction(Faction faction) {
		this.faction = faction;
	}

	public ItemType getItemType() {
		return this.itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
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

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getDps() {
		return this.dps;
	}

	public void setDps(int dps) {
		this.dps = dps;
	}

	public int getRange() {
		return this.range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getRarity() {
		return this.rarity;
	}

	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	public int getCost() {
		return this.cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getStack() {
		return this.stack;
	}

	public void setStack(int stack) {
		this.stack = stack;
	}

	public boolean isCoins() {
		return this.coins;
	}

	public void setCoins(boolean coins) {
		this.coins = coins;
	}

	public boolean isTemporary() {
		return this.temporary;
	}

	public void setTemporary(boolean temporary) {
		this.temporary = temporary;
	}

	public boolean isUpgrade() {
		return this.upgrade;
	}

	public void setUpgrade(boolean upgrade) {
		this.upgrade = upgrade;
	}

	public boolean isStaff() {
		return this.staff;
	}

	public void setStaff(boolean staff) {
		this.staff = staff;
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

	public String getReqQuests() {
		return this.reqQuests;
	}

	public void setReqQuests(String reqQuests) {
		this.reqQuests = reqQuests;
	}

	public int getQuestStringIndex() {
		return this.questStringIndex;
	}

	public void setQuestStringIndex(int questStringIndex) {
		this.questStringIndex = questStringIndex;
	}

	public int getQuestStringValue() {
		return this.questStringValue;
	}

	public void setQuestStringValue(int questStringValue) {
		this.questStringValue = questStringValue;
	}

	public String getMeta() {
		return this.meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public Set<ItemRequirement> getItemRequirementsForItemId() {
		return this.itemRequirementsForItemId;
	}

	public void setItemRequirementsForItemId(Set<ItemRequirement> itemRequirementsForItemId) {
		this.itemRequirementsForItemId = itemRequirementsForItemId;
	}

	public Set<Quest> getQuests() {
		return this.quests;
	}

	public void setQuests(Set<Quest> quests) {
		this.quests = quests;
	}

	public Set<MapEntity> getMapEntities() {
		return this.mapEntities;
	}

	public void setMapEntities(Set<MapEntity> mapEntities) {
		this.mapEntities = mapEntities;
	}

	public Set<ShopItem> getShopItems() {
		return this.shopItems;
	}

	public void setShopItems(Set<ShopItem> shopItems) {
		this.shopItems = shopItems;
	}

	public Set<QuestReward> getQuestRewards() {
		return this.questRewards;
	}

	public void setQuestRewards(Set<QuestReward> questRewards) {
		this.questRewards = questRewards;
	}

	public Set<MonsterDrop> getMonsterDrops() {
		return this.monsterDrops;
	}

	public void setMonsterDrops(Set<MonsterDrop> monsterDrops) {
		this.monsterDrops = monsterDrops;
	}

	public Set<UserItem> getUserItems() {
		return this.userItems;
	}

	public void setUserItems(Set<UserItem> userItems) {
		this.userItems = userItems;
	}

	public Set<QuestRequirement> getQuestRequirements() {
		return this.questRequirements;
	}

	public void setQuestRequirements(Set<QuestRequirement> questRequirements) {
		this.questRequirements = questRequirements;
	}

	public Set<ItemRequirement> getItemRequirementsForReqItemId() {
		return this.itemRequirementsForReqItemId;
	}

	public void setItemRequirementsForReqItemId(Set<ItemRequirement> itemRequirementsForReqItemId) {
		this.itemRequirementsForReqItemId = itemRequirementsForReqItemId;
	}

	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public Set<GuildHallBuilding> getGuildHallBuildings() {
		return this.guildHallBuildings;
	}

	public void setGuildHallBuildings(Set<GuildHallBuilding> guildHallBuildings) {
		this.guildHallBuildings = guildHallBuildings;
	}

	public Set<Code> getCodes() {
		return this.codes;
	}

	public void setCodes(Set<Code> codes) {
		this.codes = codes;
	}

	public boolean isHouse() {
		return this.getItemType().getEquipspot().getName().equals("ho") || this.getItemType().getEquipspot().getName().equals("hi");
	}

	public JSONObject getJSON(boolean includeEnhance) {
		JSONObject itemData = new JSONObject()
			.element("ItemID", this.getId())
			.element("bCoins", this.isCoins() ? 1 : 0)
			.element("bHouse", this.isHouse() ? 1 : 0)
			.element("bPTR", 0)
			.element("bStaff", this.isStaff() ? 1 : 0)
			.element("bTemp", this.isTemporary() ? 1 : 0)
			.element("bUpg", this.isUpgrade() ? 1 : 0)
			.element("iCost", this.getCost())
			.element("iDPS", this.getDps())
			.element("iLvl", this.getLevel())
			.element("iQSindex", this.getQuestStringIndex())
			.element("iQSvalue", this.getQuestStringValue())
			.element("iRng", this.getRange())
			.element("iRty", this.getRarity())
			.element("iStk", this.getStack())
			.element("sDesc", this.getDescription())
			.element("sES", this.getItemType().getEquipspot().getName())
			.element("sElmt", this.getElementType().getName())
			.element("sFile", this.getFile())
			.element("sIcon", this.getItemType().getIcon())
			.element("sLink", this.getLink())
			.element("sMeta", this.getMeta())
			.element("sName", this.getName())
			.element("sReqQuests", this.getReqQuests())
			.element("sType", this.getItemType().getName());
		if (this.getEnhancement().getId() > 0 && includeEnhance) {
			if (this.getItemType().getName().equals("Enhancement")) {
				itemData.element("PatternID", this.getEnhancement().getEnhancementPattern().getId())
					.element("iDPS", this.getEnhancement().getDps())
					.element("iLvl", this.getEnhancement().getLevel())
					.element("iRty", this.getEnhancement().getRarity())
					.element("EnhID", 0)
					.discard("sFile");
			} else {
				itemData.element("EnhID", this.getEnhancement().getId())
					.element("EnhLvl", this.getEnhancement().getLevel())
					.element("EnhPatternID", this.getEnhancement().getEnhancementPattern().getId())
					.element("EnhRty", this.getEnhancement().getRarity())
					.element("iRng", this.getRange())
					.element("EnhRng", this.getRange())
					.element("InvEnhPatternID", this.getEnhancement().getEnhancementPattern().getId())
					.element("EnhDPS", this.getEnhancement().getDps());
			}
		}

		return itemData;
	}

}
