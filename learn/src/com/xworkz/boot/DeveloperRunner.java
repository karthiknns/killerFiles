package com.xworkz.boot;

public class DeveloperRunner {

	public static void main(String[] args) {
		
		
   Developer ref=new Developer();
   
   ref.name="om";
   ref.compamy="TCS";
   ref.education="bsc";
   ref.experience=13;
   ref.salery=12345678;
   System.out.println("Developer names is--- "+ref.name);
   System.out.println("Developer company name is---"+ref.compamy);
   System.out.println("Developer eduction is--- "+ref.education);
   System.out.println("Developer experience is--- "+ref.experience);
   System.out.println("Developer salery is---"+ref.salery);
	}

}
