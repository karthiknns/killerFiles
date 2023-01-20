package com.xworkz.person.boot;

import com.xworkz.person.things.Address;
import com.xworkz.person.things.City;
import com.xworkz.person.things.Company;
import com.xworkz.person.things.Country;
import com.xworkz.person.things.Email;
import com.xworkz.person.things.Job;
import com.xworkz.person.things.Location;
import com.xworkz.person.things.Person;
import com.xworkz.person.things.State;

public class PersonRunner {

	public static void main(String[] args) {
		Country country = new Country("India", "delhi", 135782390, 30);
		State state = new State("karnataka", country, 30234567, 31);
		City city = new City("banglore", state, 10245367, 563001);
		
		Location location = new Location(4, "rajajinagar",city,state,country);
		Address address = new Address(location);
		Company company=new Company("X-works", "OM",address);
		Job job = new Job(22000, "software devwloper",company);

		Email email1 = new Email(101, "karthik12", 63620603,company);
		email1.showOff();
		Email email2 = new Email(102, "dharshan143", 76766886,company);
		email2.showOff();
		Email[] email = { email1, email2 };

		Person person = new Person(email,job);
		person.setName("karthik");
		person.showOff();
	}

}
