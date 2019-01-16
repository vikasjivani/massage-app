package com.axelor.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="leave")
public class Leave {
	
	@Id
	@Column(name = "lid")
	@GeneratedValue
	private int lid;
	@Column(name="leaveDate")
	private String leaveDate;
	@Column(name="returnDate")
	private String returnDate;
	@Column(name="reason")
	private String reason;
	@Column(name="status")
	private int status;
	@Column(name="action")
	private int action;
	
	@ManyToOne
	@JoinColumn(name="uid")
	User user;
	
	
	
	
	
	public Leave(String leaveDate, String returnDate, String reason, int status, int action, User user) {
	
		this.leaveDate = leaveDate;
		this.returnDate = returnDate;
		this.reason = reason;
		this.status = status;
		this.action = action;
		this.user = user;
	}

	
	public Leave() {}
		

	
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(String leaveDate) {
		this.leaveDate = leaveDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getAction() {
		return action;
	}
	public void setAction(int action) {
		this.action = action;
	}
	
	
	
	
	
	
}

