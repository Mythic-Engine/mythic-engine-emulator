package com.mythic.database.repository;

import com.mythic.database.entities.HairsShopsItem;
import com.mythic.database.entities.HairsShopsItemId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HairsShopsItemRepository extends JpaRepository<HairsShopsItem, HairsShopsItemId> {

}