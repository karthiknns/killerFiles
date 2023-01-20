package com.xworkz.soldires.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public abstract class AbstractAuditDto implements Serializable {
	private String createdby;
	private LocalDate createdDate;
	private String updatedby;
	private LocalDate updatedDate;
}
