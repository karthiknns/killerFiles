package com.xworkz.crud.repository;

import com.xworkz.crud.dto.HelmetDto;

public class HelmateRepoImple implements HelmateRepo {
  private HelmetDto[] dto=new HelmetDto[4];
  private int currentTndex=0;
	public HelmateRepoImple() {
	
	}
	@Override
	public boolean save(HelmetDto dto) {
		System.out.println("Saving the Data   "+dto);
		if(currentTndex>=this.dto.length) {
			System.err.println("Storage is full");
			return false;
		}
		this.dto[this.currentTndex]=dto;
		System.out.println("data saved  == "+dto+"index is-- "+this.currentTndex);
		currentTndex++;
		
		return true;
	}

}
