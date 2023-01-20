package com.xworkz.crud.dto;

import java.time.LocalDateTime;

import com.xworkz.crud.constant.PizzaSize;

public class PizzaDto extends AbstractAuditDto {
	private String name;
	private String company;
	private PizzaSize size;
	private boolean cheese;
	private double price;
	private String flavor;
	private String type;

	public PizzaDto() {
		System.out.println("running pizzaDto default constructer");
	}

	public PizzaDto(String name, String company, PizzaSize size, boolean cheese, double price, String flavor,
			String type, String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.company = company;
		this.size = size;
		this.cheese = cheese;
		this.price = price;
		this.flavor = flavor;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "PizzaDto [name=" + name + ", company=" + company + ", size=" + size + ", cheese=" + cheese + ", price="
				+ price + ", flavor=" + flavor + ", type=" + type + ", toString()=" + super.toString() + "]";
	}

}
