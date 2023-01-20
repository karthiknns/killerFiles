package com.xworkz.boot;

import com.xworkz.link.ItemsName;
import com.xworkz.link.ModeOfPayment;
import com.xworkz.things.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		String[] workersName = { "Soma", "Somesh" };
		int[] workersSalery = { 8000, 14000 };
		int[] ownerNumber = { 94800799, 767668863, 636206035 };
		int[] itemsPrice = { 20, 30, 35, 10, 45, 100, 150 };
		 ItemsName[] itemNames= {ItemsName.BIRAYANI,ItemsName.CHICKEN_SAMBER};
		Hotel hotel = new Hotel("KGF", "kolar", 2, 5000, workersName, workersSalery, itemNames,
				ModeOfPayment.CASH, ownerNumber, itemsPrice);

		hotel.showDetails();
	}

}
