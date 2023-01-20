package com.xworkz.equals.things;

public class God {
	

	private String name = "Dk ravi";
	private String location = "tumkuru";
	private String type = "more than real god"; // im initilizing literally
	private String power = "IAS";
	private long income = 60000;
	private String gender = "male";
	private String noOfPriest = "each and every one";
	private String achivement = "still he lives in kolar soil";
	
	 public God() {
	 
	 }
	public God(String name, String location, String type, String power, long income, String gender, String noOfPriest,
			String achivement) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.power = power;
		this.income = income;
		this.gender = gender;
		this.noOfPriest = noOfPriest;
		this.achivement = achivement;
	}

	

	@Override
	public String toString() {
		return "God [name=" + name + ", location=" + location + ", type=" + type + ", power=" + power + ", income="
				+ income + ", gender=" + gender + ", noOfPriest=" + noOfPriest + ", achivement=" + achivement + "]";
	}

	@Override
	public boolean equals(Object obj) {

		System.out.println("running eqyals method");
		if (obj instanceof God) {
			System.out.println("obj is belongs to god");
			God cast = (God) obj;
			if (this.name.equals(cast.name) && this.income == (cast.income)) // for primitive we should use ==
			{
				System.out.println("name and income in both copies is same ");
				return true;
			} else {
				System.out.println("name and income in both copies is  not same ");
				return false;
			}
		}

		else {
			System.out.println("object is not belongs to god");
			return false;
		}

	}
}
