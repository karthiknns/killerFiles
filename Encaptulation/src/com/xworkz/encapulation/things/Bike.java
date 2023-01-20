package com.xworkz.encapulation.things;

public class Bike {

	private static String bikeName;
	private String company;
	private int price;
	private double milage;
	private int noOfWheels;
	String colour;
	

	public static String getBikeName() {
		return bikeName;
	}
	
	public static void setBikeName(String bikeName) {
		Bike.bikeName = bikeName;
	}
	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getMilage() {
		return milage;
	}

	public void setMilage(double milage) {
		this.milage = milage;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

}
