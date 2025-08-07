/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.game.data;

import com.mythic.avatars.Adventurer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserRequestFilter {

	public final HashMap<String, Long> skills = new LinkedHashMap<>();

	private final Adventurer player;
	private final ConcurrentHashMap<String, Long> requests = new ConcurrentHashMap<>();
	private final ConcurrentHashMap<String, Integer> requestsWarnings = new ConcurrentHashMap<>();

	public int exceptionCount = 0;
	public int skillWarningCount = 0;

	public UserRequestFilter(Adventurer player) {
		this.player = player;
	}

	public boolean isRequestAllowed(RequestData request, Object[] args) {
		String requestName = request.annotation().name();

		long now = System.currentTimeMillis();

		// Get the time of the last request for this name, or 0 if none has been made
		long lastRequestTime = this.requests.getOrDefault(requestName, 0L);

		// Calculate the time elapsed since the last request
		long timeSinceLastRequest = now - lastRequestTime;

		// If the time elapsed is less than the rate limit, log a violation and return false
		if (timeSinceLastRequest < request.annotation().rateLimit()) {
			Database.open();
			player.recordViolation(requestName, "Too many requests! time since last request: %d/%d (%s)".formatted(timeSinceLastRequest, request.annotation().rateLimit(), Arrays.toString(args)));
			Database.close();

			int warnings = this.requestsWarnings.getOrDefault(requestName, 0);

			warnings++;

			this.requestsWarnings.put(requestName, warnings);

			if (warnings >= request.annotation().warningLimit()) {
				Database.open();
				player.recordViolation(requestName, "Warning limit exceeded! warnings: %d/%d (%s)".formatted(warnings, request.annotation().warningLimit(), Arrays.toString(args)));

				if (request.annotation().kick()) {
					player.kick();
				}

				Database.close();
			}

			return false;
		}

		// Reset warnings
		int warnings = this.requestsWarnings.getOrDefault(requestName, 0);

		if (warnings > 1) {
			this.requestsWarnings.put(requestName, 0);
		}

		// Update the time of the last request for this name
		this.requests.put(requestName, now);

		return true;
	}

}
