package com.xworkz.things;

import com.xworkz.link.ItemsName;
import com.xworkz.link.ModeOfPayment;

public class Hotel {
	
	public String name;
	public String location;
	public int noOfWorkers;
	public int roomRent;
	public ItemsName[] itemNames;
	public ModeOfPayment modeOfPayment;
	public String[] workersName;
	public int[] workersSalery;
	public int[] ownerNumber;
	public int[] itemsPrice;

	public Hotel(String name, String location, int noOfWorkers, int roomRent, String[] workersName, int[] workersSalery,
			ItemsName[] itemNames, ModeOfPayment modeOfPayment, int[] ownerNumber, int[] itemsPrice) {
		this.name = name;
		this.location = location;
		this.noOfWorkers = noOfWorkers;
		this.roomRent = roomRent;
		this.itemNames = itemNames;
		this.modeOfPayment = modeOfPayment;
		this.workersName = workersName;
		this.workersSalery = workersSalery;
		this.ownerNumber = ownerNumber;
		this.itemsPrice = itemsPrice;
	}

	public void showDetails() {
		System.out.println("hotel name is       " + this.name);
		System.out.println("hotel location is       " + this.location);
		System.out.println("hotel noOfWorkers is       " + this.noOfWorkers);
		System.out.println("hotel roomRent is       " + this.roomRent);
		System.out.println("hotel itemNames is       " );
		for (int i = 0; i <this. itemNames.length; i++) {
			ItemsName j = this.itemNames[i];
			System.out.println("workers names r         " + j);

		}
		System.out.println("hotel modeOfPayment is       " + this.modeOfPayment);

		for (int i = 0; i <this. workersName.length; i++) {
			String j = this.workersName[i];
			System.out.println("workers names r         " + j);

		}
		for (int i = 0; i < workersSalery.length; i++) {
			int j = workersSalery[i];
			System.out.println("workersSalery names r         " + j);

		}
		for (int i = 0; i < ownerNumber.length; i++) {
			int j = ownerNumber[i];
			System.out.println("ownerNumber names r         " + j);

		}
		for (int i = 0; i < itemsPrice.length; i++) {
			int j = itemsPrice[i];
			System.out.println("itemsPrice names r         " + j);

		}
	}

}
