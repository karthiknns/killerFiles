package com.xworkz.crud.service;

import com.xworkz.crud.dto.PizzaDto;

public interface PizzaService {

	boolean validateName(PizzaDto pizzaDto);
	boolean validateCompany(PizzaDto pizzaDto);
	boolean validateSize(PizzaDto pizzaDto);
	boolean  validatePrice(PizzaDto pizzaDto);
	boolean validateFlavor(PizzaDto pizzaDto);
	boolean validateType(PizzaDto pizzaDto);
}
