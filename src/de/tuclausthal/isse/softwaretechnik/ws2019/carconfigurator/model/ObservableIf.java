package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model;
/**
 * 
 */


import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.ObserverIf;

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
public interface ObservableIf {
	
	/**
	 * 
	 * @param observer the observer to add
	 */
	public void addObserver(ObserverIf observer);
	
	
	/**
	 * 
	 * @param observer the observer to remove
	 */
	public void removeObserver(ObserverIf observer);
	
	
	/**
	 * Notify all observer that the Observable changed 
	 */
	public void notifyObserver();

}

