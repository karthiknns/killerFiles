package com.xworkz.soldires.Exception;

public class NameNotFoundException extends RuntimeException{
	
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Name not found";
	}

}
