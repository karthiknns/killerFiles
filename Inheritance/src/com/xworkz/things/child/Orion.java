package com.xworkz.things.child;

import com.xworkz.things.parent.ShopingMall;

public class Orion extends ShopingMall {
	public String owner;
	public int noOfWorkers;
	public Orion(String name, String colour, int noOfWorkers,String owner,int noOfWorkers1) {
		super(name, colour, noOfWorkers);
		this.owner=owner;
		this.noOfWorkers=noOfWorkers;
	}
	


	public void display() {
		super.display();
		System.out.println("owner name is  " + this.owner);
		System.out.println("owner name is  " + this.noOfWorkers);
	}
	
	
}
