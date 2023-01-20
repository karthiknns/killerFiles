package com.xworkz.firstTime.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("softwareEngineerName")
	private String name;
	@Autowired
	@Qualifier("softwareEngineerSalery")
	private int salery;
	@Autowired
	@Qualifier("softwareEngineerCompany")
	private String companyName;
	@Autowired
	@Qualifier("softwareEngineerexp")
	private double experience;

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salery=" + salery + ", companyName=" + companyName
				+ ", experience=" + experience + "]";
	}
}
