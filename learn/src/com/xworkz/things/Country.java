package com.xworkz.things;

public class Country {
	public String countryName="INDIA";
	public int population=135000000;
	public String currency="rupees";
	public int states=30;
	public String founder="vasco da gama";
	public String[] famousPM;
	public String[] freedomFighters;
	public String[] famousStates;
	public int[] importantYears;
	public String[]  famousPlaces;
	
	public Country(String countryName, int population, String currency, int states, String founder, String[] famousPM,
			String[] freedomFighters, String[] famousStates, int[] importantYears, String[] famousPlaces)
	{
		this.countryName=countryName;
		this.population=population;
		this.currency=currency;
		this.states=states;
		this.founder=founder;
		this.famousPM=famousPM;
		this.freedomFighters=freedomFighters;
		this.famousStates=famousStates;
		this.importantYears=importantYears;
		this.famousPlaces=famousPlaces;
	}
	
	public void display()
	{
		System.out.println("countryName   ---"+this.countryName);
		System.out.println("population   ---"+this.population);
		System.out.println("currency   ---"+this.currency);
		System.out.println("states   ---"+this.states);
		System.out.println("founder   ---"+this.founder);
		System.out.println("famousPM   ---"+this.famousPM);
		for (int i = 0; i < this.famousPM.length; i++) {
			String ref=this.famousPM[i];
			System.out.println(ref+"                                        famous PMs");
		}
		System.out.println("freedomFighters   ---"+this.freedomFighters);
		for (int i = 0; i < this.freedomFighters.length; i++) {
			String string = this.freedomFighters[i];
			System.out.println(string+"                          famous freedom fighters");
		}
		System.out.println("famousStates   ---"+this.famousStates);
		for (int i = 0; i < famousStates.length; i++) {
			String string = famousStates[i];
			System.out.println(string+"                          famous states");

			
		}
		System.out.println("importantYears   ---"+this.importantYears);
		for (int i = 0; i < importantYears.length; i++) {
			int ref1= importantYears[i];
			
					System.out.println(ref1+"                          famous important years");
		}
		System.out.println("population   ---"+this.famousPlaces);
		for (int i = 0; i < famousPlaces.length; i++) {
			String string = famousPlaces[i];
			System.out.println(string+"                          famous places");

			
		}
		
		}
	

}
