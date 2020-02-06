package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl;

/**
 * 
 * @author Yamen Sahyouni, ISSE, TU Clausthal
 * @author Thore Braun, ISSE, TU Clausthal
 * @author Mohamed Dawod, ISSE, TU Clausthal
 * @author Mohamad Deyaa Akil, ISSE, TU Clausthal
 * @author Oliver Greulich, ISSE, TU Clausthal
 * @author Bassel Rafie, ISSE, TU Clausthal
 * @author Amirreza Fahimifarimani, ISSE, TU Clausthal
 *
 */



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