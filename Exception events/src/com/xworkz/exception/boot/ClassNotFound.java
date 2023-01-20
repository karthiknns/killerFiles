package com.xworkz.exception.boot;

public class ClassNotFound {

	public static void main(String[] args) {
		System.out.println("main method start");
		/*try {
			Class.forName("com.xworkz.exception.boot.ClassNotFoun");
			System.out.println("class is found");
		} catch (ClassNotFoundException e) {
			System.out.println("class is not found");
			 e.printStackTrace();      
			//e.getMessage(); -- doesn't print any thing
		}*/
		try {
			classloder();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("class is not found");
			e.printStackTrace();
		}
	}
	

	public static void classloder() throws ClassNotFoundException
	{
		Class loder=Class.forName("com.xworkz.exception.boot.ClassNotFound");
	}
	/*
	 * throws syntax <acess specifier> returntype methodname() throws Exceptionname{
	 * }
	 */
	  }

