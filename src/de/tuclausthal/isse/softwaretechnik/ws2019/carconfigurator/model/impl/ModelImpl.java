package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl;

import java.util.ArrayList;
import java.util.Vector;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.ModelIf;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.ObserverIf;

public class ModelImpl implements ModelIf {
	
	private Customer customer;
	private boolean isRegisterd;
	public Customer getCustomer() {
		return customer;
	}
	

	private ArrayList<Car> preConfiguredCars;
	
	private Vector<ObserverIf> observers;
	
	public ModelImpl() {
		this.observers = new Vector<>();
		this.customer = new Customer();
		this.preConfiguredCars = new ArrayList<>();
		this.isRegisterd = false;
	}
	@Override
	public void addObserver(ObserverIf observer) {
		if (observer != null) {
			this.observers.add(observer);
		} else {
			System.err.println("Tried to add an observer that was null");
		}
		
	}

	@Override
	public void removeObserver(ObserverIf observer) {
		if (observer != null) {
			this.observers.remove(observer);
		} else {
			System.err.println("Tried to remove an observer that was null");
		}
		
	}

	@Override
	public void notifyObserver() {
		for (ObserverIf obs : this.observers) {
			obs.update();
		}
	}
	
	@Override
	public ArrayList<Car> getPreConfiguredCars() {
		return preConfiguredCars;
	}
		
	@Override
	public void setCustomerDaten(String name, String creditCardNumber) {
		this.customer = new Customer();
		this.customer.setName(name);
		this.customer.setCreditCardNumber(creditCardNumber);
		this.notifyObserver();
		
	}
	@Override
	public boolean getIsRegistered() {
		return this.isRegisterd;
	}
	@Override
	public void setIsRegistered(boolean isRegistered) {
		this.isRegisterd = isRegistered;
		this.notifyObserver();
	}
	@Override
	public void setupDummy() {
		Customer customer = new Customer();
		
		Car bmw_X5_3 = new Car("BMW X5", 3);
		Car bmw_X6_2 = new Car("BMW X6", 2);
		Car audi_A4_4 = new Car("Audi A4", 4);
		Car audi_R8_2 = new Car("Audi R8", 2);
		Car vw_Golf_2 = new Car("VW Golf", 2);
		
		
		preConfiguredCars.add(bmw_X5_3);
		preConfiguredCars.add(bmw_X6_2);
		preConfiguredCars.add(audi_A4_4);
		preConfiguredCars.add(audi_R8_2);
		preConfiguredCars.add(vw_Golf_2);
		
	}

}
