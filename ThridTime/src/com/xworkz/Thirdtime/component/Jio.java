package com.xworkz.Thirdtime.component;

import org.springframework.stereotype.Component;

import com.xworkz.Thirdtime.constants.Provider;
@Component
public class Jio implements Provider {

	
	@Override
	public void connect() {
System.out.println("running connect in Jio");		
	}

}
