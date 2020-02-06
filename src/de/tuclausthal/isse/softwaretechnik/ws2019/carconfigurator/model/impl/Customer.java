package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl;

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

public class Customer {
	private String CreditCardNumber;
	private String name;
	
	public String getKreditNummer() {
		return CreditCardNumber;
	}
	public void setCreditCardNumber(String kreditNummer) {
		this.CreditCardNumber = kreditNummer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
