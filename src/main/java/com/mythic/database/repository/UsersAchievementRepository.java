package com.mythic.database.repository;

import com.mythic.database.entities.UsersAchievement;
import com.mythic.database.entities.UsersAchievementId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersAchievementRepository extends JpaRepository<UsersAchievement, UsersAchievementId> {

}