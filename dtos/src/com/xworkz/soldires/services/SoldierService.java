package com.xworkz.soldires.services;

import com.xworkz.soldires.dtos.SoldiersDto;

public interface SoldierService {

	boolean validateAndSave(SoldiersDto dto);
}
