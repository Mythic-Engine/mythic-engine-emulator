package com.mythic.database.repository;

import com.mythic.database.entities.ShopLocation;
import com.mythic.database.entities.ShopLocationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopLocationRepository extends JpaRepository<ShopLocation, ShopLocationId> {

}