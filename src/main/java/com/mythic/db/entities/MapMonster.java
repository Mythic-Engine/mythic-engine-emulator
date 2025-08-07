/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class MapMonster implements Serializable {

	private MapMonsterId id;
	private MonsterEntity monster;
	private MapEntity mapEntity;

	public MapMonster() {
	}

	public MapMonster(MapMonsterId id, MonsterEntity monster, MapEntity mapEntity) {
		this.id = id;
		this.monster = monster;
		this.mapEntity = mapEntity;
	}

	public MapMonsterId getId() {
		return this.id;
	}

	public void setId(MapMonsterId id) {
		this.id = id;
	}

	public MonsterEntity getMonster() {
		return this.monster;
	}

	public void setMonster(MonsterEntity monster) {
		this.monster = monster;
	}

	public MapEntity getMapEntity() {
		return this.mapEntity;
	}

	public void setMapEntity(MapEntity mapEntity) {
		this.mapEntity = mapEntity;
	}

}
