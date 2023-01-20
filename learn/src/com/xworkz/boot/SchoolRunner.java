package com.xworkz.boot;

import com.xworkz.link.Locations;
import com.xworkz.link.StaffNames;
import com.xworkz.things.School;

public class SchoolRunner {

	public static void main(String[] args) {
		int[] vanNumbers = { 399, 3030, 4782, 8055, 3721, 9999 };
		String[] vanDriverNames = { "venu", "vamshi", "sandeep", "devraj" };
		int[] contactDetails = { 99008863, 929394959, 636206035, 101010222 };
		Locations[] locations = { Locations.BANGLORE, Locations.HUBBALI, Locations.KOLAR, Locations.SRINIVASPUR };
		School school = new School("SBVN", "SriRamReddy", 5000, 100, 20, StaffNames.GANGADHAR_GOWDA, vanNumbers,
				vanDriverNames, contactDetails, locations, "Venkt Reddy");
		school.display();
	}

}
