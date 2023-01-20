package com.xworkz.person.things;

public class Location {
	public int no;
	public String street;
	public City city;
	public State state;
	public Country country = new Country("India", "delhi", 1350023452, 30);

	

	public Location(int no, String street, City city, State state, Country country) {
		super();
		this.no = no;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}



	public void showOff() {
		System.out.println("printing the location details---------------------");
		System.out.println("location no is    " + this.no);
		System.out.println("street name is    " + this.street);
		country.showOff();
		state.showOff();
		city.showOff();
	}
}
