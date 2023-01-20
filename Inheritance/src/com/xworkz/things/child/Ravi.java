package com.xworkz.things.child;

import com.xworkz.things.parent.Criminal;

public class Ravi extends Criminal {
	public String gender;
	public int noOFCases;

	public Ravi(String name, String type, boolean jail,String gender,int noOFCases) {
		super(name, type, jail);
  this.gender=gender;
  this.noOFCases=noOFCases;
	}
	public void display()
	{
		super.display();
		System.out.println("gender of ravi is  "+this.gender);
		System.out.println("noOFCases of ravi is  "+this.noOFCases);
	}

}
