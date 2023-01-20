package com.xworkz.things.child;

import com.xworkz.things.parent.Marriage;

public class AdultMarriage extends Marriage {
          public String brideName;
          public String groomName;
	public AdultMarriage(String location, int noOfPeople, int muee,String brideName,String groomName) {
		super(location, noOfPeople, muee);
		this.brideName=brideName; 
		this.groomName=groomName;
	}
	public void showOff()
	{
		
		System.out.println("bride name "+this.brideName);
		System.out.println("bride name "+this.groomName);
		super.display();
	}

}
