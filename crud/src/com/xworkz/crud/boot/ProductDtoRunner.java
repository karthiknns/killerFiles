package com.xworkz.crud.boot;

import java.awt.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.crud.dto.ProductDto;

public class ProductDtoRunner {

	public static void main(String[] args) {
		

		ProductDto dto=new ProductDto("Life Boy", 49D, LocalDate.of(2022, 12, 03),"Shivastores");
		ProductDto dto1=new ProductDto("Rin", 30D, LocalDate.of(2022, 11, 23),"Shivastores");
		ProductDto dto2=new ProductDto("Santhoor", 35D, LocalDate.of(2022, 2, 23),"Shivastores");
		ProductDto dto3=new ProductDto("Lux", 45D, LocalDate.of(2022, 3, 13),"Shivastores");
		
	 Collection<ProductDto> list=Stream.of(dto,dto1,dto2,dto3).collect(Collectors.toList());
	 
	 
	 //list.forEach(e->System.out.println(e));
	 
	 Comparator<ProductDto> ref=(a,b)->a.getMafDate().compareTo(b.getMafDate());
	 
	 System.out.println("after sorting in assending-------");
	list.stream().sorted(ref).forEach(e->System.out.println(e));
 Comparator<ProductDto> ref1=(a,b)->b.getMafDate().compareTo(a.getMafDate());
	 
	 System.out.println("after sorting in Desending------");
	list.stream().sorted(ref1).forEach(e->System.out.println(e));
	System.out.println("********************************************************************");
	Comparator<ProductDto> price=(a,b)->a.getPrice().compareTo(b.getPrice());
	list.stream().sorted(price).forEach(e->System.out.println(e));
	}
	

}
