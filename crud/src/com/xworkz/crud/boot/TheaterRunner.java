package com.xworkz.crud.boot;

import java.time.LocalDateTime;

import com.xworkz.crud.constant.Seats;
import com.xworkz.crud.dto.TheaterDto;
import com.xworkz.crud.exception.InvalidPropery;
import com.xworkz.crud.repository.TheaterRepo;
import com.xworkz.crud.repository.TheaterRepoImp;
import com.xworkz.crud.service.TheaterService;
import com.xworkz.crud.service.TheaterServiceImp;

public class TheaterRunner {

	public static void main(String[] args) throws InvalidPropery {
		TheaterDto dto = new TheaterDto(202231, "Navarang", "Nascs", Seats.BALKANI, "system", LocalDateTime.now(), null,
				null);
		TheaterDto dto1 = new TheaterDto(202235, "Vinayaka", "jhdshs", Seats.GOLD, "system", LocalDateTime.now(), null,
				null);
		TheaterDto dto3 = new TheaterDto(202218, "Swarga", "inox", Seats.DIMOND, "system", LocalDateTime.now(), null,
				null);
		System.out.println(dto);
		System.out.println(dto1);
		System.out.println(dto3);
		TheaterRepo repo = new TheaterRepoImp();

		TheaterService ser = new TheaterServiceImp(repo);

		try {
			boolean service = ser.validateAndSave(dto);
			System.out.println("Data is validated and stored--" + service);
		}
		catch (InvalidPropery e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("running in catch block");
		
		}
		finally {
			ser.toString();
		}

	}
}
