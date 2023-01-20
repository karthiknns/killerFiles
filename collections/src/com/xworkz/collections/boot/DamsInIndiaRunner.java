package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class DamsInIndiaRunner {

	public static void main(String[] args) {
		LinkedList<String >  kdams=new LinkedList<String>();
		
		kdams.add("KRS");
		kdams.add("vaani vilasa sagara");
		kdams.add("aalamatti");
		kdams.add("TB dam");
		kdams.add("harangi dam");
		kdams.add("lingana makki dam");
		kdams.add("Kadra dam");
		kdams.add("sharavathi");
	System.out.println("------");
		System.out.println(kdams);
		Collection<String >  rDams=new ArrayList<String>();
		rDams.add("mashi dam");
		rDams.add("shiva dam");
		rDams.add("ram dam");
		rDams.add("pink dam");
		rDams.add("joshi dam");
		System.out.println(kdams.equals(rDams));
		
	
		Collection<String > adams=new ArrayList<String>();
		
		adams.add("polavaram");
		adams.add("nagarjun sagar");
		adams.add("chitravathi");
		adams.add("dharmavaram");
		adams.add("comburn");
		adams.add("donkari");
		adams.add("kalyaani dam");
		adams.add("krishana puram");
		adams.add("kumili");
		adams.add("madakasira");
		adams.add("marala dam");
		adams.add("NTR dam");
		System.out.println("*****************"+kdams.addAll(adams));
		System.out.println("total "+kdams.removeIf(e->kdams.equals("KRS")));
		Collection<String > tdams=new ArrayList<String>();
		tdams.add(" metturu");
		tdams.add(" Pliyar");
		tdams.add(" amaravathi");
		tdams.add(" barur");
		tdams.add(" berijam");
		tdams.add(" chinnar");
		
		
		Collection<String > kedams=new ArrayList<String>();
		kedams.add("mangalam");
		kedams.add("malampuza");
		kedams.add("meenkara");
		kedams.add("idukki");
		kedams.add("kollam");
		kedams.add("palakkad");
		kedams.add("kannur");
		kedams.add("Thisuuru");
		kedams.add("TENET");
		kedams.add("pambaa");
		
		
		Collection<String > indDams=new ArrayList<String>();
		indDams.addAll(kedams);
		indDams.addAll(tdams);                     // adding different collection in to one collection // we use add method to add the collection in a collection
		indDams.addAll(adams);
		indDams.addAll(kdams);
		indDams.addAll(rDams);
		
		System.out.println(indDams.size());
		
		
		Iterator<String> itr=indDams.iterator();
		
		while(itr.hasNext())
		{    
			String rev="";
			String ref=itr.next();
			if(ref.startsWith("T"))
			{
				System.out.println("starts with T :"+ref);
			}
			
			if(ref.endsWith("ra"))
			{
				System.out.println("ends with ra  :"+ref);
			}
			
			if(ref.length()>15)
			{
				System.out.println("over 15 char  "+ref);
			}
			
			System.out.println(ref.toUpperCase());	
			System.out.println(ref.toLowerCase());
			
			
			int length=ref.length();
			for (String string : indDams) {
				
				if(string=="P")
				{
					indDams.remove(string);
					System.out.println("dams r :"+string);
				}
			}
			
			for(int i=length-1;i>=0;i--)
			{
				rev=rev+ref.charAt(i);
			}
			if(rev.equals(ref))
			{
		System.out.println("palindrom  "+rev);
		}

		
		
		}
		
	
		System.out.println(indDams.size());
		
		Iterator<String> itr1=kdams.iterator();
		
	Iterable<String> itr2;
	

	}

}
