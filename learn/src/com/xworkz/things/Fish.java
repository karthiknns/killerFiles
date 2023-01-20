package com.xworkz.things;

public class Fish {
	public String name;
	public String type;
	public int price;
	public double length;
	public float weight;

	public Fish() {

		System.out.println("constructer 1");
	}

	public Fish(String name) {
		this.name = name;
	}

	public Fish(String type, int price) {
		this.type = type;
		this.price = price;
	}

	public Fish(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public Fish(int price) {
		this.price = price;
	}

	public Fish(double length) {
		this.length = length;
	}

	public Fish(float weight) {
		this.weight = weight;
	}

}
