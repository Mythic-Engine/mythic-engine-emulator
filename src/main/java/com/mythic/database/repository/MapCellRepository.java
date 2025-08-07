package com.mythic.database.repository;

import com.mythic.database.entities.MapCell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MapCellRepository extends JpaRepository<MapCell, Integer> {

}