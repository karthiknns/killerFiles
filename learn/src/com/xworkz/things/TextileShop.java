package com.xworkz.things;

public class TextileShop {
	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public int ownerDaughterNumber;
	public double ownerNoOfWifes;
	public int shopNo;

	public TextileShop() {
		System.out.println("default constructer");
	}

	public TextileShop(String ownerName) {
		this();
		this.ownerName = ownerName;
		System.out.println("linked with default constructer");
	}

	public TextileShop(String ownerName, String ownerDaughterName) {
		this(ownerName);
		this.ownerDaughterName = ownerDaughterName;
		System.out.println("linked with owner name");
	}

	public TextileShop(String ownerName, String ownerDaughterName, String ownerWifeName) {
		this(ownerName, ownerDaughterName);
		this.ownerWifeName = ownerWifeName;
		System.out.println("linked with owner name,daughter name");
	}

	public TextileShop(String ownerName, String ownerDaughterName, String ownerWifeName, int ownerDaughterNumber) {
		this(ownerName, ownerDaughterName, ownerWifeName);
		this.ownerDaughterNumber = ownerDaughterNumber;
		System.out.println("linked with owner name,daughter name,wife name");
	}

	public TextileShop(String ownerName, String ownerDaughterName, String ownerWifeName, int ownerDaughterNumber,
			double ownerNoOfWifes) {
		this(ownerName, ownerDaughterName, ownerWifeName, ownerDaughterNumber);
		this.ownerNoOfWifes = ownerNoOfWifes;
		System.out.println("linked with owner name,daughter name,wife name, daughter number");
	}

	public TextileShop(String ownerName, String ownerDaughterName, String ownerWifeName, int ownerDaughterNumber,
			double ownerNoOfWifes, int shopNo) {
		this(ownerName, ownerDaughterName, ownerWifeName, ownerDaughterNumber, ownerNoOfWifes);
		this.shopNo = shopNo;
		System.out.println("linked with owner name,daughter name,wife name, daughter number& no of wifes");
	}
}
