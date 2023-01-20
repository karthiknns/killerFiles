package com.xworkz.boot;

import com.xworkz.things.*;

public class MangoRunner {

	public static void main(String[] args) {

		Mango mango;
		mango = new Mango("milanser", 300);
		mango.setTotal(10, 5);
		mango.displayDetails();
	}

}
