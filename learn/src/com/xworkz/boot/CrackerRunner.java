package com.xworkz.boot;

import com.xworkz.things.Cracker;

public class CrackerRunner{

	public static void main(String[] args) {
		Cracker cracker;
		cracker = new Cracker("Banglore", "lakshi");
		cracker.setShopName("ravi fire works");
		cracker.displayDetails();
	}

}
