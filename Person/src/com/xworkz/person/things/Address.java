package com.xworkz.person.things;

public class Address {
	public Location location;

	public Address(Location location) {
		super();
		this.location = location;
	}

	public void showOff() {
		System.out.println("printing the address details---------------------");
		if (this.location != null) {
			location.showOff();
		} else {
			System.out.println("pointing to null");
		}
	}
}
