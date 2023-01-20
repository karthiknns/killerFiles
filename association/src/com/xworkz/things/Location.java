package com.xworkz.things;

public class Location {
	public String street;
	public String city;
	public String state;
	public int pinCode;
	public String country;

	public Location(String street, String city, String state, int pinCode, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.country = country;
	}

	public void display() {
		System.out.println("location of mountain");
		System.out.println("street name is -- " + this.street);
		System.out.println("city name is -- " + this.city);
		System.out.println("state name is -- " + this.state);
		System.out.println("pinCode name is -- " + this.pinCode);
		System.out.println("country name is -- " + this.country);
	}

}
