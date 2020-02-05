package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.ObserverIf;

public interface ControllerIf extends ObserverIf {
	
	public void registrationButtonClicked();
	
	public void skipButtonClicked();

	public void orderButtonClicked();
	
	public void configureButtonClicked();
	
	public void confiUIOrderButtonClicked();
	
	public void orderUIOrderButtonClicked();
	
	public void carConfiUIBackButtonClicked();
}
