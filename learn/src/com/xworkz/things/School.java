package com.xworkz.things;

import com.xworkz.link.Locations;
import com.xworkz.link.StaffNames;

public class School {
	public String name;
	public String owner;
	public String headMaster;
	public int noOfStudents;
	public int noOfStaff;
	public int noOfVans;
	public StaffNames staffNames; // enum declaration which is non primitive datatype
	public int[] vanNumbers;
	public String[] vanDriverNames;
	public int[] contactDetails;
	public Locations[] locations;

	public School(String name, String owner, int noOfStudents, int noOfStaff, int noOfVans, StaffNames staffNames,
			int[] vanNumbers, String[] vanDriverNames, int[] contactDetails, Locations[] locations, String headMaster) {
		this.name = name;
		this.owner = owner;
		this.noOfStudents = noOfStudents;
		this.noOfStaff = noOfStaff;
		this.noOfVans = noOfVans;
		this.staffNames = staffNames;
		this.vanNumbers = vanNumbers;
		this.vanDriverNames = vanDriverNames;
		this.contactDetails = contactDetails;
		this.locations = locations;
		this.headMaster = headMaster;
	}

	public void display() {
		System.out.println("School name is       " + this.name);
		System.out.println("owner name is       " + this.owner);
		System.out.println("HeadMaster name is       " + this.headMaster);

		System.out.println("noOfStudents  is       " + this.noOfStudents);
		System.out.println("noOfVans is       " + this.noOfVans);

		System.out.println("staffNames is       " + this.staffNames);
		System.out.println("vanNumbers are      ");
		for (int i = 0; i < this.vanNumbers.length; i++) {
			int j = this.vanNumbers[i];
			System.out.println("vanNumbers r         " + j);
		}
			System.out.println("vanDriverNames r       ");
			for (int x = 0; x < this.vanDriverNames.length; x++) {
				String y = this.vanDriverNames[x];
				System.out.println("vanDriverNames r         " + y);

			}

			for (int x = 0; x < contactDetails.length; x++) {
				int y = contactDetails[x];
				System.out.println("contactDetails r         " + y);

			}
			for (int x = 0; x < locations.length; x++) {
				Locations y = locations[x];
				System.out.println("locations names r         " + y);

			}

		}
	}

