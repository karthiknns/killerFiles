package com.xworkz.secondTime.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Engine {

	private String name;
	
	private  double number;
	@Autowired
	@Qualifier("engineversion")
	private double version;
	@Autowired
	@Qualifier("enginecompany")
	private String company;
	private int strokes;
	
	@Override
	public String toString() {
		return "Engine [name=" + name + ", number=" + number + ", version=" + version + ", company=" + company
				+ ", strokes=" + strokes + "]";
	}
	@Autowired
	public Engine(@Qualifier("enginename") String name,@Qualifier("enginenumber") double number) {
		super();
		this.name = name;
		this.number = number;
	}
	public int getStrokes() {
		return strokes;
	}
	@Autowired
	@Qualifier("enginestrokes")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}
}
