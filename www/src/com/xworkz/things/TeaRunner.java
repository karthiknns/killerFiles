package com.xworkz.things;

public class TeaRunner {

	public static void main(String[] args) {
    
		Tea tea=new Tea();
		
		tea.colour="green";
		tea.companyBrandAmbassadar="Deepika padkone";
		tea.companyLogo=true;
		tea.companyLogoColour="brown";
		tea.companyName="tetley";
		tea.companyRevenue=200000000;
		tea.quantity=500;
		tea.totalEmployees=25000;
		tea.companyOwner="raj";
		
		System.out.println(tea.colour);
		System.out.println(tea.companyBrandAmbassadar);
		System.out.println(tea.companyLogo);
		System.out.println(tea.companyLogoColour);
		System.out.println(tea.companyName);
		System.out.println(tea.companyRevenue);
		System.out.println(tea.quantity);
		System.out.println(tea.totalEmployees);
		System.out.println(tea.companyOwner);
		
		
		System.out.println(tea.price);
		System.out.println(tea.nice);
		System.out.println(tea.milkContent);
		System.out.println(tea.type);
		System.out.println(tea.waterContent);
		System.out.println(tea.transport);
		}

}
