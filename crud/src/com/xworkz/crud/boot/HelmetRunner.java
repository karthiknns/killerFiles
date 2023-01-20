package com.xworkz.crud.boot;

import java.util.Scanner;

import com.xworkz.crud.constant.Colour;
import com.xworkz.crud.constant.HelmateType;
import com.xworkz.crud.dto.HelmetDto;
import com.xworkz.crud.repository.HelmateRepo;
import com.xworkz.crud.repository.HelmateRepoImple;
import com.xworkz.crud.service.HelmetService;
import com.xworkz.crud.service.HelmetServiceImple;

public class HelmetRunner {

	public static void main(String[] args) {
	
		
		HelmetDto dto=new HelmetDto("VEGA", 550D,Colour.BLACK , HelmateType.SPORTS);
	
		
		System.out.println(dto);
		HelmateRepo repo=new HelmateRepoImple();
		HelmetService ser=new HelmetServiceImple(repo);
		boolean sucess=ser.validateAndSave(dto);
System.out.println("Sucess  -- "+sucess);
	}

}
