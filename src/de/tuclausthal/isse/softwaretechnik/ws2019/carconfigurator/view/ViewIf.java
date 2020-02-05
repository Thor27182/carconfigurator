package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view;

import java.awt.Component;
import java.util.ArrayList;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl.Feature;

public interface ViewIf extends ObserverIf{
	
	public void showMainUI();
	
	public void hideMainUI();
	
	public void showCarListUI();
	
	public void showCarConfiguratorUI();
	
	public void showMessage(Component parent, String title, String message);
	
	public void showRegistrationMessage(String message);
	
	public void showOrderUI(String message, String carModel, int numOfDoors, String fuelType, String confiPackage, ArrayList<Feature> features);
	
	public void showOrderMessage(String message);
	
	public void hideCarListUI();
	
	public void hideCarConfiguratorUI();
	
	public void hideOrderUI();
	
	public String getName();
	
	public String getCreditCardNumber();
	
	public String getCheckBoxSelected();
	
	public String getSelectedFuelType();

	public String getSelectedModel();

	public String getSelectedConfiPackage();

	public String getSelectedNumberOfDoors();
	
	public void resetCarConfiUI();
	
	public boolean heizungFeatureSelected();
	
	public boolean sitzheizungFeatureSelected();
	
	public boolean klimaanlageFeatureSelected();
	
	public boolean infotainmentSystemFeatureSelected();

}
