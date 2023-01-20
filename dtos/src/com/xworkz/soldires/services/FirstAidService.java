package com.xworkz.soldires.services;

import com.xworkz.soldires.dtos.FirstAidDto;

public interface FirstAidService {

	boolean validateAndSave(FirstAidDto dto);
}
