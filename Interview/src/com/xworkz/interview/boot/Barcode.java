package com.xworkz.interview.boot;

import java.util.Scanner;

public class Barcode {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cupon =");
		String coupon = sc.next();

		String str1 = coupon.substring(0, 2);
		// System.out.println(str1);
		String str2 = coupon.substring(2, 6);
		// System.out.println(str2);
		String str3 = coupon.substring(6, 9);

		int convertString = Integer.valueOf(str2);
		// String str=str1.toUpperCase();
		// System.out.println(str+convertString+str3);

		if (coupon.length() == 9 && convertString == 2022) {
			if (str3.charAt(str3.length() - 1) >= 'A' && str3.charAt(str3.length() - 1) <= 'Z') {
				if (coupon.charAt(0) >= 'A' && coupon.charAt(0) <= 'Z' && coupon.charAt(1) >= 'A' && coupon.charAt(1) <= 'Z') {
					count++;
				}
			}

		}
		if (count == 0) {
			System.out.println("Invalid Coupan..."+coupon);
		} else {
			System.out.println("Valid Coupan..."+coupon);

		}
	}
}
