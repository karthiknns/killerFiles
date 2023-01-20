package com.xworkz.things;

public class Bread {
	public String type;
	public char shape;
	public int price;
	public double quantity;
	public String companyName;
	public Bread()
	{
		System.out.println("bread is starting");
	}
	public Bread(String type)
	{
		this.type=type;
	}
	public Bread(char shape)
	{
		this.shape=shape;
	}
	public Bread(int price)
	{
		this.price=price;
	}
	public Bread(double quantity)
	{
		this.quantity=quantity;
	}
	public Bread(String companyName,String type)
	{
		this.companyName=companyName;
		this.type=type;
	}
}
