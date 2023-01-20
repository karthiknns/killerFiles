package com.xworkz.crud.service;

import com.xworkz.crud.dto.PizzaDto;

public class PizzaServiceImplementation implements PizzaService {

	public PizzaServiceImplementation() {
	}

	@Override
	public boolean validateName(PizzaDto pizzaDto) {
		System.out.println("valedating the name" + pizzaDto);
		if (pizzaDto.getName() != null && pizzaDto.getName().length() >= 4 && pizzaDto.getName().length() <= 20) {
			System.out.println("Enter name is valid");
		} else {
			System.err.println("Enter name is not valid");
		}
		return false;
	}

	@Override
	public boolean validateCompany(PizzaDto pizzaDto) {
		System.out.println("validating the company name  " + pizzaDto);
		if (pizzaDto.getCompany() != null && pizzaDto.getCompany().length() >= 4
				&& pizzaDto.getCompany().length() <= 20) {
			System.out.println("Enter Company name is valid");
		} else {
			System.err.println("Enter Company name is not valid");
		}
		return false;
	}

	@Override
	public boolean validateSize(PizzaDto pizzaDto) {
System.out.println("Validating the size of pizza");
if(pizzaDto.getSize()!=null)
{
	System.out.println("enter pizza size is correct");
}
else
{
	System.err.println("enter pizza size is not correct");
}
{
	
}
		return false;
	}

	@Override
	public boolean validatePrice(PizzaDto pizzaDto) {
System.out.println("Validating the size of pizza");
if(pizzaDto.getPrice()>=50 && pizzaDto.getPrice()<=12000)
{
	System.out.println("Enter price is valid");
}
else
{
	System.err.println("Enter price is inValid");
}
		return false;
	}

	@Override
	public boolean validateFlavor(PizzaDto pizzaDto) {
		System.out.println("Validating the flavor");
		
		if(pizzaDto.getFlavor()!=null && pizzaDto.getFlavor().length()>=3 && pizzaDto.getFlavor().length()<=20) {
			System.out.println("Flavour is valid");
		}
		else
		{
			System.err.println("Flavor is not valid");
		}
		return false;
	}
@Override
	public boolean validateType(PizzaDto pizzaDto) {
System.out.println("Validating the Type");

if(pizzaDto.getType()!=null && pizzaDto.getType().equalsIgnoreCase("VEG") || pizzaDto.getType().equalsIgnoreCase("NONVEG") )
{
	System.out.println("Type of pizza is valid");
}
else
{
	System.err.println("type of pizza is not valid");
}
		return false;
	}

}
