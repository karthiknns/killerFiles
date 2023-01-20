package com.xworkz.soldires.services;

import com.xworkz.soldires.Exception.NameNotFoundException;
import com.xworkz.soldires.dtos.BankDto;

public class BankDtoService {
	private BankDto dto;
	
	public BankDtoService() {
		// TODO Auto-generated constructor stub
	}
	
public BankDto namebyid(String name) {
	
	if(name.equals(dto.getName())) {
		
		System.out.println("name is found");
	}
	else
	{
		throw new NameNotFoundException();
	}
	
	return dto;
	
	
	
}


}
