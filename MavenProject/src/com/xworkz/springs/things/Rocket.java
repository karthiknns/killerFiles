package com.xworkz.springs.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("Vikram")
	private String name;
	@Value("ISRO")
	private String launchBy;
	@Value("450d")
	private Double weight;

	public Rocket() {
		System.out.println("Running default cons.. in rocket");
	}

	@Override
	public String toString() {
		return "Rocket [name=" + name + ", launchBy=" + launchBy + ", weight=" + weight + "]";
	}

	public String getLaunchBy() {
		return launchBy;
	}

	public String getName() {
		return name;
	}

	public Double getWeight() {
		return weight;
	}
}
