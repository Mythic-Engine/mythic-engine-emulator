package com.mythic.database.repository;

import com.mythic.database.entities.HairShopItem;
import com.mythic.database.entities.HairShopItemId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HairShopItemRepository extends JpaRepository<HairShopItem, HairShopItemId> {

}