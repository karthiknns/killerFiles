package com.xworkz.imp.questions;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the First number ==");
		a=sc.nextInt();
		System.out.println("enter the Second number ==");
		b=sc.nextInt();
		c=a+b;
		
		System.out.println("The adding of two numbers is ==="+c);
		
	}

}
