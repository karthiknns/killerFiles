package com.xworkz.things;

public class Company {

	public String name;
	public String type;

	public Company(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public void showOff() {
		System.out.println("Company name is --" + this.name);
		System.out.println("Company type is --" + this.type);

	}
}
