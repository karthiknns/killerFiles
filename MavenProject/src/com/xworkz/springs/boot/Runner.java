package com.xworkz.springs.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springs.configuration.Main;
import com.xworkz.springs.things.Movie;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext contianier=new AnnotationConfigApplicationContext(Main.class);
		String[] str=
		            contianier.getBeanDefinitionNames();
System.out.println(str);
	}

}
