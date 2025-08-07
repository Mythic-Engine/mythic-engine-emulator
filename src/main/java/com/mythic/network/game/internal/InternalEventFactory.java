/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.game.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class InternalEventFactory {

	private static final Properties internalEvents = new Properties();
	private static final Logger log
		= LoggerFactory.getLogger(InternalEventFactory.class);

	static {
		try (InputStream in = InternalEventFactory.class.getResourceAsStream("internalevent.properties")) {
			internalEvents.load(in);
		} catch (IOException ex) {
			log.error("Unable to load internalevent.properties", ex);
		}
	}

	public static InternalEvent create(String internalEvent) {
		try {
			Class<InternalEvent> requestDefinition = (Class<InternalEvent>) Class.forName(internalEvents.getProperty(internalEvent, "com.mythic.network.sfs.internal.DefaultInternalEvent"));
			return requestDefinition.getDeclaredConstructor().newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
		         InvocationTargetException ex) {
			log.error("Unable to create internal event", ex);
		}

		return new DefaultInternalEvent();
	}

}
