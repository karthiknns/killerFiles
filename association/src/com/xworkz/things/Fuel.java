package com.xworkz.things;

import com.xworkz.link.Type;

public class Fuel {
	public Brand brand = new Brand("bharath petroleam", 1254673891, "banglore", 4.5);
	public boolean special;
	public Type type;
	public double price;
	public double quantity;

	public Fuel(boolean special, double price, double quantity) {
		super();
		this.special = special;
		this.price = price;
		this.quantity = quantity;
	}

	public void totalPrice() {
		double total;
		total = price * quantity;
		System.out.println("total price is   -- " + total);
	}

	public void displayDetails() {
		System.out.println("special of fuel is --" + this.special);
		System.out.println("price of fuel is --" + this.price);
		System.out.println("quantity of fuel is --" + this.quantity);
		System.out.println("type of fuel- *--" + Type.PETROL);
		totalPrice();
		brand.displayDetails();

	}
}
