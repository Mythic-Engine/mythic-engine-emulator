package com.mythic.database.repository;

import com.mythic.database.entities.ShopItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopItemRepository extends JpaRepository<ShopItem, Integer> {

}