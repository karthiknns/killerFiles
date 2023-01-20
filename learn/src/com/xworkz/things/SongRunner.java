package com.xworkz.things;

public class SongRunner {

	public static void main(String[] args) {

		  Song ref=new Song();
		  
		  ref.singer="siddhart basur";
		  ref.language="kannada";
		  ref.name="hulli hulli";
		  ref.lirics="cheathan";
		  
		  System.out.println("song name is---"+ref.name);
		  System.out.println("song language is---"+ref.language);
		  System.out.println("song singer is--- "+ref.singer);
	        System.out.println("song lirics is---"+ref.lirics);
	}

}
