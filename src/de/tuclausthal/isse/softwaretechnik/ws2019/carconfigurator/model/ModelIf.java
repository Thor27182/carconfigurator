package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model;

import java.util.ArrayList;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl.Car;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl.Feature;

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
public interface ModelIf extends ObservableIf{
	
	
	/**
	 * This method bring the input daten and save it {@link Customer}
	 * 
	 * @param name should be saved {@link Customer}
	 * @param creditCardNumber should be saved {@link Customer}
	 */
	public void setCustomerDaten(String name, String creditCardNumber);
	
	/**
	 * This method is used to fill this model with dummy values
	 */
	public void setupDummy();
	
	//setter and getter
	public void setIsRegistered(boolean isRegistered);
	
	public boolean getIsRegistered();
	
	public ArrayList<Car> getPreConfiguredCars();
	
	public void setConfiguredCarDaten(String carModel, String fuelType, int numOfDoors, String confiPackage, ArrayList<Feature> features);
	
	public Car getCar();
	
	public Feature getKlimaanlageFeature();
	
	public Feature getInfotainmentSystemFeature();
	
	public Feature getSitzheizungFeature();
	
	public Feature getHeizungFeature();
	
	

}
