package com.xworkz.springs.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springs.configuration.Task;
import com.xworkz.springs.things.Actor;
import com.xworkz.springs.things.Rocket;
import com.xworkz.springs.things.Season;

public class TaskRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(Task.class);
		Rocket str = container.getBean("rocket", Rocket.class);
		System.out.println(str);
		System.out.println(str.getName());
		System.out.println(str.getWeight());
		System.out.println(str.getLaunchBy());
		Rocket str1 = container.getBean("space", Rocket.class);
		System.out.println(str1);
		System.out.println(str1.getName());
		System.out.println(str1.getWeight());
		System.out.println(str1.getLaunchBy());

		Actor act=container.getBean("actor",Actor.class);
		System.out.println(act);
		System.out.println(act.getName());
		System.out.println(act.getWife());
		System.out.println(act.getHeight());
		
		Actor act1=container.getBean("act",Actor.class);
		System.out.println(act1);
		System.out.println(act1.getName());
		System.out.println(act1.getWife());
		System.out.println(act1.getHeight());
	
		Season ses=container.getBean("season",Season.class);
		System.out.println(ses);
		System.out.println(ses.getName());
		System.out.println(ses.getStartingMonth());
		System.out.println(ses.getDuration());
		
		Season ses1=container.getBean("sea",Season.class);
		System.out.println(ses1);
		System.out.println(ses1.getName());
		System.out.println(ses1.getStartingMonth());
		System.out.println(ses1.getDuration());
	}

}
