package com.xworkz.things;

import com.xworkz.inter.XworkzRule;

public abstract class JavaTrainee  extends Person implements XworkzRule {

	public JavaTrainee(String name, int age, char gender, String location, int income) {
		super(name, age, gender, location, income);
		
	}@Override
	public boolean completedProgram() {
		System.out.println("implementaion in javaTrainee");
		return false;
	}
	@Override
	public boolean uploadedTask() {
		System.out.println("implementaion in javaTrainee");
		return false;
	}
	
	
public  void method(){
	super.eat();
	super.sleep();
}
 public  abstract void training();
 public abstract void executeProgram();
  
	
}
