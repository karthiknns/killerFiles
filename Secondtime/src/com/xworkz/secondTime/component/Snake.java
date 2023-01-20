package com.xworkz.secondTime.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Snake {
@Autowired
@Qualifier("snakeName")
	private String name;
@Autowired
@Qualifier("snakeLength")
	private double length;
	
	private String colour;
	private boolean poisionous;
	private String   country;
	public Snake(String colour, boolean poisionous) {
		super();
		this.colour = colour;
		this.poisionous = poisionous;
	}
	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", colour=" + colour + ", poisionous=" + poisionous
				+ ", country=" + country + "]";
	}
	public String getCountry() {
		return country;
	}
	@Autowired
	@Qualifier("snakeCountry")
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
