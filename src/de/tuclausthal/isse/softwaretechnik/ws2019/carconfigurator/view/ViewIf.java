package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view;

import java.awt.Component;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl.CarListUI;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl.RegistrationUI;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl.ViewImpl;

public interface ViewIf extends ObserverIf{
	
	public void showMainUI();
	
	public void hideMainUI();
	
	public void showCarListUI();
	
	public void showCarConfiguratorUI();
	
	public void showMessage(Component parent, String title, String message);
	
	public void showRegistrationMessage(String message);
	
	public void showOrderUI();
	
	public void showOrderMessage();
	
	public String getName();
	public String getCreditCardNumber();
	public String getCheckBoxSelected();

}
