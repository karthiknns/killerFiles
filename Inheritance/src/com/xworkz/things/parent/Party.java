package com.xworkz.things.parent;

public class Party {
	public String name;
	public int members;
	public String symbol;

	public Party(String name, int members, String symbol) {
		super();
		this.name = name;
		this.members = members;
		this.symbol = symbol;
	}
public void display()
{
	System.out.println("name of party  "+ this.name);
	System.out.println("members of party  "+ this.members);
	System.out.println("name of symbol  "+ this.symbol);
}
}
