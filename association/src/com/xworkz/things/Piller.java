package com.xworkz.things;

import com.xworkz.link.Shape;

public class Piller {
	public int id;
	public String place;
	public Shape shape;
	public double height;
	public String supporting;
	public Company company = new Company("pristage", "constructing");

	public Piller(int id, String place, double height, String supporting) {
		super();
		this.id = id;
		this.place = place;
		this.height = height;
		this.supporting = supporting;
	}

	public void showOff() {
		System.out.println("piller id is" + this.id);
		System.out.println("piller place is" + this.place);
		System.out.println("piller shape is" + Shape.CIRCLE);
		System.out.println("piller height is" + this.height);
		System.out.println("piller supporting is" + this.supporting);
		company.showOff();

	}
}
