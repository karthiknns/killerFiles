package com.xworkz.things.boot;

import com.xworkz.things.child.Hotel;

public class CateringRunner {

	public static void main(String[] args) {
		Hotel hotel=new Hotel("banglore", 4, 10, false, "DP",""
				+ " Dharshan");
		
		System.out.println("hotel location is  "+hotel.location);
		System.out.println("name is  "+hotel.name);
		System.out.println("noOfChefs is  "+hotel.noOfChefs);
		System.out.println("owner is  "+hotel.owner);
		System.out.println("servents is  "+hotel.servents);
		System.out.println("veg is  "+hotel.veg);
		
	}

}
