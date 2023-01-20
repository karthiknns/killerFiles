package com.xworkz.interview.boot;

public class LeftTriangle {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++)           //left triangle
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("@");
			}
			System.out.println("");
		}
	System.out.println("--------------------------------------------------------------------");
	
	for(int i=1;i<=n;i++)           //equilateral  triangle
	{
		for(int j=n-1;j>=i;j--)
		{
			System.out.print(" ");
			
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("@ "); // we r ginving space
		}
		System.out.println("");
	}
	
System.out.println("--------------------------------------------------------------------");
	
	for(int i=1;i<=n;i++)           //equilateral  triangle
	{
		for(int j=n-1;j>=i;j--)
		{
			System.out.print(" ");
			
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(i); // we r printing  i value
		}
		System.out.println("");
	}
System.out.println("--------------------------------------------------------------------");
	
	for(int i=1;i<=n;i++)           //equilateral  triangle
	{
		for(int j=n-1;j>=i;j--)
		{
			System.out.print(j);  //// we r i value
			
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(i); // we r i value
		}
		System.out.println("");
	}
	
System.out.println("--------------------------------------------------------------------");
	
	for(int i=1;i<=n;i++)           //equilateral  triangle
	{
		for(int j=n-1;j>=i;j--)
		{
			System.out.print(" ");  //// we r i value
			
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(k); // we r printing k value
		}
		System.out.println("");
	}
System.out.println("--------------------------------------------------------------------");
	
	for(int i=1;i<=n;i++)           //equilateral  triangle
	{
		for(int j=n-1;j>=i;j--)
			if(j==2)
			{
				System.out.print("karthik");
			}
			else
		{
			System.out.print(j);  // we r i value
			
		}
		for(int k=1;k<=i;k++)
			if(k==2)
			{
				System.out.print("karthik");
			}
			else
		{
			System.out.print(k); // we r i value
		}
		System.out.println("");
	}
	
	
	
	}

}
