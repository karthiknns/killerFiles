package com.xworkz.boot;

import com.xworkz.things.Tractor;

public class TractorRunner {

	public static void main(String[] args) {

		Tractor tractor = new Tractor();
		Tractor tractor2 = new Tractor(60000000);
		Tractor tractor3 = new Tractor("mahindra");

		Tractor tractor6 = new Tractor(273l);

		Tractor tractor5 = new Tractor(35);
		System.out.println("---" + tractor5.hp);
		Tractor tractor4 = new Tractor("mahindra", "karthik");
		Tractor tractor7 = new Tractor("john", "john deer", 400000, 65);

	}

}
