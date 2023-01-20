package com.xworkz.boot;

import com.xworkz.things.Rohith;

public class RohithRunner {

	public static void main(String[] args) {
		String[] formatPlayed = { "t20", " odi", "  test", "ipl" };
		int[] someCenturies = { 145, 127, 124, 127, 153, 134, 264 };
		String[] currentFormats = { "indian circket team", "mumbai indians" };
		int[] centuriesInMi = { 117, 124, 102, 107, 111 };
		String[] awards = { "Padma shri", "arjuna award", "dhyan chand khel ratna award",
				"mens odi circketer of th year", "ipl tropies" };
		Rohith rohith=new Rohith( "Rohith sharma", 34, 2,"Rithika sharma", 1, formatPlayed, someCenturies, currentFormats, centuriesInMi,  awards);
      rohith.display();
	}

}
