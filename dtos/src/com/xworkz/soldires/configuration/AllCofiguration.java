package com.xworkz.soldires.configuration;

import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.soldires")
public class AllCofiguration {
	
	@Bean
	public Validator validator()
	{
		Validation.buildDefaultValidatorFactory();
		return Validation.buildDefaultValidatorFactory().getValidator();
	}

}
