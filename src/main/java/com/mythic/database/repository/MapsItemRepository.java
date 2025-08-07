package com.mythic.database.repository;

import com.mythic.database.entities.MapsItem;
import com.mythic.database.entities.MapsItemId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapsItemRepository extends JpaRepository<MapsItem, MapsItemId> {

}