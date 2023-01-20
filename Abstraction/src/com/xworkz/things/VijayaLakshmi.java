package com.xworkz.things;

import com.xworkz.inter.KarnatakaRTO;

public class VijayaLakshmi extends JavaTrainee implements KarnatakaRTO {

	public VijayaLakshmi(String name, int age, char gender, String location, int income) {
		super(name, age, gender, location, income);
		
	}

	@Override
	public boolean paidTax(double paid) {
		System.out.println("method  paidtax from transport to karnatakaRto");
		return false;
	}

	@Override
	public double gst() {
		System.out.println("method gst from transport to karnatakaRto");
		return 0;
	}

	@Override
	public double vat() {
		System.out.println("method from karnatakaRto");
		return 0;
	}

	@Override
	public void training() {
		System.out.println("method from Javatrainee");
		
	}

	@Override
	public void executeProgram() {
		System.out.println("method from Javatrainee");
		
	}
	@Override
public void method() {
		super.eat();
		super.sleep();
}
}
