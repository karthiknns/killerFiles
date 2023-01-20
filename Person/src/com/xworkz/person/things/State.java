package com.xworkz.person.things;

public class State {
	public String name;
	public Country country;
	public int population;
	public int noOfDistricts;

	public State(String name, Country country, int population, int noOfDistricts) {
		super();
		this.name = name;
		this.country = country;
		this.population = population;
		this.noOfDistricts = noOfDistricts;
	}

	public void showOff() {
		System.out.println("printing the state details---------------------");
		System.out.println("state name is   " + this.name);
	country.showOff();
		System.out.println("state population is   " + this.population);
		System.out.println("state noOfDistricts is   " + this.noOfDistricts);
		
	}
}
