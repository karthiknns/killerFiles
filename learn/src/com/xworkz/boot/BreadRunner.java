package com.xworkz.boot;

import com.xworkz.things.Bread;

public class BreadRunner {

	public static void main(String[] args) {

		Bread bread = new Bread();
		System.out.println(bread.companyName = "baker dozen");
		System.out.println(bread.price = 30);
		System.out.println(bread.quantity = 200);
		System.out.println(bread.shape = 'L');
		System.out.println(bread.type = "brown bread");
		System.out.println("--------------------type--------------------------");
		bread = new Bread("white bread");
		System.out.println(bread.companyName = "baker dozen");
		System.out.println(bread.price = 30);
		System.out.println(bread.quantity = 200);
		System.out.println(bread.shape = 'L');
		System.out.println(bread.type);
		System.out.println("--------------------shape--------------------------");
		bread = new Bread('M');
		System.out.println(bread.companyName = "English ovem");
		System.out.println(bread.price = 30);
		System.out.println(bread.quantity = 200);
		System.out.println(bread.shape);
		System.out.println(bread.type = "white");
		System.out.println("--------------------price--------------------------");
		bread = new Bread(35);
		System.out.println(bread.companyName = "baker dozen");
		System.out.println(bread.price);
		System.out.println(bread.quantity = 200);
		System.out.println(bread.shape = 'L');
		System.out.println(bread.type);
		System.out.println("--------------------quantity--------------------------");
		bread = new Bread(350);
		System.out.println(bread.companyName = "baker dozen");
		System.out.println(bread.price = 30);
		System.out.println(bread.quantity);
		System.out.println(bread.shape = 'L');
		System.out.println(bread.type);
		System.out.println("--------------------companyName /type--------------------------");
		bread = new Bread("britannia", "Garlic bread");
		System.out.println(bread.companyName);
		System.out.println(bread.price = 30);
		System.out.println(bread.quantity = 200);
		System.out.println(bread.shape = 'L');
		System.out.println(bread.type);

	}

}
