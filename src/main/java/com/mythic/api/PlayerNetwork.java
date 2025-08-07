/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.api;

import io.netty.channel.Channel;

public abstract class PlayerNetwork {

	private int connectionId;

	public PlayerNetwork(int connectionId) {
		this.connectionId = connectionId;
	}

	/**
	 * Close the connection.
	 */
	public abstract void close();

	/**
	 * Gets the connection id.
	 *
	 * @return the connection id
	 */
	public int getConnectionId() {
		return connectionId;
	}

	/**
	 * Sets the connection id.
	 *
	 * @param connectionId the new connection id
	 */
	public void setConnectionId(int connectionId) {
		this.connectionId = connectionId;
	}

	/**
	 * Flush all data written to socket.
	 */
	public abstract void flush();

	public abstract void send(String[] msg);

	public abstract void sendQueued(String[] msg);

	public abstract Channel getChannel();

}
