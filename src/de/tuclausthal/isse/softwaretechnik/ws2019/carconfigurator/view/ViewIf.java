package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view;

import java.awt.Component;
import java.util.ArrayList;

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

public interface ViewIf extends ObserverIf{
	
	/**
	 * This method is used to open / show the main UI
	 */
	public void showMainUI();
	
	/**
	 * Hide the main UI (for example after a successful registration, or after someone hit "ueberspringen"
	 */
	public void hideMainUI();
	
	/**
	 * This method is used to open / show the car list UI
	 */
	public void showCarListUI();
	
	/**
	 * This method is used to open / show the car configurator UI
	 */
	public void showCarConfiguratorUI();
	
	/**
	 * Hide the car list UI (for example after someone hits "configurieren"
	 */
	public void hideCarListUI();
	
	/**
	 * Hide the car configurator UI (for example after someone hits "bestaetigen", or after someone hit "zurueck"
	 */
	public void hideCarConfiguratorUI();
	
	/**
	 * Hide the order UI (for example after someone hit "Antrag abschicken"
	 */
	public void hideOrderUI();
	
	/**
	 * This method is used to open / show the orderUI when someone hits the "bestaetigen" button
	 *
	 * @param carModel The selected Car model 
	 * @param numOfDoors The selected number of doors
	 * @param fuealType The selected Fuel type
	 * @param confiPackage The selected Configuration package
	 * @param features The selected features
	 */
	public void showOrderUI(String carModel, int numOfDoors, String fuelType, String confiPackage, ArrayList<Feature> features);
	
	/**
	 * This method resets all the data in car configurator UI if someone hits "zurueck" button, or "Antrag abschicken"
	 */
	public void resetCarConfiUI();
	
	/**
	 * 
	 * @param parent The parent component (message will center itself within that)
	 * @param title The title to display
	 * @param message The actual message to display
	 */
	public void showMessage(Component parent, String title, String message);
	
	public void showRegistrationMessage(String message);
	
	public void showOrderMessage(String message);
	
	// setter and getter
	public String getName();
	
	public String getCreditCardNumber();
	
	public String getCheckBoxSelected();
	
	public String getSelectedFuelType();

	public String getSelectedModel();

	public String getSelectedConfiPackage();

	public String getSelectedNumberOfDoors();
	
	public boolean heizungFeatureSelected();
	
	public boolean sitzheizungFeatureSelected();
	
	public boolean klimaanlageFeatureSelected();
	
	public boolean infotainmentSystemFeatureSelected();

}
