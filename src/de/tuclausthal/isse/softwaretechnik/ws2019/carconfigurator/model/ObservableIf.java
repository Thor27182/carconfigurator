package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model;
/**
 * 
 */


import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.ObserverIf;

/**
 * @author Dirk Herrling, ISSE, TU Clausthal
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

