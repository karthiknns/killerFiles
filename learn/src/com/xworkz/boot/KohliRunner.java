package com.xworkz.boot;

import com.xworkz.link.BallsHundred;
import com.xworkz.things.Kohli;

public class KohliRunner {

	public static void main(String[] args) {
		BallsHundred[] ballsHundred= {BallsHundred.FIFTH,BallsHundred.FOURTH,BallsHundred.SECOND};
		Kohli kohli=new Kohli("virat kohli",ballsHundred);
		kohli.display();

	}

}
