package com.xworkz.encapulation.boot;

import com.xworkz.encapulation.things.Movie;
import com.xworkz.encapulation.things.MovieRun;

public class MovieRunner {

	public static void main(String[] args) {

		MovieRun movieRun=new MovieRun();
		
		 Movie movie=new Movie(null);
		movieRun.acess();
	}

}
