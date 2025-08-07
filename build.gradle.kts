/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

plugins {
    id("java")
    id("com.github.ben-manes.versions") version "0.52.0"
}

group = "com.mythic"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.ehcache:ehcache:3.10.8")
    implementation("com.zaxxer:HikariCP:7.0.0")
    implementation("net.sf.json-lib:json-lib:2.4:jdk15")
    implementation("org.json:json:20250517")
    implementation("org.slf4j:slf4j-jdk14:2.0.13")
    implementation("org.slf4j:slf4j-api:2.0.13")
    implementation("org.mariadb.jdbc:mariadb-java-client:3.5.4")
    implementation("com.google.guava:guava:33.4.8-jre")
    implementation("io.netty:netty-all:4.1.123.Final")
    implementation("joda-time:joda-time:2.14.0")
    implementation("org.apache.commons:commons-math3:3.6.1")
    implementation("org.apache.commons:commons-io:1.3.2")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.17.1")
    implementation("org.apache.commons:commons-text:1.14.0")
    implementation("be.cyberelf.nanoxml:nanoxml:2.2.3")
}