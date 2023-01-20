package com.xworkz.things;
import com.xworkz.link.*;
public class Sweet {
	public static String brand;
	public Colour colour;
	public int price;
	public Locations location;
	public double weight;

	public Sweet(int price,Colour colour) {
		this.price = price;
		this.colour=colour;
		
	}
	public void setLocation(Locations location,double weight)
	{
		this.location=location;
		this.weight=weight;
	}
	static
	{
		Sweet.brand="Kanthi Sweets";
	}
	public void displayDetails()
	{
		System.out.println("brand is --"+Sweet.brand);
		System.out.println("colour is --"+this.colour);
		System.out.println("price is --"+this.price);
		System.out.println("location is --"+this.location);
		System.out.println("weight is --"+this.weight);

	}
	

}
