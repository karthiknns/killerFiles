package com.xworkz.interfaces.boot;

import com.xworkz.interfaces.rule.WifeRule;

public class wifeRunner {

	public static void main(String[] args) {
		
		WifeRule wifeRule=new Husband();
		Husband husband=new Husband();
	
		Object obj=new Husband();
		Husband hus=(Husband)obj;
		
		
		wifeRule.beInTimeForHome();
		husband.deletGirlsContactNo();
		husband.serveFood();
		husband.weakelyShoping();
		wifeRule.income();

	}

}
