package com.xworkz.springs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springs.things.Actor;
import com.xworkz.springs.things.Rocket;
import com.xworkz.springs.things.Season;

@Configuration
@ComponentScan("com.xworkz.springs")
public class Task {
	@Bean
	public Rocket space() {

		Rocket roc = new Rocket();
		return roc;
	}

	@Bean
	public Actor act() {

		Actor act = new Actor("Balakrishna", "vasumathi", 5.3d);
		return act;
	}
	@Bean 
	public Season sea()
	{
		Season sc=new Season();
		return sc;
	}
}
