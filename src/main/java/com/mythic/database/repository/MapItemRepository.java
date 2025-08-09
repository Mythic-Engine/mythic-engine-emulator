package com.mythic.database.repository;

import com.mythic.database.entities.MapItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapItemRepository extends JpaRepository<MapItem, Integer> {

}