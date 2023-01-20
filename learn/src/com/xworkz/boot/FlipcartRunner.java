package com.xworkz.boot;

import com.xworkz.link.ModeOfPayment;
import com.xworkz.link.ProductName;
import com.xworkz.things.Flipcart;


public class FlipcartRunner {

	public static void main(String[] args) {

		String[] workersName = { "Sangamesh", "Jagadesh" ,"sumpath kumar"};
		int[] workersSalery = { 8000, 14000 ,34000};
		int[] ownerNumber = { 94800799, 767668863, 636206035 };
		int[] itemsPrice = { 300, 15000, 1500, 250, 4500 };
		ProductName[] productName = { ProductName.CHARGERS, ProductName.FRIDGE, ProductName.MIXER, ProductName.SHOTS,
				ProductName.GRINDER };
		Flipcart flipcart = new Flipcart("Online business ", "All india", 1902039, 5000, workersName, workersSalery, productName,
				ModeOfPayment.CASH, ownerNumber, itemsPrice);

		flipcart.showDetails();
	}

}
