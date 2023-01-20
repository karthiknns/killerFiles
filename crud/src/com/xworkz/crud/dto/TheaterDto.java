package com.xworkz.crud.dto;

import java.time.LocalDateTime;

import com.xworkz.crud.constant.Seats;

public class TheaterDto extends AbstractAuditDto {

	private int id;
	private String name;
	private String brand;
	private Seats seats;

	public TheaterDto() {
		System.out.println("running default constructer of theater dto");
	}

	public TheaterDto(int id, String name, String brand, Seats seats, String createdBy, LocalDateTime createdDate,
			String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "TheaterDto [id=" + id + ", name=" + name + ", brand=" + brand + ", seats=" + seats + ", toString()="
				+ super.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Seats getSeats() {
		return seats;
	}

	public void setSeats(Seats seats) {
		this.seats = seats;
	}



}
