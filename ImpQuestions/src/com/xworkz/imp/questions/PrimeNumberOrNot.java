package com.xworkz.imp.questions;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		 
  int n;
  boolean prime = false;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  n=sc.nextInt();
  
  for(int i=2;i<=n;i++)
  {  if(n%i==0)
	  {
		  prime =false;
	  }
  
  }
  System.out.println(n+"is primeNumber"+prime);
}
}