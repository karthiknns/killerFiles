package com.xworkz.encapulation.things;   // restricting the direct acess and acess is only done by methods called encaptulation

public class Movie {
private String name;
private String heroName;
private String heroineName;
    int budget;
    int collection;
    String language;
  public static String hen;
  public   Movie( String hen){
	  this.hen=hen;
  }
    public void setValue(String name,String heroineName,String heroName)
    {
    	this.name=name;
    	this.heroineName=heroineName;
    	this.heroName=heroName;
    	}
    public void getValue()
    {
    	System.out.println("enterd name is    "+name);
    	System.out.println("enterd heroName is    "+heroName);
    	System.out.println("enterd heroineName is    "+heroineName);
    }
    public void display()
    {
    	getValue();
    	System.out.println("budget of the movie is   "+budget);
    	System.out.println("collection of movie is  "+collection);
    	System.out.println("movie language is   "+language);
    }
}
