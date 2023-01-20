package com.xworkz.imp.questions;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("enter the number==");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Enter number is even number");
		}
		else
		{
			System.out.println("Enter number is odd number");
		}

	}

}
