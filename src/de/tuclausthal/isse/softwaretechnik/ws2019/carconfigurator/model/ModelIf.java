package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model;

import java.util.ArrayList;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl.Car;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl.Feature;

public interface ModelIf extends ObservableIf{

	public void setCustomerDaten(String name, String creditCardNumber);
	
	public void setIsRegistered(boolean isRegistered);
	
	public boolean getIsRegistered();
	
	public ArrayList<Car> getPreConfiguredCars();
	
	public void setConfiguredCarDaten(String carModel, String fuelType, int numOfDoors, String confiPackage, ArrayList<Feature> features);
	
	public Car getCar();
	
	public Feature getKlimaanlageFeature();
	
	public Feature getInfotainmentSystemFeature();
	
	public Feature getSitzheizungFeature();
	
	public Feature getHeizungFeature();
	
	public void setupDummy();

}
