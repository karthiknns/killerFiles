package com.xworkz.things;



import com.xworkz.link.ModeOfPayment;
import com.xworkz.link.ProductName;

public class Flipcart {
	public String type;
	public String wareHouselocation;
	public int noOfWorkers;
	public int roomRent;
	public ProductName[] productsName;
	public ModeOfPayment modeOfPayment;
	public String[] workersName;
	public int[] workersSalery;
	public int[] ownerNumber;
	public int[] itemsPrice;
	
	public Flipcart(String type, String location, int noOfWorkers, int roomRent, String[] workersName, int[] workersSalery,
			ProductName[] productsName, ModeOfPayment modeOfPayment, int[] ownerNumber, int[] itemsPrice) {
		this.type = type;
		this.wareHouselocation = location;
		this.noOfWorkers = noOfWorkers;
		this.roomRent = roomRent;
		this.productsName = productsName;
		this.modeOfPayment = modeOfPayment;
		this.workersName = workersName;
		this.workersSalery = workersSalery;
		this.ownerNumber = ownerNumber;
		this.itemsPrice = itemsPrice;
		}
	public void showDetails() {
		System.out.println("flipcartn is a type of       " + this.type);
		System.out.println("Flipcart wareHouse location is       " + this.wareHouselocation);
		System.out.println("flipcart noOfWorkers is       " + this.noOfWorkers);
		System.out.println("flipcart roomRent is       " + this.roomRent);
		System.out.println("flipcart itemNames is       " );
		for (int i = 0; i <this. productsName.length; i++) {
			ProductName j = this.productsName[i];
			System.out.println("productsNames names r         " + j);

		}
		System.out.println("flipcart modeOfPayment is       " + this.modeOfPayment);

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
