package com.mythic.database.repository;

import com.mythic.database.entities.MapEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapRepository extends JpaRepository<MapEntity, Integer> {

}