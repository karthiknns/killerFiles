package com.xworkz.things;

import com.xworkz.link.ItemsName;
import com.xworkz.link.ModeOfPayment;

public class Zomato {
	public String name;
	public String[] location;
	public int noOfWorkers;
	public int noOfPartners;
	public ItemsName[] itemNames;
	public ModeOfPayment modeOfPayment;
	public String[] workersId;
	public int[] workersSalery;
	public int[] companyNumber;
	public int[] itemsPrice;

	public Zomato(String name, String[] location, int noOfWorkers, int noOfPartners, String[] workersId,
			int[] workersSalery, ItemsName[] itemNames, ModeOfPayment modeOfPayment, int[] companyNumber,
			int[] itemsPrice) {
		this.name = name;
		this.location = location;
		this.noOfWorkers = noOfWorkers;
		this.noOfPartners = noOfPartners;
		this.itemNames = itemNames;
		this.modeOfPayment = modeOfPayment;
		this.workersId = workersId;
		this.workersSalery = workersSalery;
		this.companyNumber = companyNumber;
		this.itemsPrice = itemsPrice;
	}

	public void showDetails() {
		System.out.println("hotel name is       " + this.name);
		System.out.println("hotel location is       ");
		for (int i = 0; i < this.location.length; i++) {
			String j = this.location[i];
			System.out.println("workers names r         " + j);

			System.out.println("hotel noOfWorkers is       " + this.noOfWorkers);
			System.out.println("hotel roomRent is       " + this.noOfPartners);
			System.out.println("hotel itemNames is       ");
			for (int x = 0; x < this.itemNames.length; x++) {
				ItemsName y = this.itemNames[x];
				System.out.println("workers names r         " + y);

			}
			System.out.println("hotel modeOfPayment is       " + this.modeOfPayment);

			for (int x = 0; x < this.workersId.length; x++) {
				String y = this.workersId[x];
				System.out.println("workers names r         " + y);

			}
			for (int x = 0; x < workersSalery.length; x++) {
				int y = workersSalery[x];
				System.out.println("workersSalery names r         " + y);

			}
			for (int x = 0; x < companyNumber.length; x++) {
				int y = companyNumber[x];
				System.out.println("ownerNumber names r         " + y);

			}
			for (int x = 0; x < itemsPrice.length; x++) {
				int y = itemsPrice[x];
				System.out.println("itemsPrice names r         " + y);

			}
		}
	}
}
