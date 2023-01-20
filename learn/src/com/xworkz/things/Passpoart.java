package com.xworkz.things;

public class Passpoart {
	public int no;
	public String name;
	public short expiryDate;
	public String country;
	public int issuedDate;
	public double noOfLeaves;

	public Passpoart() {
		System.out.println("start the runner");
	}

	public Passpoart(int no) {
		this.no = no;
	}

	public Passpoart(String name) {
		this.name = name;
	}

	public Passpoart(short expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Passpoart(double noOfLeaves) {
		this.noOfLeaves = noOfLeaves;
	}

	public Passpoart(String name, int issuedDate) {
		this.name = name;
		this.issuedDate = issuedDate;
	}
	public Passpoart(String country,String name) {
		this.country=country;
		this.name=name;
	}
}
