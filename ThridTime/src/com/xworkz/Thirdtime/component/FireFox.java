package com.xworkz.Thirdtime.component;

import org.springframework.stereotype.Component;

import com.xworkz.Thirdtime.constants.Browser;
@Component
public class FireFox implements Browser{

	@Override
	public void browse() {
		System.out.println("running browser in firefox");
		
	}

	
	
}
