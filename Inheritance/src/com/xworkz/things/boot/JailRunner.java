package com.xworkz.things.boot;

import com.xworkz.things.child.CentralJail;
import com.xworkz.things.child.DistrictJail;
import com.xworkz.things.child.SubJail;
import com.xworkz.things.parent.Jail;

public class JailRunner {

	public static void main(String[] args) {
		Jail jail=new CentralJail();
		CentralJail cen=(CentralJail)jail;
		System.out.println(cen.jailerName);
		System.out.println(cen.nameOfOneThief);
		System.out.println(cen.nature);
		System.out.println(cen.NoOfCases);
		System.out.println(cen.use);
		
		Jail jail1=new DistrictJail();
		DistrictJail cen1=(DistrictJail)jail1;
		System.out.println(cen1.jailerName);
		System.out.println(cen1.nameOfOneThief);
		System.out.println(cen1.nature);
		System.out.println(cen1.use);
		System.out.println(cen1.NoOfCases);
		
		Jail jail3=new SubJail();
		SubJail sub=(SubJail)jail3;
		System.out.println(sub.jailerName);
		System.out.println(sub.nameOfOneThief);
		System.out.println(sub.nature);
		System.out.println(sub.use);
		System.out.println(sub.NoOfCases);

	}

}
