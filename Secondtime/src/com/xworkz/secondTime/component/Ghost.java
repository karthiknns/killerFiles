package com.xworkz.secondTime.component;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	@Autowired
	@Qualifier("ghostName")
	private String name;
	@Autowired
	@Qualifier("ghostAge")
	private int age;
	@Autowired
	@Qualifier("ghostColour")
	private String colour;
	@Autowired
	@Qualifier("ghostFather")
	private String father;
	@Autowired
	@Qualifier("ghostMother")
	private String mother;
	private char gender;
	private LocalDate deathDate;
	private String wifename;
	private String job;
	private double height;

	public Ghost(char gender, LocalDate deathDate, String wifename, String job, double height) {
		super();
		this.gender = gender;
		this.deathDate = deathDate;
		this.wifename = wifename;
		this.job = job;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", age=" + age + ", colour=" + colour + ", father=" + father + ", mother="
				+ mother + ", gender=" + gender + ", deathDate=" + deathDate + ", wifename=" + wifename + ", job=" + job
				+ ", height=" + height + "]";
	}

}
