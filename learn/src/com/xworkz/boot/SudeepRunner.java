package com.xworkz.boot;

import com.xworkz.things.Sudeep;

public class SudeepRunner {

	public static void main(String[] args) {
		String[] movieNames= {"Vikranth rona"," Eega","  pailwaan","kotigobba-3"," hebbuli","kotigobba 2"," huchha","ranna","kempe gowda","maanikya"};
		String[] blockBasterMovies= {"My autograph","kempe gowda ","ranna","manikya","eega"};
		String[] flopMovies= {"kotigobba 3"," pailwaan ","madakari"};
		int[] movieCollections= {200,1200,640,328,342};
		String[]  awards= {"sima","best actor","best villan"};
     Sudeep yash=new Sudeep(" Sudeep Sanjeev",49,"hero","priya Sudeep",1,movieNames,blockBasterMovies,
 			movieCollections,flopMovies,awards); 
     yash.display();
	}

}
