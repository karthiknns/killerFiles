package com.xworkz.collections.map;

public class NullPointException {

	public static void main(String[] args) {
		
		try {
			String name=null;
			//int a=10/0;
			System.out.println(name.length());
		}
		catch (Exception e) {
			System.out.println(e);
		} 
		
	
		finally {
			System.out.println("After exception");
		}

	}

}
