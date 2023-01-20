package com.xworkz.things.child;

import com.xworkz.things.parent.HR;

public class Akshara extends HR
{
	@Override   //annotation
  public  void hiring()
	{
		super.hiring();
		System.out.println("hiring is going on child class");

	}
	public void maintain()
	{
		super.maintain();
		System.out.println("maintaing is done in parent");
	}

}
