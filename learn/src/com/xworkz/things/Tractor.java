package com.xworkz.things;

public class Tractor {
	public String name;
	public String brand;
	public int price;
	public String colour;
	public int hp;
	public long model;

	public Tractor() {
		super();
		System.out.println("super chain started");
	}

	public Tractor(String name) {
		this();
		this.name = name;
		System.out.println("String name is" + name);
	}

	public Tractor(int price) {
		this();
		this.price = price;
		System.out.println("brand name is" + price);
	}

	public Tractor(long model) {
		this.model = model;
		System.out.println("model is     " + model);

	}

	public Tractor(String name, String brand) {
		this(name);
		this.brand = brand;
		System.out.println("brand name and name of tractor is  " + name + "        " + brand);
	}

	public Tractor(String name, String brand, int price, int hp) {
		this(name, brand);
		this.price = price;

		this.hp = hp;
		System.out.println(
				"brand name and name of tractor is  " + name + "       " + brand + "     " + price + "      " + hp);

	}

}
