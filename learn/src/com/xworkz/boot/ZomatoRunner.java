package com.xworkz.boot;

import com.xworkz.link.ItemsName;
import com.xworkz.link.ModeOfPayment;
import com.xworkz.things.Zomato;

public class ZomatoRunner {

	public static void main(String[] args) {
		String[] workersId = { "Soma17", "Somesh18", "sagsr34" };
		int[] workersSalery = { 8000, 14000, 30000 };
		int[] companyNumber = { 94800799, 767668863, 636206035, 111002011 };
		int[] itemsPrice = { 202, 302, 352, 109, 459, 100, 150 };
		String[] location = { "kolar", "banglore", "mysore", "hydrabad", "mumbai" };
		ItemsName[] itemNames = { ItemsName.IDIY, ItemsName.BIRAYANI, ItemsName.CHICKEN_SAMBER };
		Zomato zomato = new Zomato("zomato app", location, 200, 5000, workersId, workersSalery, itemNames,
				ModeOfPayment.CASH, companyNumber, itemsPrice);

		zomato.showDetails();

	}

}
