package com.mythic.database.repository;

import com.mythic.database.entities.ItemsRequirement;
import com.mythic.database.entities.ItemsRequirementId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRequirementRepository extends JpaRepository<ItemsRequirement, ItemsRequirementId> {

}