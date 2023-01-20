package com.xworkz.boot;

import com.xworkz.things.Passpoart;

public class PassportRunner {

	public static void main(String[] args) {

		Passpoart passpoart = new Passpoart();
		System.out.println(passpoart.country = "India");
		System.out.println(passpoart.issuedDate = 28);
		System.out.println(passpoart.name = "karthik");
		System.out.println(passpoart.no = 31187654);
		System.out.println(passpoart.noOfLeaves = 30);
		System.out.println("----------------------passport no--------------------------------------");
		Passpoart passpoart1 = new Passpoart(23145637);
		System.out.println(passpoart1.country = "India");
		System.out.println(passpoart1.issuedDate = 28);
		System.out.println(passpoart1.name = "karthik");
		System.out.println(passpoart1.no);
		System.out.println(passpoart1.noOfLeaves = 30);

		System.out.println("----------------------name--------------------------------------");
		Passpoart passpoart3 = new Passpoart("dharshan");
		System.out.println(passpoart3.country = "India");
		System.out.println(passpoart3.issuedDate = 28);
		System.out.println(passpoart3.name);
		System.out.println(passpoart3.no = 31187654);
		System.out.println(passpoart3.noOfLeaves = 30);
		System.out.println("----------------------experiy date--------------------------------------");
		Passpoart passpoart2 = new Passpoart(21);
		System.out.println(passpoart2.country = "India");
		System.out.println(passpoart2.issuedDate = 28);
		System.out.println(passpoart2.name = "karthik");
		System.out.println(passpoart2.no = 31187654);
		System.out.println(passpoart2.noOfLeaves = 30);
		System.out.println(passpoart2.expiryDate);
		System.out.println("----------------------no of leaves --------------------------------------");
		Passpoart passpoart4 = new Passpoart(10);
		System.out.println(passpoart4.country = "India");
		System.out.println(passpoart4.issuedDate = 28);
		System.out.println(passpoart4.name = "karthik");
		System.out.println(passpoart4.no = 31187654);
		System.out.println(passpoart4.noOfLeaves);
		System.out.println(passpoart4.expiryDate = 18);
		System.out.println("----------------------name issueddate--------------------------------------");
		Passpoart passpoart5 = new Passpoart("hari", 24);
		System.out.println(passpoart5.country = "India");
		System.out.println(passpoart5.issuedDate);
		System.out.println(passpoart5.name);
		System.out.println(passpoart5.no = 31187654);
		System.out.println(passpoart5.noOfLeaves = 30);
		System.out.println(passpoart5.expiryDate = 21);
		System.out.println("----------------------country name--------------------------------------");
		Passpoart passpoart6 = new Passpoart("india", "satish");
		System.out.println(passpoart6.country);
		System.out.println(passpoart6.issuedDate = 28);
		System.out.println(passpoart6.name);
		System.out.println(passpoart6.no = 31187654);
		System.out.println(passpoart6.noOfLeaves = 30);
		System.out.println(passpoart6.expiryDate);
	}
}
