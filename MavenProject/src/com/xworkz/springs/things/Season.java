package com.xworkz.springs.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {

	private String name;
	private double duration;
	private String startingMonth;

	public Season() {
		System.out.println("Season constructer is running---");
	}

	@Override
	public String toString() {
		return "Season [name=" + name + ", duration=" + duration + ", startingMonth=" + startingMonth + "]";
	}

	public String getName() {
		return name;
	}
    @Value("Rainy")
	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}
@Value("2.5")
	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}
@Value("october")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

}
