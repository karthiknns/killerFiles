package com.xworkz.person.things;

public class Company {
	public String name;
	public String ownerName;
	public Address address;

	public Company(String name, String ownerName,Address address ) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.address=address;
	}
public void showOff()
{
	System.out.println("entering compnay details -------------");
	System.out.println("company name is     "+this.name);
	System.out.println("company ownerName is     "+this.ownerName);
	if(this.address!=null)
	{
		address.showOff();
	}
	else {
		System.out.println("pointing to null");
	}
}
}
