package com.xworkz.crud.boot;

import com.xworkz.crud.constant.PizzaSize;
import com.xworkz.crud.dto.PizzaDto;
import com.xworkz.crud.service.PizzaServiceImplementation;

public class PizzaRunner {

	public static void main(String[] args) {
		PizzaDto dto = new PizzaDto("Paneer Pizza", "Dominos", PizzaSize.CIRCLE, false, 450, "pepper onion", "NONVEG",
				null, null, null, null);

		/* System.out.println(dto); */

		PizzaServiceImplementation ref = new PizzaServiceImplementation();

		ref.validateName(dto);
		ref.validateCompany(dto);
		ref.validateSize(dto);
		ref.validatePrice(dto);
		ref.validateFlavor(dto);
		ref.validateType(dto);

	}

}
