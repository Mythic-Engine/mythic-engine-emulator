package com.mythic.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserIpId implements Serializable {

	private static final long serialVersionUID = 4343768594633115628L;
	@Column(name = "IPAddress", nullable = false)
	private Long iPAddress;

	@Column(name = "UserID", nullable = false)
	private Integer userID;

	public Long getIPAddress() {
		return iPAddress;
	}

	public void setIPAddress(Long iPAddress) {
		this.iPAddress = iPAddress;
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		UserIpId entity = (UserIpId) o;
		return Objects.equals(this.iPAddress, entity.iPAddress) &&
			Objects.equals(this.userID, entity.userID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(iPAddress, userID);
	}

}