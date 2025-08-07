package com.mythic.database.repository;

import com.mythic.database.entities.MapItem;
import com.mythic.database.entities.MapItemId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapItemRepository extends JpaRepository<MapItem, MapItemId> {

}