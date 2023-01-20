package com.xworkz.firstTime.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Pencil {
	@Autowired
	@Qualifier("pencilName")
	private String name;
	@Autowired
	@Qualifier("pencilType")
	private String type;
	@Autowired
	@Qualifier("pencilPrice")
	private double price;
	@Autowired
	@Qualifier("pencilSharp")
	private boolean sharp;
	@Autowired
	@Qualifier("pencilStolean")
	private boolean stolean;

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", sharp=" + sharp + ", stolean="
				+ stolean + "]";
	}

}
