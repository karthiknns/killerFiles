package com.xworkz.things;

public class Temple {
	public String name;
	public God god = new God("Hanuman", "male", "hitting");
	public String mainPriest;
	public int noOfVisiters;
	public int collectionperDay;

	public Temple(String name, String mainPriest, int noOfVisiters, int collectionperDay) {
		super();
		this.name = name;
		this.mainPriest = mainPriest;
		this.noOfVisiters = noOfVisiters;
		this.collectionperDay = collectionperDay;
	}

	public void display() {
		System.out.println("tempel in a mountain");
		System.out.println("temple name is-- " + this.name);
		System.out.println("temple mainPriest name is-- " + this.mainPriest);
		System.out.println("temple noOfVisiters is-- " + this.noOfVisiters);
		System.out.println("temple collectionperDay is-- " + this.collectionperDay);
		god.display();
	}

}
