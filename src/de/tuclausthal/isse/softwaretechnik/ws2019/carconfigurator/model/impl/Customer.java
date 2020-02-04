package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl;

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
