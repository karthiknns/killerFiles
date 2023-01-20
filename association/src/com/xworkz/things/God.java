package com.xworkz.things;

public class God {
	public String name;
	public String gender;
	public String mainPower;
	public Wepon wepon = new Wepon("gada", "Strength", 21);

	public God(String name, String gender, String mainPower) {
		super();
		this.name = name;
		this.gender = gender;
		this.mainPower = mainPower;
	}

	public void display() {
		System.out.println("god detais in a temple");
		System.out.println("God name is ---" + this.name);
		System.out.println("God gender is ---" + this.gender);
		System.out.println("God mainPower is ---" + this.mainPower);
		wepon.display();
	}
}
