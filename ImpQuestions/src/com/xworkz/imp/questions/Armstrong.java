package com.xworkz.imp.questions;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the number");
		int n;
		n=sc.nextInt();
		int original=n;
		int temp=0;
		int amstrong=0;
		 
	while(n>0)
	{
		temp=n%10;
		//temp=(int)Math.pow(temp, 3);
		temp=temp*temp*temp;
		amstrong=amstrong+temp;
		n=n/10;
	}
	if(amstrong==original)
	{
		System.out.println("enetered number is amstrong number");
	}
	else {
		System.out.println("enetr number is not amstrong number");
	}
	}

}
