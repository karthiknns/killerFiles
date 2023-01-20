package com.xworkz.crud.repository;

import com.xworkz.crud.dto.IplDto;

public interface IplRepository {

	boolean create(IplDto dto);
   default IplDto findTeamName(String name)
   {
	   return null;
   }
}
