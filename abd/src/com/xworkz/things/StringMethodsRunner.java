package com.xworkz.things;

import java.util.Iterator;

public class StringMethodsRunner {

	public static void main(String[] args) {
		String tripleRide = 
"Triple Riding is a Kannada movie released on 25 Nov, 2022.The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
	
		System.out.println("converting to upper case");
	String ref=tripleRide.toUpperCase();
	System.out.println(ref);
	
	System.out.println("-------------------------------------------1----------------------");
	System.out.println("converting to lower case");
	String ref1=tripleRide.toLowerCase();
	System.out.println(ref1);
	
	System.out.println("-----------------------------------2------------------------------");
	System.out.println("Split all by space ");
	String[] splitted=tripleRide.split(" ");
	
	for(int i=0;i<splitted.length;i++) {
		System.out.println(splitted[i]);
	}
	
	
	
	System.out.println("-----------------------------------3------------------------------");
	System.out.println("Split all by , ");
	String[] splitted1=tripleRide.split(",");
	
	for(int i=0;i<splitted1.length;i++) {
		System.out.println(splitted1[i]);
	}
	
	System.out.println("-----------------------------------4------------------------------");
	System.out.println("convert string to char[] ");
	char[] chr=tripleRide.toCharArray();
	
	for(int i=0;i<chr.length;i++) {
		System.out.print(chr[i]);
	}
	
	
	System.out.print("------------------5-----------------------------------------------");

	System.out.println("find all the digits in above string");
	
	System.out.println("thr digits in string are  "+tripleRide.length());
	
	System.out.print("------------------6-----------------------------------------------");
	
	 System.out.println("reverse a string");
	
	 for(int i=chr.length-1;i>=0;i--)
	 {
		 System.out.print(chr[i]); // convert to character by string
	 }
	 
	 
	 
	 System.out.println("-----------------------7----------------------------------");
	 System.out.println("find the letter  R");
	 
	 char cha='R';
	 int number=0;
	 for(int i=0;i<tripleRide.length();i++) {
	if(cha==tripleRide.charAt(i))
	 {
		 number++;
	 }
	 System.out.println("number of char   "+cha+"="+number);
		 
	 }
	 
	
	}

}
