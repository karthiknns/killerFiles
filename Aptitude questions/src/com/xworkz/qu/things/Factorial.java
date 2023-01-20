package com.xworkz.qu.things;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int i,number;
		Scanner sc=new Scanner(System.in);
		long fac=1;
		System.out.println(" please enter the number");
		number =sc.nextInt();
		for(i=0;i<=number;i++)
		{
			fac=fac*i;
		}
		System.out.format("the factrioal number is = "+number+"  and answer is "+fac);

	}

}
