package com.xworkz.secondTime.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	@Qualifier("paperid")
	private int id;
	@Autowired
	@Qualifier("paperlanguage")
	private String language;
	private String name;
	private String ownerName;

	private double price;

	

	@Autowired
	public NewsPaper(@Qualifier("papername") String name, @Qualifier("paperownerName") String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	public double getPrice() {
		return price;
	}

	@Autowired
	@Qualifier("paperprice")
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", language=" + language + ", name=" + name + ", ownerName=" + ownerName
				+ ", price=" + price + "]";
	}

}
