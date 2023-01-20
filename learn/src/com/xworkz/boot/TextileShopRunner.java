package com.xworkz.boot;

import com.xworkz.things.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {
     TextileShop textileShop=new TextileShop();
     System.out.println(textileShop.ownerDaughterName);
     System.out.println(textileShop.ownerWifeName);
     System.out.println(textileShop.ownerName);
     System.out.println(textileShop.ownerDaughterNumber);
     System.out.println(textileShop.ownerNoOfWifes);
     System.out.println(textileShop.shopNo);
     System.out.println("---------------------------------------------");
     TextileShop textileShop1=new TextileShop("Dharshan");
     System.out.println(textileShop1.ownerDaughterName);
     System.out.println(textileShop1.ownerWifeName);
     System.out.println(textileShop1.ownerName);
     System.out.println(textileShop1.ownerDaughterNumber);
     System.out.println(textileShop1.ownerNoOfWifes);
     System.out.println(textileShop1.shopNo);
     System.out.println("---------------------------------------------");
     TextileShop textileShop2=new TextileShop("Dharshan","prema");
     System.out.println(textileShop2.ownerDaughterName);
     System.out.println(textileShop2.ownerWifeName);
     System.out.println(textileShop2.ownerName);
     System.out.println(textileShop2.ownerDaughterNumber);
     System.out.println(textileShop2.ownerNoOfWifes);
     System.out.println(textileShop2.shopNo);
     System.out.println("---------------------------------------------");
     TextileShop textileShop3=new TextileShop("Dharshan","prema","preethi");
     System.out.println(textileShop3.ownerDaughterName);
     System.out.println(textileShop3.ownerWifeName);
     System.out.println(textileShop3.ownerName);
     System.out.println(textileShop3.ownerDaughterNumber);
     System.out.println(textileShop3.ownerNoOfWifes);
     System.out.println(textileShop3.shopNo);
     System.out.println("---------------------------------------------");
     TextileShop textileShop4=new TextileShop("Dharshan","prema","preethi",767668863);
     System.out.println(textileShop4.ownerDaughterName);
     System.out.println(textileShop4.ownerWifeName);
     System.out.println(textileShop4.ownerName);
     System.out.println(textileShop4.ownerDaughterNumber);
     System.out.println(textileShop4.ownerNoOfWifes);
     System.out.println(textileShop4.shopNo);
     System.out.println("---------------------------------------------");
     TextileShop textileShop5=new TextileShop("Dharshan","prema","preethi",767668863,2);
     System.out.println(textileShop5.ownerDaughterName);
     System.out.println(textileShop5.ownerWifeName);
     System.out.println(textileShop5.ownerName);
     System.out.println(textileShop5.ownerDaughterNumber);
     System.out.println(textileShop5.ownerNoOfWifes);
     System.out.println(textileShop5.shopNo);
     TextileShop textileShop6=new TextileShop("Dharshan","prema","preethi",767668863,2,8055);
     System.out.println(textileShop6.ownerDaughterName);
     System.out.println(textileShop6.ownerWifeName);
     System.out.println(textileShop6.ownerName);
     System.out.println(textileShop6.ownerDaughterNumber);
     System.out.println(textileShop6.ownerNoOfWifes);
     System.out.println(textileShop6.shopNo);
	}

}
