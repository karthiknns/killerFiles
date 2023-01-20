package com.xworkz.encapulation.things;

public class MovieRun {

	
	
	public void acess() {
		Movie movie=new Movie("petta");
		movie.setValue("KGF","Srinidhy shetty", "Yash");
	  movie.budget=200;
	  movie.collection=1200;
	  movie.language="kannada";
		movie.display();
		movie.setValue("RRR", "Ali Bhatt", "Ramcharan & Ntr");
		movie.display();
	}
	
}
