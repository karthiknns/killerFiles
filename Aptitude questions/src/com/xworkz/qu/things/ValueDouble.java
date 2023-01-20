package com.xworkz.qu.things;

public class ValueDouble {

	public static void main(String[] args) {
		int[] arry1 = { 2, 4, 6 };
		for (int i = 0; i < arry1.length; i++) {
			int ref = arry1[i];
			System.out.println("first  "+ref);
			System.out.println("multiple "+ref * 2);
		}
	}

}
