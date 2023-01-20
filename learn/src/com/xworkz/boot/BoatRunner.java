package com.xworkz.boot;

import com.xworkz.things.Boat;

public class BoatRunner {

	public static void main(String[] args) {

		Boat boat = new Boat();
		System.out.println(boat.colour = "black");
		System.out.println(boat.companyName = "croisiEurope");
		System.out.println(boat.name = "gale");
		System.out.println(boat.owner = "karthik");
		System.out.println(boat.price = 2000000);

		System.out.println("************price*********************");
		Boat boat1 = new Boat(30000);
		System.out.println(boat1.colour = "black");
		System.out.println(boat1.companyName = "croisiEurope");
		System.out.println(boat1.name = "gale");
		System.out.println(boat1.owner = "karthik");
		System.out.println(boat1.price);

		System.out.println("*************name********************");
		Boat boat2 = new Boat("sharma");
		System.out.println(boat2.colour = "black");
		System.out.println(boat2.companyName = "croisiEurope");
		System.out.println(boat2.name);
		System.out.println(boat2.owner = "karthik");
		System.out.println(boat2.price);

		System.out.println("***********colour /company name**********************");
		Boat boat3 = new Boat("red", "apple");
		System.out.println(boat3.colour);
		System.out.println(boat3.companyName);
		System.out.println(boat3.name = "gale");
		System.out.println(boat3.owner = "karthik");
		System.out.println(boat3.price);

		System.out.println("************colour /price*********************");
		Boat boat4 = new Boat("white", 10000);
		System.out.println(boat4.colour);
		System.out.println(boat4.companyName = "croisiEurope");
		System.out.println(boat4.name = "gale");
		System.out.println(boat4.owner = "karthik");
		System.out.println(boat4.price);

		System.out.println("**********price/name***********************");
		Boat boat5 = new Boat(123456, "adhani");
		System.out.println(boat5.colour = "black");
		System.out.println(boat5.companyName = "croisiEurope");
		System.out.println(boat5.name);
		System.out.println(boat5.owner = "karthik");
		System.out.println(boat5.price);

	}

}
