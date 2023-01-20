package com.xworkz.soldires.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldires.dtos.FirstAidDto;
@Component
public class FirstAidRepoImp implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDto dto) {
		System.out.println("Running the Save Metod in FirstAidRepoImp");
		return true;
	}

}
