/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;

public class UserIPId implements Serializable {

	private int userId;
	private long ipaddress;

	public UserIPId() {
	}

	public UserIPId(int userId, long ipaddress) {
		this.userId = userId;
		this.ipaddress = ipaddress;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public long getIpaddress() {
		return this.ipaddress;
	}

	public void setIpaddress(long ipaddress) {
		this.ipaddress = ipaddress;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 89 * hash + this.userId;
		return 89 * hash + (int) (this.ipaddress ^ this.ipaddress >>> 32);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			UserIPId other = (UserIPId) obj;
			return this.userId == other.userId && this.ipaddress == other.ipaddress;
		}
	}

}
