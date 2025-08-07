/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.api;

public abstract class ServerHandler {

	private Integer port;
	private String ip;

	public ServerHandler(String ip, Integer port) {
		this.port = port;
		this.ip = ip;
	}

	/**
	 * Create socket.
	 *
	 * @return true, if successful
	 */
	public abstract void createSocket();

	/**
	 * Bind socket.
	 *
	 * @return true, if successful
	 */
	public abstract boolean bind();

	/**
	 * Gets the port.
	 *
	 * @return the port
	 */
	public Integer getPort() {
		return port;
	}

	/**
	 * Sets the port.
	 *
	 * @param port the new port
	 */
	public void setPort(Integer port) {
		this.port = port;
	}

	/**
	 * Gets the ip.
	 *
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * Sets the ip.
	 *
	 * @param ip the new ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

}
