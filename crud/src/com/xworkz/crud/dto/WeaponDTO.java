package com.xworkz.crud.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.crud.constant.Type;

public class WeaponDTO implements Serializable{

	private String name;
	private String madeby;
	private LocalDate madeOn;
	private int price;
	private Type type;

	public WeaponDTO() {
		// TODO Auto-generated constructor stub
	}

	public WeaponDTO(String name, String madeby, LocalDate madeOn, int price, Type type) {
		super();
		this.name = name;
		this.madeby = madeby;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeponDto [name=" + name + ", madeby=" + madeby + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 18;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof WeaponDTO)
			{
				WeaponDTO dto=(WeaponDTO)obj;
				if(name.equals(this.name))
				{
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeby() {
		return madeby;
	}

	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}
