package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model;

import java.util.ArrayList;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl.Car;

public interface ModelIf extends ObservableIf{

	public void setCustomerDaten(String name, String creditCardNumber);
	
	public void setIsRegistered(boolean isRegistered);
	
	public boolean getIsRegistered();
	
	public ArrayList<Car> getPreConfiguredCars();
	
	public void setupDummy();

}
