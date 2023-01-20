package com.xworkz.boot;

import com.xworkz.things.Yash;

public class YashRunner {

	public static void main(String[] args) {
		String[] movieNames = { "kirathaka", " janu", "  googly", "drama", "master piece", "kgf 1", "kgf 2" };
		String[] blockBasterMovies = { "kgf1", "kgf 2", "drama", "kirathaka", "janu" };
		String[] flopMovies = { "rockey", " kallara santhe", "gokula" };
		int[] movieCollections = { 200, 1200, 640, 328, 342 };
		String[] awards = { "sima", "best actor" };
		Yash yash = new Yash("Naveen kumar gowda", 36, "hero", "radhika pandit", 2, movieNames, blockBasterMovies,
				movieCollections, flopMovies, awards);
		yash.display();
	}

}
