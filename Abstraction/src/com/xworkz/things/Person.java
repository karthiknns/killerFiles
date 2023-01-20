package com.xworkz.things;

public abstract class Person {

	public String name;
	public int age;
	public char Gender;
	public String location;
	public int income;
	
	
	public Person(String name, int age, char gender, String location, int income) {
		super();
		this.name = name;
		this.age = age;
		Gender = gender;
		this.location = location;
		this.income = income;
}

public void eat() {
	System.out.println("eating food");
}
public void sleep() {
	System.out.println("sleeping 8 hours ");
}




}
