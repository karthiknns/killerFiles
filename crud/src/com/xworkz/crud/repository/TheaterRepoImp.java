package com.xworkz.crud.repository;

import com.xworkz.crud.dto.TheaterDto;
import com.xworkz.crud.exception.StorageIsMore;

public class TheaterRepoImp implements TheaterRepo {

	private TheaterDto[] dtos=new TheaterDto[2];
	private int currentPosition=0;
	
	public TheaterRepoImp() {
	}
	
	public boolean save(TheaterDto dto) {
		if(this.currentPosition>=this.dtos.length)
		{
			System.err.println("Storage is more ,cant able to save");
			throw new StorageIsMore("Storage is more plz handel it");
		}
		else
		{
			System.out.println("Theaterdto is saved");
		}
		this.dtos[currentPosition]=dto;
		System.out.println("Saved data is --"+dto+" --current position is--"+currentPosition);
		currentPosition++;
		return true;
	}

	

}
