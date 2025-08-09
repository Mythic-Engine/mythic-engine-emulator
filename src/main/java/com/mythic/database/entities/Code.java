package com.mythic.database.entities;

import com.mythic.database.EntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "codes")
public class Code extends EntityBase {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "TypeTransactionID", nullable = false)
	private TypeTransaction typeTransaction;

	@Column(name = "Code", nullable = false, length = 16)
	private String code;

	@Column(name = "coins", nullable = false)
	private Boolean coins = false;

	@Column(name = "Amount", nullable = false)
	private Integer amount;

	public TypeTransaction getTypeTransaction() {
		return typeTransaction;
	}

	public Code setTypeTransaction(TypeTransaction typeTransaction) {
		this.typeTransaction = typeTransaction;
		return this;
	}

	public String getCode() {
		return code;
	}

	public Code setCode(String code) {
		this.code = code;
		return this;
	}

	public Boolean getCoins() {
		return coins;
	}

	public Code setCoins(Boolean coins) {
		this.coins = coins;
		return this;
	}

	public Integer getAmount() {
		return amount;
	}

	public Code setAmount(Integer amount) {
		this.amount = amount;
		return this;
	}

}