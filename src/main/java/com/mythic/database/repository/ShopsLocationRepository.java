package com.mythic.database.repository;

import com.mythic.database.entities.ShopsLocation;
import com.mythic.database.entities.ShopsLocationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopsLocationRepository extends JpaRepository<ShopsLocation, ShopsLocationId> {

}