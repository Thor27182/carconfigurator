package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.ObserverIf;

public interface ControllerIf extends ObserverIf {
	
	public void registrationButtonClicked();
	
	public void skipButtonClicked();
	
	public void im1CheckBoxSelected();
//	
//	public void im2CheckBoxSelected();
//	
//	public void im3CheckBoxSelected();
//	
//	public void im4CheckBoxSelected();
//	
//	public void im5CheckBoxSelected();
	
	public void orderButtonClicked();
}
