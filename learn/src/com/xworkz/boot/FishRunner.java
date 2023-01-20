package com.xworkz.boot;

import com.xworkz.things.Fish;

public class FishRunner {

	public static void main(String[] args) {

		Fish fish = new Fish();
		System.out.println(fish.length = 2);
		System.out.println(fish.name = "star fish");
		System.out.println(fish.price = 200);
		System.out.println(fish.weight = 2);
		System.out.println(fish.type = "river");
		System.out.println("-----------------length-----------------------------------");
		Fish fish1 = new Fish(3.0);
		System.out.println(fish1.length);
		System.out.println(fish1.name = "star fish");
		System.out.println(fish1.price = 200);
		System.out.println(fish1.weight = 2);
		System.out.println(fish1.type = "river");
		System.out.println("----------------------name------------------------------");

		Fish fish2 = new Fish("timingla");
		System.out.println(fish2.length = 2);
		System.out.println(fish2.name);
		System.out.println(fish2.price = 200);
		System.out.println(fish2.weight = 2);
		System.out.println(fish2.type = "river");
		System.out.println("------------------------weight-----------------------------");
		Fish fish3 = new Fish(4);
		System.out.println(fish3.length = 2);
		System.out.println(fish3.name);
		System.out.println(fish3.price = 200);
		System.out.println(fish3.weight);
		System.out.println(fish3.type = "river");
		System.out.println("--------------------------price---------------------------");
		Fish fish4 = new Fish(150);
		System.out.println(fish4.length = 2);
		System.out.println(fish3.name);
		System.out.println(fish4.price);
		System.out.println(fish4.weight = 2);
		System.out.println(fish4.type = "river");
		System.out.println("-----------------------------------------------------");
		Fish fish5 = new Fish("lake", 120);
		System.out.println(fish5.length = 2);
		System.out.println(fish5.name = "marava");
		System.out.println(fish5.price);
		System.out.println(fish5.weight = 2);
		System.out.println(fish5.type);
		System.out.println("-----------------------------------------------------");
		Fish fish6 = new Fish("dolpin", "ocean");
		System.out.println(fish6.length = 2);
		System.out.println(fish6.name);
		System.out.println(fish6.price = 200);
		System.out.println(fish6.weight = 2);
		System.out.println(fish6.type);

	}

}
