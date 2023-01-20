package com.xworkz.things;

import com.xworkz.link.Type;

public class Mango {

	public  Type nameType=Type.BADHAMI;
	public String company;
	public  double weight=5;
	public double quantity=10;
	public double total=(quantity*weight);
	
	public Mango(String company,double quantity) {
		this.company=company;
		this.quantity=quantity;
		
	}
 public void setTotal(double quantity ,double weight)
 {
	this.quantity=quantity;
			this.weight=weight;
	  total=(quantity*weight);
	 System.out.println(total);
 }

 public void displayDetails()
 {
	 System.out.println("nameType is --" + nameType);
		System.out.println("company is --" + this.company);
		System.out.println("weight is --" + this.weight);
		System.out.println("quantity is --" + this.quantity);
		System.out.println("total is --" + total);

 }
}
