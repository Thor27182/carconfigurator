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

public class Order {
	private Car car;
	private Customer customer;
	
	public Order(Car car, Customer customer) {
		this.car = car;
		this.customer = customer;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
