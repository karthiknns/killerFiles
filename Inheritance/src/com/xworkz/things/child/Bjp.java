package com.xworkz.things.child;

import com.xworkz.things.parent.Party;

public class Bjp extends Party {
 public String head;
 
 
	public Bjp(String name, int members, String symbol,String head) {
		super(name, members, symbol);
		this.head=head;
		
	}
 public void display()
 {
	 super.display();       //over riding ----calling the method from parent class
	 
	 
	 System.out.println("party head name is  "+this.head);
 }
 
 public final void Show()
 {
	  int sum=20;
	 System.out.println(sum);
 }
 public  void Show(int where)
 {
	  int sum=20;
	 System.out.println(sum);
 }
}
