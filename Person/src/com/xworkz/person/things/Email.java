package com.xworkz.person.things;

public class Email {
	public int id;
	public String password;
	public int mobileNo;
	public Company company;

	public Email(int id, String password, int mobileNo,Company company) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
		this.company=company;
	}

	public void showOff() {
		System.out.println("display the email details");
		System.out.println("id of person is    " + this.id);
		System.out.println("password of person is    " + this.password);
		System.out.println("mobileNo of person is    " + this.mobileNo);
		company.showOff();

	}
}
