package com.xworkz.things.child;

import com.xworkz.things.parent.Terrorist;

public class Kasab extends Terrorist {
	@Override //annotation
	public void killerDetails() {
		super.killerDetails();
		System.out.println("the killer details in child r");
	}
@Override
	public void locationDetails() {
	super.locationDetails();
		System.out.println("the location details in child r");
	}
}
