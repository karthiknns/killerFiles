package com.xworkz.things.child;

import com.xworkz.things.parent.Catering;

public class Hotel extends Catering{
	
	public String name;
	public String owner;
	
public Hotel(String location, int noOfChefs, int servents, boolean veg, String name, String owner) {
		super(location, noOfChefs, servents, veg);
		this.name = name;
		this.owner = owner;
	}

	
	
}
