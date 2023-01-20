package com.xworkz.boot;

import com.xworkz.things.Company;
import com.xworkz.things.Piller;

public class PillerRunner {

	public static void main(String[] args) {

		Piller piller;
		piller = new Piller(204, "basement", 6.5, "beam");
		piller.showOff();
	}

}
