package com.xworkz.secondTime.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.secondTime.component.Engine;
import com.xworkz.secondTime.component.Ghost;
import com.xworkz.secondTime.component.NewsPaper;
import com.xworkz.secondTime.component.Snake;

@Configuration
@ComponentScan("com.xworkz.secondTime")

public class Beans {

	@Bean
	public NewsPaper paper() {
		System.out.println("Running  Newspaper............. ");

		return new NewsPaper("vijaya karnataka", "Vijay");
	}

	@Bean
	public int paperid() {
		System.out.println("Running  paperid............. ");

		return 102;
	}

	@Bean
	public double paperprice() {
		System.out.println("Running  paperid............. ");

		return 5.6;
	}

	@Bean
	public String paperownerName() {
		System.out.println("Running  paperownerName............. ");

		return "Vijayananda";
	}

	@Bean
	public String paperlanguage() {
		System.out.println("Running  paperlanguage............. ");

		return "Kannada";
	}

	@Bean
	public String papername() {
		System.out.println("Running  papername............. ");

		return "Vijaya Karnataka";
	}

	@Bean
	public Engine engine() {
		System.out.println("running engine..................");
		return new Engine("jet engine", 2121);
	}

	@Bean
	public String enginename() {
		System.out.println("running enginename..................");
		return "Jet engine";
	}

	@Bean
	public double enginenumber() {
		System.out.println("running enginename..................");
		return 10338;
	}

	@Bean
	public double engineversion() {
		System.out.println("running enginename..................");
		return 3.02;
	}

	@Bean
	public String enginecompany() {
		System.out.println("running enginename..................");
		return "Rools-Rayce";
	}

	@Bean
	public int enginestrokes() {
		System.out.println("running enginename..................");
		return 4;
	}

	@Bean
	public Snake snake() {
		System.out.println("running snake...........");
		return new Snake("black", false);
	}

	@Bean
	public String snakeName() {
		System.out.println("running snake name.........");
		return "Nagarahavu";
	}

	@Bean
	public double snakeLength() {
		System.out.println("running snakeLength.........");
		return 5.6;
	}

	@Bean
	public String snakeCountry() {
		System.out.println("running snakeCountry.........");
		return "INDIA";
	}

	@Bean
	public Ghost ghost() {
		System.out.println("Running Ghost");
		return new Ghost('M', LocalDate.of(2023, 02, 14), "Preethi", "Torchering girls", 6.2);
	}

	@Bean
	public String ghostName() {
		System.out.println("running ghostName.........");
		return "Dharshan";
	}

	@Bean
	public int ghostAge() {
		System.out.println("running ghostAge.........");
		return 21;
	}

	@Bean
	public String ghostColour() {
		System.out.println("running ghostColour.........");
		return "white";
	}

	@Bean
	public String ghostFather() {
		System.out.println("running ghostFather.........");
		return "Rajiv Gandhi";
	}

	@Bean
	public String ghostMother() {
		System.out.println("running ghostMother.........");
		return "IndraGandhi";
	}

}
