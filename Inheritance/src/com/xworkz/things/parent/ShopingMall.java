package com.xworkz.things.parent;

public class ShopingMall {
	public String name;
	public String colour;
	public int noOfWorkers;

	public ShopingMall(String name, String colour, int noOfWorkers) {
		super();
		this.name = name;
		this.colour = colour;
		this.noOfWorkers = noOfWorkers;
	}

	public void display() {
		System.out.println("name is  " + this.name);
		System.out.println("colour is  " + this.colour);
		System.out.println("noOfWorkers is  " + this.noOfWorkers);
	}
}
