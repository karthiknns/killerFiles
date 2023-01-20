package com.xworkz.crud.dto;

import java.nio.file.LinkOption;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.crud.constant.Type;

public class WeponDtoRunner {

	public static void main(String[] args) {

		Collection<WeaponDTO> col = new LinkedList<WeaponDTO>();
		col.add(new WeaponDTO("AKM", "India", LocalDate.of(1999, 04, 6), 20000, Type.ASSUALT_RIFLES));
		col.add(new WeaponDTO("M16A4", "Russia", LocalDate.of(1998, 02, 13), 3000, Type.ASSUALT_RIFLES));
		col.add(new WeaponDTO("M416", "USA", LocalDate.of(1968, 12, 23), 5000, Type.ASSUALT_RIFLES));
		col.add(new WeaponDTO("Groza", "UK", LocalDate.of(1966, 02, 12), 9000, Type.ASSUALT_RIFLES));
		col.add(new WeaponDTO("AUG A3", "India", LocalDate.of(1999, 10, 10), 3500, Type.ASSUALT_RIFLES));
		col.add(new WeaponDTO("Kar98", "Russia", LocalDate.of(1925, 02, 14), 9500, Type.SNIPER));
		col.add(new WeaponDTO("M24", "Japan", LocalDate.of(1963, 02, 19), 23000, Type.SNIPER));
		col.add(new WeaponDTO("AWM", "USA", LocalDate.of(1990, 12, 13), 25000, Type.SNIPER));
		col.add(new WeaponDTO("Win98", "India", LocalDate.of(1922, 2, 3), 1000, Type.SNIPER));
		col.add(new WeaponDTO("UZI", "Japan", LocalDate.of(1946, 02, 23), 12000, Type.SUB_MACHINE));
		col.add(new WeaponDTO("UMP45", "China", LocalDate.of(1938, 06, 21), 8000, Type.SUB_MACHINE));
		col.add(new WeaponDTO("Vector", "Russia", LocalDate.of(1899, 12, 10), 5000, Type.SUB_MACHINE));
		col.add(new WeaponDTO("Thompson", "Australia", LocalDate.of(1992, 12, 31), 3500, Type.SUB_MACHINE));
		col.add(new WeaponDTO("Bizon", "Japan", LocalDate.of(1934, 1, 10), 2000, Type.SUB_MACHINE));
		col.add(new WeaponDTO("S686", "India", LocalDate.of(1999, 12, 22), 6000, Type.SHOT_GUN));
		col.add(new WeaponDTO("S1897", "China", LocalDate.of(1899, 5, 15), 5800, Type.SHOT_GUN));
		col.add(new WeaponDTO("S12K", "Australia", LocalDate.of(1768, 3, 19), 4500, Type.SHOT_GUN));
		col.add(new WeaponDTO("DBS", "India", LocalDate.of(2000, 9, 28), 5000, Type.SHOT_GUN));
		col.add(new WeaponDTO("Skorpion", "India", LocalDate.of(1453, 2, 22), 1000, Type.PISTOOL));
		col.add(new WeaponDTO("Pan", "UK", LocalDate.of(2000, 12, 10), 1000, Type.MISSEL));

		System.out.println("printing all wepons");
		col.stream().forEach(e -> System.out.println(e));

		System.out.println("printing the price in greater-----------------------------------------------------");

		// Comparator<WeponDtoRunner> comp=((a,b)->Double.compare(b.getPrice(),
		// a.getPrice());

		col.stream().sorted((a, b) -> Double.compare(b.getPrice(), a.getPrice())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("PRINT MADEBY AND MADEON--------------------------------");

		col.stream().sorted((a, b) -> a.getMadeby().compareTo(b.getMadeby()))
				.sorted((c, d) -> c.getMadeOn().compareTo(d.getMadeOn())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("PRINT NAME IN DESENDING ORDER-----------------------------");

		col.stream().sorted((a, b) -> b.getName().compareTo(a.getName())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("PRINT madeon IN DESENDING ORDER-----------------------------");

		col.stream().sorted((a, b) -> a.getMadeOn().compareTo(b.getMadeOn())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("PRINT MABEBY IN DESENDING ORDER-----------------------------");

		col.stream().sorted((a, b) -> a.getMadeby().compareTo(b.getMadeby())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("sort by PRice-----in assendingorder--------------------");

		col.stream().sorted((a, b) -> Double.compare(a.getPrice(), b.getPrice())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("sort by PRice-----in desendingorder--------------------");

		col.stream().sorted((a, b) -> Double.compare(b.getPrice(), a.getPrice())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("sort by NAME AND MADEON-------------------");
		col.stream().sorted((a, b) -> a.getName().compareTo(b.getName()))
				.sorted((c, d) -> c.getMadeOn().compareTo(d.getMadeOn())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("Sort BY TYTE,MADEBY,name----------------------------------");
		col.stream().sorted((a1, a2) -> a2.getType().compareTo(a1.getType()))
				.sorted((a1, a2) -> a2.getMadeby().compareTo(a1.getMadeby()))
				.sorted((a1, a2) -> a2.getName().compareTo(a1.getName())).forEach(ele -> System.out.println(ele));

	}

}
