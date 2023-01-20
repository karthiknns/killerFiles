package com.xworkz.crud.dto;

public class SanitizerDto {

	private String brand;
	private int    id;
	private double price;
	private String colour;
	
	public SanitizerDto() {

	}

	public SanitizerDto(String brand, int id, double price, String colour) {
		super();
		this.brand = brand;
		this.id = id;
		this.price = price;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "SanitizerDto [brand=" + brand + ", id=" + id + ", price=" + price + ", colour=" + colour + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
