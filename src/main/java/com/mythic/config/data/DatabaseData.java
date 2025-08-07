/*
 * Copyright (c) 2024-2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */
package com.mythic.config.data;

public record DatabaseData(String host, int port, String user, String password, String database, int maximumPoolSize) {

    public String JDBC_URL() {
        return "jdbc:mariadb://%s:%s/%s".formatted(host(), port(), database());
    }

}
