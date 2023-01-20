package com.xworkz.crud.boot;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.crud.dto.PalaceDto;

public class PalaceRunner {

	public static void main(String[] args) {

		Collection<PalaceDto> palace = new LinkedList<PalaceDto>();

		palace.add(new PalaceDto("Mysore palace", "Mysore", "Raja", false, 50.0));
		palace.add(new PalaceDto("Benki Palace", "BTM", "Natraj", true, 500.0));
		palace.add(new PalaceDto("Bakery Palace", "Hassan", "Dharshan", false, 50000.0));
		palace.add(new PalaceDto("Nimans", "Banglore", "shubam", true, 100.0));

		palace.stream().forEach(dto -> System.out.println(dto));
		System.out.println("after destroying the palace");
		palace.stream().filter(e -> e.getDestroyed()).collect(Collectors.toList())
				.forEach(dto -> System.out.println(dto));

	}

}
