package com.xworkz.firstTime.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hardwareShop")
public class HardwareShop {
	@Autowired
	@Qualifier("shopid")
	private int id;
	@Autowired
	@Qualifier("shopname")
	private String name;
	@Autowired
	@Qualifier("shopOwnerGst")
	private String gstNo;
	@Autowired
	@Qualifier("shopOwnerName")
	private String ownerName;
	@Autowired
	@Qualifier("shopadress")
	private String address;

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}
	
	public String getAddress() {
		return address;
	}
	public String getGstNo() {
		return gstNo;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getOwnerName() {
		return ownerName;
	}

}
