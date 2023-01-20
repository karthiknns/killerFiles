package com.xworkz.soldires.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldires.dtos.MissileDto;
import com.xworkz.soldires.dtos.SoldiersDto;
import com.xworkz.soldires.repo.MissileRepo;

@Component
public class MissileServiveImp implements MissileServive {
	@Autowired
	Validator validator;
	@Autowired
	MissileRepo repo;

	@Override
	public boolean validateAndSave(MissileDto dto) {
		System.out.println("running validateAndSave in MissileServiveImp........");
System.out.println(dto);
		Set<ConstraintViolation<MissileDto>> violation = validator.validate(dto);
		if (!violation.isEmpty()) {
			System.out.println("Error...");
			violation.forEach(ele -> System.err.println(ele.getMessage()));
			return false;
		} else {
			System.out.println("DTO valid");
			boolean ref = repo.save(dto);
			System.out.println("saved.........................." + ref);
			return ref;
		}

	
	}

}
