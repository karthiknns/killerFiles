package com.xworkz.qu.things;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0,b=1,c=0;
		
		System.out.print(a+","+b+",");
	for (int i = 2; i <10; i++) {  
    		                                                           
		c=a+b;                                                      //a=0+b=1=1
		System.out.print(c+",");                                        //1+1=2
		a=b;                                                              //1+2=3
		b=c;                                                                //2+3=5
		                                                                     //3+5=8
	}                                                                          //5+8=13
	
	
	
	}
	

}
