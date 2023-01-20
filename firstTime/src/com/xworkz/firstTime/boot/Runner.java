package com.xworkz.firstTime.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.firstTime.bean.FirstClass;
import com.xworkz.firstTime.component.HardwareShop;
import com.xworkz.firstTime.component.Movie;
import com.xworkz.firstTime.component.Pencil;
import com.xworkz.firstTime.component.Rubber;
import com.xworkz.firstTime.component.Software;
import com.xworkz.firstTime.component.SoftwareEngineer;

public class Runner {
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(FirstClass.class);

		HardwareShop ref = container.getBean("hardware", HardwareShop.class);
		System.out.println(ref);
		Software ref1 = container.getBean("software", Software.class);
		System.out.println(ref1);
		SoftwareEngineer ref2 = container.getBean("engineer", SoftwareEngineer.class);
		System.out.println(ref2);
		Pencil ref3 = container.getBean("pencil", Pencil.class);
		System.out.println(ref3);
		Rubber ref4 = container.getBean("rubber", Rubber.class);
		System.out.println(ref4);
		Movie ref5 = container.getBean("movie", Movie.class);
		System.out.println(ref5);
	
     
	}
}
