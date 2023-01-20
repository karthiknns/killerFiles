package com.xworkz.firstTime.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Rubber {
	@Autowired
	@Qualifier("rubberName")
	private String name;
	@Autowired
	@Qualifier("rubberType")
	private String type;
	@Autowired
	@Qualifier("rubberPrice")
	private double price;
	@Autowired
	@Qualifier("rubberShape")
	private String shape;
	@Autowired
	@Qualifier("rubberStolen")
	private boolean stolen;
	@Autowired
	@Qualifier("rubberSize")
	private char size;

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", shape=" + shape + ", stolen="
				+ stolen + ", size=" + size + "]";
	}
}
