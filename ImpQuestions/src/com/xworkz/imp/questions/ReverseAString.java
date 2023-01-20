package com.xworkz.imp.questions;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		String name,rev="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String name ==");
		name=sc.nextLine();
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		
		System.out.println("Reverse of a String is  =="+rev);
	}

}
