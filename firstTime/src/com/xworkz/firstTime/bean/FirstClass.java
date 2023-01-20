package com.xworkz.firstTime.bean;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.firstTime.component.HardwareShop;
import com.xworkz.firstTime.component.Movie;
import com.xworkz.firstTime.component.Pencil;
import com.xworkz.firstTime.component.Rubber;
import com.xworkz.firstTime.component.Software;
import com.xworkz.firstTime.component.SoftwareEngineer;

@Configuration
@ComponentScan
public class FirstClass {

	@Bean
	public HardwareShop hardware()
	{
		System.out.println("hardware ..........................");
		HardwareShop ref=new HardwareShop();
		
		return ref;
	}
	@Bean
	public int shopid() {
		System.out.println("running shop...............");

		return 18;
	}
	@Bean
	public String shopname() {
		System.out.println("running shopname...............");

		return "Dharshan hardware";
	}
	@Bean
	public String shopOwnerName() {
		System.out.println("running shopOwnerName...............");

		return "Dharshan";
	}
	@Bean
	public String shopOwnerGst() {
		System.out.println("running shopOwnerGst...............");

		return "22kn5165461531";
	}
	@Bean
	public String shopadress() {
		System.out.println("running shopadress...............");

		return "Mullahalli";
	}
	
	@Bean
	public SoftwareEngineer engineer()
	{
		System.out.println("SoftwareEngineer ..........................");
		SoftwareEngineer ref=new SoftwareEngineer();
		
		return ref;
	}
	
	@Bean
	public String softwareName() {
		System.out.println("running softwareName...............");

		return "Maven";
	}
	@Bean
	public double softwareVersion() {
		System.out.println("running softwareVersion...............");

		return 3.5;
	}
	@Bean
	public String softwareDeveloper() {
		System.out.println("running softwareDeveloper...............");

		return "Sanketh";
	}
	@Bean
	public LocalDate softwareDate() {
		System.out.println("running softwareDate...............");

		return LocalDate.of(2022, 10, 20);
	}
	@Bean
	public boolean softwareFree() {
		System.out.println("running softwareFree...............");

		return true;
	}
	@Bean
	public Software software()
	{
		System.out.println("Software ..........................");
		Software ref=new Software();
		
		return ref;
	}
	@Bean
	public String softwareEngineerName() {
		System.out.println("running softwareEngineerName...............");

		return "Suhas";
	}
	@Bean
	public int softwareEngineerSalery() {
		System.out.println("running softwareEngineerSalery...............");

		return 35000;
	}
	@Bean
	public String softwareEngineerCompany() {
		System.out.println("running softwareEngineerCompany...............");

		return "Xworkz";
	}
	@Bean
	public double softwareEngineerexp() {
		System.out.println("running softwareEngineerexp...............");

		return 2.5;
	}
	
	@Bean
	public Pencil pencil()
	{
		System.out.println("Software ..........................");
		Pencil ref=new Pencil();
		
		return ref;
	}
	@Bean
	public String pencilName() {
		System.out.println("running pencilName...............");

		return "Apsara";
	}
	@Bean
	public String pencilType() {
		System.out.println("running pencilType...............");

		return "pen-pencil";
	}
	@Bean
	public double pencilPrice() {
		System.out.println("running pencilPrice...............");

		return 10;
	}
	@Bean
	public String pencilColour() {
		System.out.println("running pencilColour...............");

		return "white";
	}
	@Bean
	public boolean pencilSharp() {
		System.out.println("running pencilSharp...............");

		return false;
	}
	@Bean
	public boolean pencilStolean() {
		System.out.println("running softwareFree...............");

		return true;
	}
	@Bean
	public Rubber rubber()
	{
		System.out.println("Rubber ..........................");
		Rubber ref=new Rubber();
		
		return ref;
	}
	
	@Bean
	public String rubberName() {
		System.out.println("running rubberName...............");

		return "apsara";
	}
	@Bean
	public String rubberType() {
		System.out.println("running rubberType...............");

		return "non-dust";
	}
	@Bean
	public double rubberPrice() {
		System.out.println("running rubberPrice...............");

		return 5;
	}
	@Bean
	public String rubberColour() {
		System.out.println("running rubberColour...............");

		return "non-dust";
	}
	
	
	@Bean
	public String rubberShape() {
		System.out.println("running rubberShape...............");

		return "Square";
	}
	@Bean
	public boolean rubberStolen() {
		System.out.println("running rubberStolen...............");

		return true;
	}
	@Bean
	public char rubberSize() {
		System.out.println("running rubberSize...............");

		return 'M';
	}

	@Bean
	public Movie movie() {
		System.out.println("running movie...............");
Movie ref=new Movie();
		return ref;
	}


@Bean
public String movieName() {
	System.out.println("running movieName...............");

	return "KGF";
}
@Bean
public String movieHero() {
	System.out.println("running movieHero...............");

	return "Yash";
}
@Bean
public double movieBudget() {
	System.out.println("running movieBudget...............");

	return 200;
}
@Bean
public double movieCollection() {
	System.out.println("running movieCollection...............");

	return 1500;
}
}
