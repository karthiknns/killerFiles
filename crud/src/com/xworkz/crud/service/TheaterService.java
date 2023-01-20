package com.xworkz.crud.service;

import com.xworkz.crud.dto.TheaterDto;
import com.xworkz.crud.exception.InvalidPropery;

public interface TheaterService {

	boolean validateAndSave(TheaterDto dto) throws InvalidPropery;
}
