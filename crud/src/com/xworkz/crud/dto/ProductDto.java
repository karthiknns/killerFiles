package com.xworkz.crud.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class ProductDto implements Serializable {

	private String name;
	private Double price;
	private LocalDate mafDate;
	private String shopName;

	public ProductDto() {
		// TODO Auto-generated constructor stub
	}

	public ProductDto(String name, Double price, LocalDate mafDate, String shopName) {
		super();
		this.name = name;
		this.price = price;
		this.mafDate = mafDate;
		this.shopName = shopName;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", mafDate=" + mafDate + ", shopName=" + shopName + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 18;
	}
	@Override
	public boolean equals(Object obj) {
	if(obj!=null) {
		if(obj instanceof ProductDto)
		{
			ProductDto dto=(ProductDto)obj;
			if(name.equals(this.name) ){
				System.out.println("true:  "+dto);
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getMafDate() {
		return mafDate;
	}

	public void setMafDate(LocalDate mafDate) {
		this.mafDate = mafDate;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
