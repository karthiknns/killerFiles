package com.xworkz.things;

public class Rohith {

	
	public String fullName;
	public float age;
	public int wifes;
	public String wifeName;
	public int noOfChildrens;
	public String[] formatPlayed;
	public int[] someCenturies;
	public String[] currentFormats;
	public int[] centuriesInMi;
	public String[] awards;

	public Rohith(String fullName, float age, int wifes, String wifeName, int noOfChildrens, String[] formatPlayed,
			int[] someCenturies, String[] currentFormats, int[] centuriesInMi, String[] awards) {
		this.fullName = fullName;
		this.age = age;
		this.wifes = wifes;
		this.wifeName = wifeName;
		this.noOfChildrens = noOfChildrens;
		this.formatPlayed = formatPlayed;
		this.someCenturies = someCenturies;
		this.currentFormats = currentFormats;
		this.centuriesInMi = centuriesInMi;
		this.awards = awards;
	}

	public void display() {
		System.out.println("fullName   ---" + this.fullName);
		System.out.println("age   ---" + this.age);
		System.out.println("wifeName   ---" + this.wifeName);
		System.out.println("noOfChildrens   ---" + this.noOfChildrens);
		System.out.println("wife --------------" + this.wifes);
		for (int i = 0; i < this.formatPlayed.length; i++) {
			String ref = this.formatPlayed[i];
			System.out.println(ref + "                                        formatPlayed ");
		}
		for (int i = 0; i < this.someCenturies.length; i++) {
			int string = this.someCenturies[i];
			System.out.println(string + "                          someCenturies");
		}

		for (int i = 0; i < currentFormats.length; i++) {
			String string = currentFormats[i];
			System.out.println(string + "                          currentFormats");

		}

		for (int i = 0; i < centuriesInMi.length; i++) {
			int ref1 = centuriesInMi[i];

			System.out.println(ref1 + "                          centuriesInMi");
		}

		for (int i = 0; i < awards.length; i++) {
			String string = awards[i];
			System.out.println(string + "                         awards");

		}

	}
		}


