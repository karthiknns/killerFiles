package com.xworkz.interfaces.boot;

import com.xworkz.interfaces.rule.WifeRule;

public class Husband  implements WifeRule{

	@Override
	public boolean beInTimeForHome() {
		System.out.println("running the beInTimeForHome");
		return false;
	}

	@Override
	public boolean deletGirlsContactNo() {
		System.out.println("running the deletGirlsContactNo");
		return false;
	}

	@Override
	public int income() {
		System.out.println("running the income");
		return 0;
	}
	
	

	@Override
	public boolean serveFood() {
		System.out.println("running the serveFood");
		return false;
	}

	@Override
	public boolean weakelyShoping() {
		System.out.println("running the weakelyShoping");
		return false;
	}
	

}
