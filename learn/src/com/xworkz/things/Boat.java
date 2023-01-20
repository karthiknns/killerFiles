package com.xworkz.things;

import java.security.PublicKey;

public class Boat {
	public String name;
	public String colour;
	public String companyName;
	public String owner;
	public int price;

	public Boat() {
		System.out.println("boat run madu");

	}

	public Boat(String name) {
		this.name = name;

	}

	public Boat(int price) {
		this.price = price;

	}

	public Boat(String colour, String companyName) {
		this.colour = colour;
		this.companyName = companyName;

	}

	public Boat(String colour, int price) {
		this.colour = colour;
		this.price = price;

	}

	public Boat(int price, String name) {
		this.price = price;
		this.name = name;

	}

}
