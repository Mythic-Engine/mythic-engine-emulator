package com.mythic.database.repository;

import com.mythic.database.entities.QuestLocation;
import com.mythic.database.entities.QuestLocationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestLocationRepository extends JpaRepository<QuestLocation, QuestLocationId> {

}