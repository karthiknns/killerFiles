package com.xworkz.imp.questions;

import java.util.Scanner;

public class PalindromOrNot {

	public static void main(String[] args) {
		
		String name,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.nextLine();
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println("enter name is palindrom");
		}
		else
		{
			System.out.println("enter name is not a palindrom");
		}
		

	}

}
