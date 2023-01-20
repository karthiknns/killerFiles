package com.xworkz.soldires.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldires.dtos.ResortDto;
@Component
public class ResortRepoImp implements ResortRepo {

	@Override
	public boolean save(ResortDto dto) {
		System.out.println("Running the Save Metod in ResortRepoImp");
		return true ;
	}

}
