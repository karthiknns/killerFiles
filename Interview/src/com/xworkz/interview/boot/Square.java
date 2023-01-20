package com.xworkz.interview.boot;

public class Square {
public static void main(String[] args) {
	
	for(int i=0;i<=3;i++)
	{
		for(int j=0;j<=3;j++)  //hear i==0 then j=0,1,2,3
	
	{
		System.out.print(" @ ");//side by side 
	}
		System.out.println(" ");  //line by line
		}


   for(int i=1;i<=3;i++)
   {
	   for(int j=1;j<=3;j++)
	   {
		   System.out.print(i);
		   
	   }
	   System.out.println("k");
   }
 System.out.println("-----------------------");
           
 
 for(int i=1;i<=3;i++)
 {
	   for(int j=1;j<=3;j++)
		   if(j==3)
	   {
		   System.out.println("k");
		   
	   }
		   else {
	   System.out.print(i);
 }}
 
 
 System.out.println("-----------------------");
 
 for(int i=1;i<=3;i++)
 {
	 for(int j=1;j<=3;j++)
		 if(i==2)
		 {
			 System.out.print("name");
			 
		 }
		 else
		 {
			 System.out.print(i);
			 
		 }
	System.out.println(" ");
 }
 
}
}
