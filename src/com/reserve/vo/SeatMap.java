package com.reserve.vo;

import java.util.Date;

/**
 * Seatmap generated by hbm2java
 */
public class SeatMap implements java.io.Serializable {

	private SeatMapId id;
	private Status status;
	private SeatHold hold;
	private Date createdDate;

	public SeatMap() {
	}

	public SeatMap(SeatMapId id, Status status, SeatHold hold, Date createdDate) {
		this.id = id;
		this.status = status;
		this.hold = hold;
		this.createdDate = createdDate;
	}
	
	@Override
	public String toString() {
		return id.toString();
	}

	public SeatMapId getId() {
		return this.id;
	}

	public void setId(SeatMapId id) {
		this.id = id;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public SeatHold getHold() {
		return this.hold;
	}

	public void setHold(SeatHold hold) {
		this.hold = hold;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}