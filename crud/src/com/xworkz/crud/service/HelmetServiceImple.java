package com.xworkz.crud.service;

import com.xworkz.crud.dto.HelmetDto;
import com.xworkz.crud.repository.HelmateRepo;

public class HelmetServiceImple implements HelmetService{
  private HelmateRepo repo;
	 
  public HelmetServiceImple(HelmateRepo repo) {
	super();
	this.repo = repo;
}
	public HelmetServiceImple() {
		System.out.println("running Default constructer in helmate Service implementation");
	}
	@Override
	public boolean validateAndSave(HelmetDto dto) {
		
		boolean validateBrand=false;
		boolean validateColour=false; 
		boolean validateType=false;
		boolean validatePrice=false; 
		
		if(dto.getBrand()!=null && dto.getBrand().length()>=4 && dto.getBrand().length()<=10)
		{
			System.out.println("Brand is Valid");
			validateBrand=true;
		}
		else
		{
			System.err.println("Brand is inValid");
		}
		if(dto.getColour()!=null)
		{
			System.out.println("colour is valid");
			validateColour=true;
		}
		else
		{
			System.err.println("colour is InValid");
		}
		if(dto.getType()!=null)
		{
			System.out.println("Helmate Type  is valid");
			validateType=true;
		}
		else
		{
			System.err.println("Helmate Type  is InValid");
		}
		if(dto.getPrice()!=null && dto.getPrice()>=500 && dto.getPrice()<=20000)
		{
			System.out.println("Price  is valid");
			validatePrice=true;
		}
		else
		{
			System.err.println("Price is InValid");
		}
		
		if(validateBrand && validateColour && validatePrice && validateType  ) {
			System.out.println("validating all properties");
			boolean saved=this.repo.save(dto);
			System.out.println(saved);
			return saved;
		}
		else
		{
			System.err.println("HelmateDto is invalid,cannot saved");
		}
		return false;
	}

}
