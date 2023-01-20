package com.xworkz.soldires.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldires.dtos.MissileDto;
import com.xworkz.soldires.dtos.ResortDto;
import com.xworkz.soldires.repo.ResortRepo;
@Component
public class ResortServiceImp implements ResortService {
@Autowired
Validator validator;
@Autowired
ResortRepo repo;
	@Override
	public boolean validateAndSave(ResortDto dto) {

		System.out.println(dto);
		Set<ConstraintViolation<ResortDto>> violation = validator.validate(dto);
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
