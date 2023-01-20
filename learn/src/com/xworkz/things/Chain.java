package com.xworkz.things;

public class Chain {
	public String type;
	public double length;
	public String material;
	public int weight;
	public boolean stolen;
	public String usedFor;
	public boolean fresh;

	public Chain() {
		System.out.println("super class is implicited.....");
	}

	public Chain(String type) {
		this();
		this.type = type;
		System.out.println("linked with super class");
	}

	public Chain(String type, double length) {
		this("gold");
		this.length = length;
		System.out.println("linked with  type");
	}

	public Chain(String type, double length, int weight) {
		this(type, length);
		this.weight = weight;

		System.out.println("linked with type and string");
	}

	public Chain(String type, double length, int weight, String material) {
		this(type, length, weight);
		this.material = material;
		System.out.println("linked with type ,length & weight");
	}

	public Chain(String type, double length, int weight, String material, boolean fresh) {
		this("gold", 10.5d, 140, "copper & gold");
		this.fresh = fresh;
		System.out.println("linked type ,length & weight& material ");
	}

}
