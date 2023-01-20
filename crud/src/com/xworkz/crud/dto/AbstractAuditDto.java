package com.xworkz.crud.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class AbstractAuditDto implements Serializable {

	private String createdBy;
	private LocalDateTime createdDate=LocalDateTime.now();
	private String updatedBy;
	private LocalDateTime updatedDate=LocalDateTime.now();

	public AbstractAuditDto() {
		System.out.println("calling the constructer in abstractAudiDto ");
	}

	public AbstractAuditDto(String createdBy) {
		super();
		this.createdBy = createdBy;
	}

	public AbstractAuditDto(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super();
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "AbstractAuditDto [createdBy=" + createdBy + ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime localDateTime) {
		this.createdDate = localDateTime;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

}
