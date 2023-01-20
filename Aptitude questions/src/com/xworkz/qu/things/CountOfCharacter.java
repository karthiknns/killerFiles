package com.xworkz.qu.things;

import java.util.Iterator;

public class CountOfCharacter {

	public static void main(String[] args) {
		
		String name="Karthik";
		int count=0;
		
		int ch=name.length();
		
		System.out.println("length= "+ch );
		
		for(int i=0;i<name.length();i++) {
			count=count+name.charAt(i);
			
		
	}
		System.out.println("count    "+count);

}}
 