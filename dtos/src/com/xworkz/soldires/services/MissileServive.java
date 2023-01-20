package com.xworkz.soldires.services;

import com.xworkz.soldires.dtos.MissileDto;

public interface MissileServive {
	boolean validateAndSave(MissileDto dto);
}
