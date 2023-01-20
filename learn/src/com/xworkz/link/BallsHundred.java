package com.xworkz.link;

public enum BallsHundred {

	FIRST(45,100),SECOND(60,124),THIRD(64,122),FOURTH(36,107),FIFTH(46,182);
	public int balls;
	public int hundred;
	
	private BallsHundred(int balls,int hundred) {
		this.balls=balls;
		this.hundred=hundred;
	}
}
