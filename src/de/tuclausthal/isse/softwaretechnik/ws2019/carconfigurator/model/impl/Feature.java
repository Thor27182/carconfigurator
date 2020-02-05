package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl;

//import java.util.ArrayList;

public class Feature {
	private String name;
	private int price;

	public Feature(String name1, int price1) {
		this.name = name1;
		this.price = price1;
	}
	
	public Feature(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}