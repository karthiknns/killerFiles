package com.xworkz.person.things;

public class City {

	public String name;
	public State state;
	public int population;
	public int pinCode;
	 

	public City(String name, State state, int population, int pinCode) {
		super();
		this.name = name;
		this.state = state;
		this.population = population;
		this.pinCode = pinCode;
	}

	public void showOff() {
		System.out.println("printing the city details---------------------");
		System.out.println("district name is   " + this.name);
		System.out.println("district population is   " + this.population);
		System.out.println("district pinCode is   " + this.pinCode);
		state.showOff();
	}
}
