package com.xworkz.person.things;

public class Country {
	public String name;
	public String capital;
	public int population;
	public float states;

	public Country(String name, String capital, int population, float states) {
		super();
		this.name = name;
		this.capital = capital;
		this.population = population;
		this.states = states;
	}

	public void showOff() {
		System.out.println("country name is     " + this.name);
		System.out.println("country capital is     " + this.capital);
		System.out.println("country population is     " + this.population);
		System.out.println("country states is     " + this.states);
	}
}
