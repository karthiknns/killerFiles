package com.xworkz.soldires.boot;

import com.xworkz.soldires.dtos.SoldiersDto;
import com.xworkz.soldires.repo.SoldierRepoImple;
import com.xworkz.soldires.services.SoldierService;
import com.xworkz.soldires.services.SoldierServiceImp;

public class SoldierRunner {

	public static void main(String[] args) {
		SoldiersDto dto = new SoldiersDto("n", 12, 23, "Afganistan", "Mulaahalli");
		System.out.println(dto);

		SoldierRepoImple repo = new SoldierRepoImple();
		SoldierServiceImp service = new SoldierServiceImp(repo);
		service.validateAndSave(dto);
	}

}
