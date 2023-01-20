package com.xworkz.firstTime.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Movie {
	@Autowired
	@Qualifier("movieName")
	private String hero;
	@Autowired
	@Qualifier("movieHero")
	private String name;
	@Autowired
	@Qualifier("movieBudget")
	private double  budget;
	@Autowired
	@Qualifier("movieCollection")
	private double collection;
	@Override
	
	public String toString() {
		return "Movie [hero=" + hero + ", name=" + name + ", budget=" + budget + ", collection=" + collection + "]";
	}


}
