package com.xworkz.imp.questions;

public class Fibonacci {
	
		public static void main(String[] args) {
			int a=0;
			int b=1;
			int save=12;
			for(int i = 0;i<=save;i++) {
				int c = a+b;
				a=b;
				b=c;
						
				System.out.println(c);
				
				
			}

	}
		
	}

	