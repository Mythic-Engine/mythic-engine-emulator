/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.network.game;

import java.net.SocketAddress;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class Game {

	public static double RATE_EXP = 1;
	public static double RATE_COINS = 1;
	public static double RATE_REP = 1;
	public static double RATE_CP = 1;
	public static double RATE_DROP = 1;

	private static final ConcurrentHashMap<String, String> connected = new ConcurrentHashMap<>();

	private static final ConcurrentHashMap<String, String> allowed = new ConcurrentHashMap<>();

	private static final ConcurrentHashMap<String, Long> bannedIP = new ConcurrentHashMap<>();

	//private final Map<Integer, Party> parties = new HashMap<>();

	/*
	 * Count
	 */
	public static int connectedCount() {
		return connected.size();
	}

	public static int allowedCount() {
		return allowed.size();
	}

	public static int banCount() {
		return bannedIP.size();
	}

	/*public int partiesCount() {
		return parties.size();
	}*/

	/*
	 * Check or Get
	 */
	public static boolean isConnected(SocketAddress sa) {
		return connected.containsKey(sa.toString().replace("/", "").split(":")[0]);
	}

	public static boolean isAllowed(String username) {
		return allowed.containsKey(username.toLowerCase());
	}

	public static boolean isBanned(SocketAddress sa) {
		String ip = sa.toString().replace("/", "").split(":")[0];

		if (!bannedIP.containsKey(ip)) {
			return false;
		}

		if (bannedIP.get(ip) + TimeUnit.MINUTES.toMillis(1) > System.currentTimeMillis()) {
			bannedIP.remove(ip);
			return false;
		}

		return true;
	}

	/*public Party party(int id) {
		return parties.get(id);
	}*/

	/*
	 * Add
	 */
	public static void connect(SocketAddress sa, String username) {
		connected.put(sa.toString().replace("/", "").split(":")[0], username.toLowerCase());
	}

	public static void allow(String username, String token) {
		allowed.put(username.toLowerCase(), token);
	}

	public static void banIP(SocketAddress sa, Long time) {
		bannedIP.put(sa.toString().replace("/", "").split(":")[0], time);
	}

	public static void banIP(String sa, Long time) {
		bannedIP.put(sa, time);
	}

	/*public void party(int partyId, Party party) {
		parties.put(partyId, party);
	}*/

	/*
	 * Remove
	 */
	public static void removeConnected(SocketAddress sa) {
		connected.remove(sa.toString().replace("/", "").split(":")[0]);
	}

	public static void removeAllowed(String username) {
		allowed.remove(username.toLowerCase());
	}

	public static void removeBannedIP(SocketAddress sa) {
		bannedIP.remove(sa.toString().replace("/", "").split(":")[0]);
	}

	public static void removeBannedIP(String ip) {
		bannedIP.remove(ip);
	}

	/*public void removeParty(int id) {
		parties.remove(id);
	}*/

	/*
	 * Clear
	 */
	public static void clearBanned() {
		bannedIP.clear();
	}

}
