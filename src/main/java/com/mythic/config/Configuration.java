/*
 * Copyright (c) 2024-2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */
package com.mythic.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.mythic.config.data.DatabaseData;
import com.mythic.config.data.GameData;

import java.io.File;

public record Configuration(int id, String name, GameData game, DatabaseData database) {

	private static final Configuration data;

	static {
		try {
			data = new ObjectMapper(new YAMLFactory())
				.readValue(
					new File(String.format("%s%sconf%s%s", (new File(".").getCanonicalPath()), File.separatorChar, File.separatorChar, "config.yml")),
					Configuration.class
				);
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}

	public static Configuration singleton() {
		return data;
	}

}


