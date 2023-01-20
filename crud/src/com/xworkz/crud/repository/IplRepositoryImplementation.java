package com.xworkz.crud.repository;

import javax.management.RuntimeErrorException;

import com.xworkz.crud.dto.IplDto;
import com.xworkz.crud.exception.SizeExceedException;

public class IplRepositoryImplementation implements IplRepository {
	private IplDto[] iplDtos = new IplDto[10];
	private int currentIndex = 0;

	@Override
	public boolean create(IplDto dto) {
		System.out.println("Running create of IplDto" + dto);

		if (this.currentIndex >= this.iplDtos.length) {
			System.err.println("size exceeded cannot add more ipl teams");
			throw new SizeExceedException();

		}
		this.iplDtos[this.currentIndex] = dto;
		System.out.println("Saved" + dto + "in index " + this.currentIndex);
		currentIndex++;
		return true;
	}

	@Override
	public IplDto findTeamName(String name) {
		System.out.println("running find team name");
		for (IplDto iplDto : iplDtos) {
			if (iplDto != null && iplDto.getTeamName().equalsIgnoreCase(name)) {
				System.out.println("name is matched " + iplDto);
				return iplDto;
			} 
			
				  
			

		}
		System.out.println("name doesn't matched"+name);

		return IplRepository.super.findTeamName(name);
	}

}
