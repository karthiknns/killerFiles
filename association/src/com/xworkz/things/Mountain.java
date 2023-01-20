package com.xworkz.things;

public class Mountain {
	public String name;
	public Location location = new Location("nandi", "chikkaballapur", "karnataka", 563130, "India");
	public float height;
	public Temple temple = new Temple("Hanuman temple", "Madesh", 25000, 50000);

	public Mountain(String name, float height) {
		super();
		this.name = name;
		this.height = height;
	}

	public void display() {
		System.out.println("mountain name is -- " + this.name);
		System.out.println("mountain height is -- " + this.height);
		location.display();
		temple.display();
	}
}
