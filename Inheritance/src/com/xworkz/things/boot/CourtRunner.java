package com.xworkz.things.boot;

import com.xworkz.things.child.DistrictCourt;
import com.xworkz.things.child.SupremeCourt;
import com.xworkz.things.child.TalukCourt;
import com.xworkz.things.parent.Court;

public class CourtRunner {

	public static void main(String[] args) {
		SupremeCourt supremeCourt=new SupremeCourt();  
		System.out.println(supremeCourt.name);
		System.out.println(supremeCourt.location);
		System.out.println(supremeCourt.cases);
		System.out.println(supremeCourt.staff);
		
		Court court=new DistrictCourt();
		DistrictCourt dis=(DistrictCourt)court;  ///casting
		System.out.println(dis.name);
		System.out.println(dis.location);
		System.out.println(dis.cases);
		System.out.println(dis .staff);
		
		Court court1=new TalukCourt();
		TalukCourt tal=(TalukCourt)court1;
		System.out.println(tal.name);
		System.out.println(tal.location);
		System.out.println(tal.cases);
		System.out.println(tal.staff);
	}

}
