package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class MaxMinRunner {

	public static void main(String[] args) {
		
		Collection<Integer> col=new ArrayList<Integer>();
		
		
		col.add(45);
		col.add(333);
		col.add(76);
		col.add(29);
		col.add(900);
		col.add(23);
		col.add(474);
		col.add(654);
		col.add(29);
		col.add(454);
		System.out.println(col);
		
		System.out.println("max- "+Collections.max(col));
		System.out.println("min- "+Collections.min(col));
		
		


	}

}
