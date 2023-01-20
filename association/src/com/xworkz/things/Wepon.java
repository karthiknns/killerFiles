package com.xworkz.things;

public class Wepon {
	public String name;
	public String use;
	public double weight;

	public Wepon(String name, String use, double weight) {
		super();
		this.name = name;
		this.use = use;
		this.weight = weight;
	}

	public void display() {
		System.out.println("wepon properties and usecfor god");
		System.out.println("wepon name is --- " + this.name);
		System.out.println("wepon use is --- " + this.use);
		System.out.println("wepon weight is --- " + this.weight);

	}
}
