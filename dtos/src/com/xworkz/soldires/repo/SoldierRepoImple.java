package com.xworkz.soldires.repo;

import com.xworkz.soldires.dtos.SoldiersDto;

public class SoldierRepoImple implements SoldierRepo {

	public SoldierRepoImple() {
		System.out.println("Running default constructer in SoldierRepoImple...............");
	}

	@Override
	public boolean save(SoldiersDto dto) {
		
		return true;
	}

}
