package com.xworkz.things.parent;

public class Criminal {  
	
	public String name;
	public String type;
	public boolean jail;
	public Criminal(String name, String type, boolean jail) {
		super();
		this.name = name;
		this.type = type;
		this.jail = jail;
	}
	
	public void display()
	{
		System.out.println("name of criminal   "+this.name);
		System.out.println("type of criminal   "+this.type);
		System.out.println(" criminal in jail  "+this.jail);
	}

}
