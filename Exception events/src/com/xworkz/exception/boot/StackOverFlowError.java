package com.xworkz.exception.boot;

public class StackOverFlowError {
	
	  
	
	public static void passenger() {
		System.out.println("running passengers");
		passenger();
		
	}

	public static void main(String[] args) {


       passenger();
	}

}
