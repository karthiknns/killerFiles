package com.xworkz.things.boot;

import com.xworkz.things.Object;
import com.xworkz.things.child.Cardiologist;
import com.xworkz.things.child.Dentist;
import com.xworkz.things.child.Ent;
import com.xworkz.things.parent.Doctor;

public class DoctorRunner {

	public static void main(String[] args) {

		Doctor doctor = new Dentist();
		Dentist doctor2 = (Dentist) doctor; //casting
		doctor2.gender = 'm';
		doctor2.income = 200;
		doctor.hospitalName = "Mallige Hospital";
		doctor.name = "Mallige";
		System.out.println(doctor2.gender);
		System.out.println(doctor.hospitalName);
		System.out.println(doctor.name);
		System.out.println(doctor2.income);

		Doctor doctor3 = new Ent();
		Ent ent = (Ent) doctor3;

		System.out.println(doctor3.hospitalName);
		System.out.println(doctor3.name);
		System.out.println(ent.gender);
		System.out.println(ent.income);

		
		Doctor doctor4=new Cardiologist();
		Cardiologist cardi=(Cardiologist)doctor4;
		System.out.println(doctor4.hospitalName);
		System.out.println(doctor4.name);
		System.out.println(cardi.gender);
		System.out.println(cardi.income);
		
		
	}

}
