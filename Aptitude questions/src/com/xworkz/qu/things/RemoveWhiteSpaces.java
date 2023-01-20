package com.xworkz.qu.things;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		int count=0;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the String  ");
		String str1="";
		 str1=sc.nextLine();
		
//		System.out.println("to count the spaces");
		
		for(int i=1;i<str1.length();i++) {
		if(str1.charAt(i)==' ')
		{
			count++;
			
		}
	
				}
		System.out.println("no of white space is = "+count);

		System.out.println("orginal string = "+str1);
		
		String str2=str1.replaceAll("\\s", "");
		System.out.println("after removing white space = "+str2);
		
		
		
	String sent="This is a java program";
		System.out.println("orginal sent = "+sent);
		
		String sent2=sent.replaceAll("\\s", "");
		System.out.println("after removing white space the sent is  = "+sent2);
		
		
		
		
	}
}
