package com.xworkz.boot;

import com.xworkz.link.Colour;
import com.xworkz.link.Locations;
import com.xworkz.things.Sweet;

public class SweetRunner {

	public static void main(String[] args) {

		Sweet sweet;
		sweet=new Sweet(200,Colour.GREEN_WHITE);
		sweet.setLocation(Locations.BANGLORE,100);
	
		sweet.displayDetails();
		
	}

}
