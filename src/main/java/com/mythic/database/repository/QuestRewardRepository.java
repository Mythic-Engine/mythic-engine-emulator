package com.mythic.database.repository;

import com.mythic.database.entities.QuestReward;
import com.mythic.database.entities.QuestRewardId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestRewardRepository extends JpaRepository<QuestReward, QuestRewardId> {

}