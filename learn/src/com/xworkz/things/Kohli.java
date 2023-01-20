package com.xworkz.things;

import com.xworkz.link.BallsHundred;

public class Kohli {
 public String fullName;
 public BallsHundred[] ballHundred;
	
 public Kohli() {
		System.out.println("enter details");
	}
 public Kohli(String fullName,BallsHundred[] ballHundred) 
 {
	 this.ballHundred=ballHundred;
	 this.fullName=fullName;
 }
 
 public void display()
 {
	 System.out.println("full name is------"+this.fullName);
	 for (int i = 0; i < ballHundred.length; i++) {
		BallsHundred ballsHundred = ballHundred[i];
		 System.out.println("ball are------"+ballsHundred);

	}
}
}
