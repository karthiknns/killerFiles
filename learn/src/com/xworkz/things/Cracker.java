package com.xworkz.things;

import com.xworkz.link.Items;

public class Cracker {

	public static int boxPrice;
	public String shopName;
	public Items itemsInBox = Items.FLOWER_POT;
	public String brand;
	public String location;

	public Cracker(String location, String brand) {
		this.brand = brand;
		this.location = location;

	}

	static {
		Cracker.boxPrice = 450;

	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public void displayDetails() {
		System.out.println("boxPrice is --" + Cracker.boxPrice);
		System.out.println("shopName is --" + this.shopName);
		System.out.println("itemsInBox is --" + this.itemsInBox);
		System.out.println("location is --" + this.location);
		System.out.println("brand is --" + this.brand);

	}
}
