package com.xworkz.secondTime.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.secondTime.component.Engine;
import com.xworkz.secondTime.component.Ghost;
import com.xworkz.secondTime.component.NewsPaper;
import com.xworkz.secondTime.component.Snake;
import com.xworkz.secondTime.configuration.Beans;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(Beans.class);

		NewsPaper ref = container.getBean("paper", NewsPaper.class);
		System.out.println(ref);

		Engine ref2 = container.getBean("engine", Engine.class);
		System.out.println(ref2);
	Snake ref3=container.getBean("snake",Snake.class);
	System.out.println(ref3);
	
	Ghost ref4=container.getBean(Ghost.class);
	System.out.println(ref4);
	}
}
