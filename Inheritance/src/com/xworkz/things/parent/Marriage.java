package com.xworkz.things.parent;

public class Marriage {
 public String location;
 public int noOfPeople;
 public int muee;
public Marriage(String location, int noOfPeople, int muee) {
	super();
	this.location = location;
	this.noOfPeople = noOfPeople;
	this.muee = muee;
}
public void display()
{
	System.out.println("location is  "+this.location);
	System.out.println("noOfPeople is  "+this.noOfPeople);
	System.out.println("muee is  "+this.muee);
}
}
