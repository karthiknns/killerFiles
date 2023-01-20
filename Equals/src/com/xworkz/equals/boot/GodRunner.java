package com.xworkz.equals.boot;

import com.xworkz.equals.things.God;

public class GodRunner {

	public static void main(String[] args) {
		
		
		
		
		// Godrunner
		
		
		God god=new God("Dk ravi","Kolar","demi god","pure heart",60000,"male","344","Kc valley");
		God god1=new God();
		boolean similar=god.equals(god1);  // passing reference in equals method
		
		System.out.println(similar);
		System.out.println(god1);
		
		

	}

}
