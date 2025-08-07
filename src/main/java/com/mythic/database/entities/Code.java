package com.mythic.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "codes")
public class Code {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "TransactionTypeID", nullable = false)
	private TypeTransaction transactionTypeID;

	@Column(name = "Code", nullable = false, length = 16)
	private String code;

	@Column(name = "Coins", nullable = false)
	private Boolean coins = false;

	@Column(name = "Amount", nullable = false)
	private Integer amount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TypeTransaction getTransactionTypeID() {
		return transactionTypeID;
	}

	public void setTransactionTypeID(TypeTransaction transactionTypeID) {
		this.transactionTypeID = transactionTypeID;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getCoins() {
		return coins;
	}

	public void setCoins(Boolean coins) {
		this.coins = coins;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}