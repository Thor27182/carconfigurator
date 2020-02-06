package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.ObserverIf;
/**
 * This interface provides access to the Controller component
 * of our MVC implementation
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

public interface ControllerIf extends ObserverIf {
	
	
	/**
	 * This method should be called if someone hits "registrieren" button 
	 */
	public void registrationButtonClicked();
	
	/**
	 * This method should be called if someone hits "ueberspringen" button 
	 */
	public void skipButtonClicked();

	/**
	 * This method should be called if someone hits "bestellen" button 
	 */
	public void orderButtonClicked();
	
	/**
	 * This method should be called if someone hits "configurieren" button 
	 */
	public void configureButtonClicked();
	
	/**
	 * This method should be called if someone hits "bestaetigen" button 
	 */
	public void confiUIOrderButtonClicked();
	
	/**
	 * This method should be called if someone hits "Antrag abschicken" button 
	 */
	public void orderUIOrderButtonClicked();
	
	/**
	 * This method should be called if someone hits "zurueck" button 
	 */
	public void carConfiUIBackButtonClicked();
}
