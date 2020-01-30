package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl;

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
