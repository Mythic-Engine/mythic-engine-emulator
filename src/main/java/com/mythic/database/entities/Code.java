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

}