package com.xworkz.things;

public class Virat {
	public String fullName;
	public float age;
	public int wifes;
	public String wifeName;
	public int noOfChildrens;
	public String[] formatPlayed;
	public int[] someCenturies;
	public String[] currentFormats;
	public int[] centuriesInRcb;
	public String[] awards;

	public Virat(String fullName, float age, int wifes, String wifeName, int noOfChildrens, String[] formatPlayed,
			int[] someCenturies, String[] currentFormats, int[] centuriesInRcb, String[] awards) {
		this.fullName = fullName;
		this.age = age;
		this.wifes = wifes;
		this.wifeName = wifeName;
		this.noOfChildrens = noOfChildrens;
		this.formatPlayed = formatPlayed;
		this.someCenturies = someCenturies;
		this.currentFormats = currentFormats;
		this.centuriesInRcb = centuriesInRcb;
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

		for (int i = 0; i < centuriesInRcb.length; i++) {
			int ref1 = centuriesInRcb[i];

			System.out.println(ref1 + "                          centuriesInRcb");
		}

		for (int i = 0; i < awards.length; i++) {
			String string = awards[i];
			System.out.println(string + "                         awards");

		}

	}}
