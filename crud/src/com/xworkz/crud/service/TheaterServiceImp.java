package com.xworkz.crud.service;

import com.xworkz.crud.dto.TheaterDto;
import com.xworkz.crud.exception.InvalidPropery;
import com.xworkz.crud.repository.TheaterRepo;


public class TheaterServiceImp implements TheaterService {

	TheaterRepo repo;
	
	public TheaterServiceImp(TheaterRepo repo) {
		this.repo=repo;
	}
	@Override
	public boolean validateAndSave(TheaterDto dto) throws InvalidPropery {
		
		boolean validateId=false;
		boolean validateName=false;
		boolean validateBrand=false;
		boolean validateSeats=false;
		
		if(dto.getId()!=0 )
		{
			System.out.println("Id is Valid");
			validateId=true;
		}
		else
		{
			System.err.println("Id is inValid");
		}
		
		if(dto.getName()!=null && dto.getName().length()>=0 && dto.getName().length()<=10)
		{
			System.out.println("name is Valid");
			validateName=true;
		}
		else
		{
			System.err.println("name is inValid");
			
		}
		
		if(dto.getBrand()!=null && dto.getBrand().length()>=3 && dto.getBrand().length()<=20)
		{
			System.out.println("brand is Valid");
			validateBrand=true;
		}
		else
		{
			System.err.println("brand is inValid");
		}
		if(dto.getSeats()!=null )
		{
			System.out.println("Seats is Valid");
			validateSeats=true;
		}
		else
		{
			System.err.println("Seats is inValid");
		}
		if(validateId && validateName && validateBrand && validateSeats)
		{
			System.out.println("validating all properties");
			boolean store=this.repo.save(dto);
			System.out.println("Store the data");
			return store;
		}
		throw new InvalidPropery(null);
		
	}

}
