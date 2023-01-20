package com.xworkz.boot;

import com.xworkz.link.ItemsName;
import com.xworkz.link.ModeOfPayment;
import com.xworkz.things.Conrad;


public class ConrdHotel {

	public static void main(String[] args) {
		String[] workersName = { "Soma", "Somesh","Satish" };
		int[] workersSalery = { 8000, 14000 };
		int[] ownerNumber = { 94800799, 767668863, 636206035 };
		int[] itemsPrice = { 1400,2000,400,450 };
		 ItemsName[] itemNames= {ItemsName.BIRAYANI,ItemsName.CHICKEN_SAMBER,ItemsName.IDIY,ItemsName.PURI};
		Conrad conrad = new Conrad("Hotel", "Banglore Halsur Main road", 100, 5000, workersName, workersSalery, itemNames,
				ModeOfPayment.CASH, ownerNumber, itemsPrice);

		conrad.showDetails();
	}

}
