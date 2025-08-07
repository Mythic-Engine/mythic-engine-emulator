package com.mythic.database.repository;

import com.mythic.database.entities.QuestRequirement;
import com.mythic.database.entities.QuestRequirementId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestRequirementRepository extends JpaRepository<QuestRequirement, QuestRequirementId> {

}