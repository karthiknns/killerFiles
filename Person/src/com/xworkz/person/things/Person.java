package com.xworkz.person.things;

public class Person {
	public String name;
	public Email[] email; 
	public Job job;

	public Person(Email[] email, Job job) {
		super();
		this.email = email;
		this.job = job;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("name of the person is   " + this.name);
	}

	public void showOff() {
		System.out.println("enter the person details"); 
		setName("karthik");
		if (this.email != null) {
			for (int i = 0; i < this.email.length; i++) {
				Email email2 = this.email[i];
				if(email2!=null)
				{
					email2.showOff();
				}
			}
		} else {
			System.out.println("null will get");
		}
		job.showOff();

	}

}
