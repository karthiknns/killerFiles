package com.xworkz.things.child;

import com.xworkz.things.parent.PetrolBunk;

public class Venkteshwara extends PetrolBunk {
	
	@Override //annotation
	public void detailsOfWorkers()
	{
		super.detailsOfWorkers();
		System.out.println("the details of workers are of  child class");
	}
	@Override  //annotation
	public void detailsOfBunk()
	{
		super.detailsOfBunk();
		System.out.println("the details of bunk are of child class ");
	}

}
