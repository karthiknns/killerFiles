package com.xworkz.interfaces.boot;

import com.xworkz.interfaces.rule.TrafficRule;

public class People implements TrafficRule {

	@Override
	public boolean trippleraid() {
		System.out.println("running tripple raid sucessfully");
		return false;
	}

	@Override
	public boolean drivinglisence() {
		System.out.println("running drivinglisence sucessfully");
		return false;
	}

	@Override
	public boolean insurance() {
		System.out.println("running insurance sucessfully");

		return false;
	}

	@Override
	public boolean rcBook() {
		System.out.println("running rcBook sucessfully");

		return false;
	}

	@Override
	public boolean wearHealmet() {
		System.out.println("running wearHealmet sucessfully");

		return false;
	}

}
