package com.mythic.database.repository;

import com.mythic.database.entities.ShopsItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopsItemRepository extends JpaRepository<ShopsItem, Integer> {

}