package com.xworkz.things;

public class Brand {
	public String name;
	public int gstNo;
	public String location;
	public double rating;

	public Brand(String name, int gstNo, String location, double rating) {
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.location = location;
		this.rating = rating;
	}

	public void displayDetails() {
		System.out.println("brand name is--" + this.name);
		System.out.println(" gstNo is--" + this.gstNo);
		System.out.println("location name is--" + this.location);
		System.out.println("brand rating is--" + this.rating);

	}
}
