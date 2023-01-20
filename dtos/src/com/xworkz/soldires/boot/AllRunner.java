package com.xworkz.soldires.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldires.configuration.AllCofiguration;
import com.xworkz.soldires.dtos.FirstAidDto;
import com.xworkz.soldires.dtos.MissileDto;
import com.xworkz.soldires.dtos.ResortDto;
import com.xworkz.soldires.repo.MissileRepoImp;
import com.xworkz.soldires.services.FirstAidService;
import com.xworkz.soldires.services.MissileServiveImp;
import com.xworkz.soldires.services.ResortService;

public class AllRunner {
	public static void main(String[] args) {
		
		MissileDto dto=new MissileDto("Bramha");
		
		
		ApplicationContext container=new AnnotationConfigApplicationContext(AllCofiguration.class);
		
		boolean ref=container.getBean(MissileServiveImp.class).validateAndSave(dto);
		System.out.println("saved......."+ref);
		//container.getBean(MissileRepoImp.class).save(dto);
		
		FirstAidDto dto1=new FirstAidDto();
		
		boolean ref1=container.getBean(FirstAidService.class).validateAndSave(dto1);
		System.out.println("saved......."+ref1);
		
		ResortDto dto2=new ResortDto();
		boolean ref2=container.getBean(ResortService.class).validateAndSave(dto2);
		System.out.println("saved......."+ref2);
			}

}
