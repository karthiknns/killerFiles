package com.xworkz.boot;

import com.xworkz.link.Locations;
import com.xworkz.link.StaffNames;
import com.xworkz.things.College;

public class CollegeRunner {

	public static void main(String[] args) {
	
		int[] vanNumbers = { 3456, 8700, 0126, 4567, 8055 };
		String[] vanDriverNames = { "Srinath", "venktesh", "girish", "Manu" };
		int[] contactDetails = { 99008863, 929394959, 636206035, 101010222 };
		Locations[] locations = { Locations.BANGLORE, Locations.HUBBALI, Locations.KOLAR, Locations.SRINIVASPUR };
		College college = new College("BGS", "SriRamReddy", 15000, 500, 15, StaffNames.GANGADHAR_GOWDA, vanNumbers,
				vanDriverNames, contactDetails, locations);
		college.display();
	}

}
