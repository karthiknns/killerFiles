package com.xworkz.Thirdtime.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;



public class Runner {
public static void main(String[] args) {
	
	ApplicationContext container = new AnnotationConfigApplicationContext(Configuration.class);
System.out.println(container);
}
}
