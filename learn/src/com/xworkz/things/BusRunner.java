package com.xworkz.things;

import com.xworkz.boot.Developer;
import com.xworkz.boot.Developer.*;

public class BusRunner {

	public static void main(String[] args) {
		
		Bus ref=new Bus();
		
		ref.no=8055;
		ref.starting="srinivaspur";
		ref.destination="kolar";
		
		System.out.println("bus no::::::::::"+ref.no);
		System.out.println("bus starting"+ref.starting);
	System.out.println("bus destination"+ref.destination);

	
	  ref.no=1234;
	  ref.destination="banglore";
	  ref.starting="kolar";
	  

		System.out.println("bus no"+ref.no);
		System.out.println("bus starting"+ref.starting);
	System.out.println("bus destination"+ref.destination);
	
	Developer ref1=new Developer();
	ref1.name="karthik";
	
	System.out.println("update----"+ref1.name);
	
}
}
