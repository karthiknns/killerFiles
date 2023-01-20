package com.xworkz.springs.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

	private String name;
	private String wife;
	private Double height;

	public Actor(@Value("Yash") String name, @Value("Radhika") String wife, @Value("5.9D") Double height) {
		super();
		this.name = name;
		this.wife = wife;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public String getWife() {
		return wife;
	}

	public Double getHeight() {
		return height;
	}

}
