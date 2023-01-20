package com.xworkz.things.boot;

public class CigarateRunner {
	
	public static void main(String[] args)
	{
		Cigarate cigarate=new Cigarate();
		
		cigarate.madeof="leaves";
		cigarate.sellNearEducationInstitutions=false;
		cigarate.size='m';
		cigarate.madeIn="India";
		
		
		System.out.println(cigarate.price);
		System.out.println(cigarate.sellNearEducationInstitutions);
		System.out.println(cigarate.size);
		System.out.println(cigarate.madeIn);
		System.out.println(cigarate.madeof);
		System.out.println(cigarate.ageLimit);
		System.out.println(cigarate.avaliableIn);
		System.out.println(cigarate.brand);
        System.out.println(cigarate.colour);
        System.out.println(cigarate.companyOwner);
		System.out.println(cigarate.companyRevenue);
		System.out.println(cigarate.healthy);
		System.out.println(cigarate.workers);
        
	}

}
