package com.xworkz.boot;

import com.xworkz.things.Country;

public class CountryRunner {

	public static void main(String[] args) {
   
		String[] famousPM= {"modi","indra gandhi","atal bihari vajpayee","lal bhadur shastri"};
		String[] freedomFighters= {"bhagat singh","subash chandra bose","sardar vallabhai patel","chandra shekar azad"};
		String[] famousStates= {"karnataka","andhra pradesh","maharastra","delhi","gujarath","west bengal"};
		int[] importantYears= {1947,1950};
		String[]  famousPlaces= {"taj mahal","red fort","qutab minar","india gate"};
		Country country=new Country( "india", 135000000, "rupes",30, "vasco da gama", famousPM, freedomFighters, famousStates, importantYears,  famousPlaces);
      country.display();	
	}

}
