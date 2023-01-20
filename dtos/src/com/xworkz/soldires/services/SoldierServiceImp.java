package com.xworkz.soldires.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldires.dtos.SoldiersDto;
import com.xworkz.soldires.repo.SoldierRepo;

public class SoldierServiceImp implements SoldierService {
	private SoldierRepo soldierRepo;

	public SoldierServiceImp() {
		System.out.println("running no argument constructer..............");
	}

	public SoldierServiceImp(SoldierRepo repo) {
		this.soldierRepo = repo;
	}

	@Override
	public boolean validateAndSave(SoldiersDto dto) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldiersDto>> violation = validator.validate(dto);
		if (!violation.isEmpty()) {
			System.out.println("Error...");
			violation.forEach(ele -> System.err.println(ele.getMessage()));
			return false;
		} else {
			System.out.println("DTO valid");
			boolean ref=soldierRepo.save(dto);
			System.out.println("saved.........................."+ref);
			return ref;
		}

	}

}
