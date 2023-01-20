package com.xworkz.qu.things;

import java.util.Scanner;

public class PalindromOrNot {

	public static void main(String[] args) {
		String orginal,rev = "";
		Scanner sc=new Scanner(System.in);
		
	System.out.println("enter the details");
		orginal=sc.nextLine();
		
		int a=orginal.length();
		for(int i=a-1;i>=0;i--)
		{
			rev=rev+orginal.charAt(i);
		}
			if(orginal.equals(rev))
			{
				System.out.println("enter word is palindrome");
			}
			else
			{
				System.out.println("enter word is not a palindrome");

			}
		}
		

	

}
