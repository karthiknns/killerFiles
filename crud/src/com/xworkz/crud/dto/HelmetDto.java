package com.xworkz.crud.dto;

import com.xworkz.crud.constant.Colour;
import com.xworkz.crud.constant.HelmateType;

public class HelmetDto {

	private String brand;
	private Double price;
	private Colour colour;
	private HelmateType type;

	public HelmetDto() {
	System.out.println("running default constructer");
	}
	public HelmetDto(String brand, Double price, Colour colour, HelmateType type) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.type = type;
	}
	@Override
	public String toString() {
		return "HelmetDto [brand=" + brand + ", price=" + price + ", colour=" + colour + ", type=" + type
				+ "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Colour getColour() {
		return colour;
	}
	public void setColour(Colour colour) {
		this.colour = colour;
	}
	public HelmateType getType() {
		return type;
	}
	public void setType(HelmateType type) {
		this.type = type;
	}
	
}
