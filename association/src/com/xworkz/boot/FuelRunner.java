package com.xworkz.boot;

import com.xworkz.things.Fuel;

public class FuelRunner {

	public static void main(String[] args) {
		Fuel fuel;
		fuel = new Fuel(true, 101.5, 4.5);
		fuel.displayDetails();
	}

}
