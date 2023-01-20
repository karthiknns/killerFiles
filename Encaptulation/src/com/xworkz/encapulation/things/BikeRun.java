package com.xworkz.encapulation.things;

public class BikeRun {

	Bike bike=new Bike();
	public void display()
	{
       bike.setPrice(450000);
       System.out.println(bike.getPrice());
       bike.setBikeName("Tvs");
       System.out.println(bike.getBikeName());
	}
	
	
}
