package com.xworkz.soldires.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldires.dtos.MissileDto;
@Component
public class MissileRepoImp implements MissileRepo {

	@Override
	public boolean save(MissileDto dto) {
System.out.println("Running Save in MissileRepoImp");
		return true;
	}

}
