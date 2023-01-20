package com.xworkz.crud.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.crud.dto.SanitizerDto;

public class SanitizerRunner {

	public static void main(String[] args) {

		SanitizerDto dto1=new SanitizerDto("Lifeboy", 2022, 34.0, "white");
		SanitizerDto dto2=new SanitizerDto("Santhoor", 2022, 10.0, "greay");
		SanitizerDto dto3=new SanitizerDto("Patanjili", 2022, 4.0, "green");
		SanitizerDto dto4=new SanitizerDto("Apple", 2022, 99.0, "red");
		SanitizerDto dto5=new SanitizerDto("Samsung", 2022, 45.0, "orange");
		SanitizerDto dto6=new SanitizerDto("Mi", 2022, 30.0, "vilot");
		SanitizerDto dto7=new SanitizerDto("Nokia", 2022, 25.0, "white");
		SanitizerDto dto8=new SanitizerDto("Mts", 2022, 2.0, "red");
		SanitizerDto dto9=new SanitizerDto("Oppo", 2022, 35.0, "darkGreen");
		SanitizerDto dto10=new SanitizerDto("Vivo", 2022, 3.0, null);
		
		Collection<SanitizerDto> dto=new ArrayList<SanitizerDto>();
		dto.add(dto1);
		dto.add(dto2);
		dto.add(dto3);
		dto.add(dto4);
		dto.add(dto5);
		dto.add(dto6);
		dto.add(dto8);
		dto.add(dto7);
		dto.add(dto9);
		dto.add(dto10);
		
		
			
			
		System.out.println("total size is "+dto.size());
		for (SanitizerDto sanitizerDto : dto) {
			if(sanitizerDto.getBrand()==null ||sanitizerDto.getColour()==null ||sanitizerDto.getId()==0 ||sanitizerDto.getPrice()==0)
			{
				
			
			System.out.println("null size is:"+sanitizerDto);
			}
		}

		Iterator<SanitizerDto> itr=dto.iterator();
		
		while(itr.hasNext()) {
			SanitizerDto ref=itr.next();
			if(ref.getPrice()<=5) {
				itr.remove();
				System.out.println(ref.getPrice());
				
			}		
			System.out.println("size is "+dto.size());

			
				
		}
	}

}
