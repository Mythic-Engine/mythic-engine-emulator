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

public class Code implements Serializable {

	private Integer id;
	private TransactionType transactionType;
	private String code;
	private boolean coins;
	private int amount;
	private Set<Item> items = new HashSet<>(0);

	public Code() {
	}

	public Code(TransactionType transactionType, String code, boolean coins, int amount) {
		this.transactionType = transactionType;
		this.code = code;
		this.coins = coins;
		this.amount = amount;
	}

	public Code(TransactionType transactionType, String code, boolean coins, int amount, Set items) {
		this.transactionType = transactionType;
		this.code = code;
		this.coins = coins;
		this.amount = amount;
		this.items = items;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TransactionType getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isCoins() {
		return this.coins;
	}

	public void setCoins(boolean coins) {
		this.coins = coins;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Set<Item> getItems() {
		return this.items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

}
