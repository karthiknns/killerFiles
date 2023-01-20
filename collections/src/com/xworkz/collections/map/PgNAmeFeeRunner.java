package com.xworkz.collections.map;

import java.awt.List;
import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;/*
						import java.util.Map.Entry;*/
import java.util.TreeMap;

public class PgNAmeFeeRunner {

	public static void main(String[] args) {
		Map<String, Double> map = new TreeMap<String, Double>();
		map.put("Shubam Girls Pg", 70000D);
		map.put("Akshay Colive", 10000D);
		map.put("Dharshan Girls pg", 70000D);
		map.put("Kushi pg", 65000D);
		map.put("Ravi Girls Pg", 7500D);

//		System.out.println(map.size());// to get the size
//		boolean ref = map.isEmpty();
//		System.out.println(ref);
//		Set<String> set = map.keySet();
//		System.out.println(set);
//		Collection<Double> col = map.values();
//		System.out.println(col);
//
//		Set<Entry<String,Double>> pair=map.entrySet();
//		
		
	//map.forEach((key,value)->{ if(value>=7000D) {System.out.println(key.toUpperCase()+":"+value);}});

	

	
	
	map.forEach((a,b)->{if(a.length()>12) {
		map.replace(a,45D);
		System.out.println(a  + "  "+b);
	}
	});
	}

}
