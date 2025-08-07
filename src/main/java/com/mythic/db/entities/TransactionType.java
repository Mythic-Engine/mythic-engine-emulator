/*
 * Copyright (c) 2025.
 *
 * Mythic Engine Emulator is licensed under the MIT License.
 * See the LICENSE file for more information.
 */

package com.mythic.db.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class TransactionType implements Serializable {

	public static final int AC_ITEM_PURCHASE = 1;
	public static final int AC_ITEM_SELLBACK = 2;
	public static final int ITEM_PURCHASE = 3;
	public static final int ITEM_SELLBACK = 4;
	public static final int ITEM_REMOVE = 5;
	public static final int INVENTORY_TO_BANK = 7;
	public static final int BANK_INVENTORY_SWAP = 8;
	public static final int BANK_TO_INVENTORY = 9;
	private Integer id;
	private String name;
	private Set<UserTransaction> userTransactions = new HashSet<>(0);
	private Set<Code> codes = new HashSet<>(0);

	public TransactionType() {
	}

	public TransactionType(String name) {
		this.name = name;
	}

	public TransactionType(String name, Set userTransactions, Set codes) {
		this.name = name;
		this.userTransactions = userTransactions;
		this.codes = codes;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserTransaction> getUserTransactions() {
		return this.userTransactions;
	}

	public void setUserTransactions(Set<UserTransaction> userTransactions) {
		this.userTransactions = userTransactions;
	}

	public Set<Code> getCodes() {
		return this.codes;
	}

	public void setCodes(Set<Code> codes) {
		this.codes = codes;
	}

}
