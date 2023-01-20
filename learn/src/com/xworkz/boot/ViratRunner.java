package com.xworkz.boot;

import com.xworkz.things.Virat;

public class ViratRunner {

	public static void main(String[] args) {
		String[] formatPlayed = { "t20", " odi", "  test", "ipl" };
		int[] someCenturies = { 101, 122, 124, 124, 153, 134, 183 };
		String[] currentFormats = { "indian circket team", "royal challengers banglore" };
		int[] centuriesInRcb = { 117, 124, 102, 107, 111 };
		String[] awards = { "Padma shri", "arjuna award", "dhyan chand khel ratna award",
				"mens odi circketer of th year" };
		Virat virat = new Virat("virat kohli", 33, 1, "Anushka sharma", 1, formatPlayed, someCenturies, currentFormats,
				centuriesInRcb, awards);
		virat.display();
	}

}
