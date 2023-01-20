package com.xworkz.person.things;

public class Job {
	public int salery;
	public String role;
	public double bond;
	public Company company;

	public Job(int salery, String role,Company company) {
		super();
		this.salery = salery;
		this.role = role;
		this.company=company;
	}

	public void setBond(double bond) {
		this.bond = bond;
		System.out.println("enter bond in months   " + this.bond);
	}

	public void showOff() {
		System.out.println("dispaying the job details");
		System.out.println("salery of person     " + this.salery);
		System.out.println("role of person is     " + this.role);
		setBond(6);
	}

}
