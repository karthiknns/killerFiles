package com.xworkz.crud.boot;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.IplDto;
import com.xworkz.crud.repository.IplRepository;
import com.xworkz.crud.repository.IplRepositoryImplementation;

public class IplRunner {

	public static void main(String[] args) {
		IplRepository repository = new IplRepositoryImplementation();
		System.out.println(
				"-----------------------------------1-----------------------------------------------------------------------");

		IplDto rcb = new IplDto();
		rcb.setTeamName("RCB");
		rcb.setCaptanName("virat");
		rcb.setViceCaptan("karthik");
		rcb.setPurse(80);
		rcb.setWins(107);
		rcb.setDefeats(50);
		rcb.setCreatedDate(LocalDateTime.now());
		System.out.println(rcb.getCreatedDate());
		repository.create(rcb);
		System.out.println(
				"---------------------------------------2-------------------------------------------------------------------");

		IplDto punjab = new IplDto();
		punjab.setTeamName("PUNJAB");
		punjab.setCaptanName("Mayank Agarwal");
		punjab.setViceCaptan("Dhawan");
		punjab.setPurse(80);
		punjab.setWins(78);
		punjab.setDefeats(45);
		punjab.setCreatedDate(LocalDateTime.now());
		System.out.println(punjab.getCreatedDate());
		repository.create(punjab);
		System.out.println(
				"------------------------------------------3----------------------------------------------------------------");

		IplDto Kolkata = new IplDto();
		Kolkata.setTeamName("KKR");
		Kolkata.setCaptanName("Sherays Iyer");
		Kolkata.setViceCaptan("venkteshIyer");
		Kolkata.setPurse(78);
		Kolkata.setWins(95);
		Kolkata.setDefeats(40);
		Kolkata.setCreatedDate(LocalDateTime.now());
		System.out.println(Kolkata.getCreatedDate());
		repository.create(Kolkata);
		System.out.println(
				"------------------------------------------4----------------------------------------------------------------");

		IplDto delhi = new IplDto();
		delhi.setTeamName("DELHI");
		delhi.setCaptanName("RISHAB PHANTH");
		delhi.setViceCaptan("KS Bharath");
		delhi.setPurse(78);
		delhi.setWins(95);
		delhi.setDefeats(40);
		delhi.setCreatedDate(LocalDateTime.now());
		System.out.println(delhi.getCreatedDate());
		repository.create(delhi);
		System.out.println(
				"------------------------------------------5----------------------------------------------------------------");

		IplDto sunrises = new IplDto();
		sunrises.setTeamName("SRH");
		sunrises.setCaptanName("Kane Willimson");
		sunrises.setViceCaptan("Washington Sundher");
		sunrises.setPurse(80);
		sunrises.setWins(90);
		sunrises.setDefeats(70);
		sunrises.setCreatedDate(LocalDateTime.now());
		System.out.println(sunrises.getCreatedDate());
		repository.create(sunrises);
		System.out.println(
				"------------------------------------------6----------------------------------------------------------------");

		IplDto mumbai = new IplDto();
		mumbai.setTeamName("MI");
		mumbai.setCaptanName("Rohith");
		mumbai.setViceCaptan("Surya Kumar");
		mumbai.setPurse(78);
		mumbai.setWins(95);
		mumbai.setDefeats(40);
		mumbai.setCreatedDate(LocalDateTime.now());
		System.out.println(mumbai.getCreatedDate());
		repository.create(mumbai);
		System.out.println(
				"------------------------------------------7----------------------------------------------------------------");

		IplDto csk = new IplDto();
		csk.setTeamName("CSK");
		csk.setCaptanName("Dhoni");
		csk.setViceCaptan("Rayadu");
		csk.setPurse(80);
		csk.setWins(109);
		csk.setDefeats(50);
		csk.setCreatedDate(LocalDateTime.now());
		System.out.println(csk.getCreatedDate());
		repository.create(csk);
		System.out.println(
				"------------------------------------------8----------------------------------------------------------------");

		IplDto gujarat = new IplDto();
		gujarat.setTeamName("GUJARAT GAINTS");
		gujarat.setCaptanName("Rashid khan");
		gujarat.setViceCaptan("Miller");
		gujarat.setPurse(80);
		gujarat.setWins(95);
		gujarat.setDefeats(40);
		gujarat.setCreatedDate(LocalDateTime.now());
		System.out.println(delhi.getCreatedDate());
		repository.create(delhi);
		System.out.println(
				"------------------------------------------9----------------------------------------------------------------");

		IplDto Lucknow = new IplDto();
		Lucknow.setTeamName("LSG");
		Lucknow.setCaptanName("KL RAHUL");
		Lucknow.setViceCaptan("Manish Pandey");
		Lucknow.setPurse(78);
		Lucknow.setWins(95);
		Lucknow.setDefeats(40);
		Lucknow.setCreatedDate(LocalDateTime.now());
		System.out.println(Lucknow.getCreatedDate());
		repository.create(Lucknow);
		System.out.println(
				"------------------------------------------10----------------------------------------------------------------");

		IplDto RR = new IplDto();
		RR.setTeamName("RAJASTHAN ROYALS");
		RR.setCaptanName("Sanju Samson");
		RR.setViceCaptan("Buttler");
		RR.setPurse(78);
		RR.setWins(95);
		RR.setDefeats(40);
		RR.setCreatedDate(LocalDateTime.now());
		System.out.println(delhi.getCreatedDate());
		repository.create(delhi);
		System.out.println("------------------------------------------11----------------------------------------------------------------");
		
	
	repository.findTeamName("LSG");
	
	
	}
}