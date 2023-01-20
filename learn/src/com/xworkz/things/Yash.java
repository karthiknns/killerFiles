package com.xworkz.things;

public class Yash {
	
	public String fullName;
    public int age;
    public String type;
    public String wifeName;
    public int noOfChildrens;
    public String[] movieNames;
    public String[] blockBasterMovies;
    public String[] flopMovies;
    public int[] movieCollections;
    public String[] awards;
	public Yash(String fullName,int age,String type,String wifeName,int noOfChildrens,String[] movieNames,String[] blockBasterMovies,
			int[] movieCollections,String[] flopMovies,String[] awards)
	{
		this.fullName=fullName;
		this.age=age;
		this.type=type;
		this.wifeName=wifeName;
		this.noOfChildrens=noOfChildrens;
		this.movieNames=movieNames;
		this.blockBasterMovies=blockBasterMovies;
		this.flopMovies=flopMovies;
		this.movieCollections=movieCollections;
		this.awards=awards;
	}
	public void display()
	{
		System.out.println("fullName   ---"+this.fullName);
		System.out.println("age   ---"+this.age);
		System.out.println("wifeName   ---"+this.wifeName);
		System.out.println("noOfChildrens   ---"+this.noOfChildrens);
		System.out.println("type --------------"+this.type);
		for (int i = 0; i < this.movieNames.length; i++) {
			String ref=this.movieNames[i];
			System.out.println(ref+"                                        movieNames ");
		}
		for (int i = 0; i < this.blockBasterMovies.length; i++) {
			String string = this.blockBasterMovies[i];
			System.out.println(string+"                          blockBasterMovies");
		}
		
		for (int i = 0; i < flopMovies.length; i++) {
			String string = flopMovies[i];
			System.out.println(string+"                          flopMovies");

			
		}
		
		for (int i = 0; i < movieCollections.length; i++) {
			int ref1= movieCollections[i];
			
					System.out.println(ref1+"                          movieCollections");
		}
		
		for (int i = 0; i < awards.length; i++) {
			String string = awards[i];
			System.out.println(string+"                         awards");

	}

	}


}
