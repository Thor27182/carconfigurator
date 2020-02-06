package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl;

import java.util.ArrayList;
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
public class Car {
	private Doors doorNumber;
	private Fuel fuelTyp;
	private String carModel;
	private int carGeneration;
	private ArrayList<Feature> features;
	private Configurationpackage configurationpackage;
	
	public Car(String carModel, int carGeneration) {
		this.carModel = carModel;
		this.carGeneration = carGeneration;
	}
	public Car() {
		this.configurationpackage = new Configurationpackage();
		this.features = new ArrayList<Feature>();
	}
	
	public Doors getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(Doors doorNumber) {
		this.doorNumber = doorNumber;
	}
	public Fuel getFuelTyp() {
		return fuelTyp;
	}
	public void setFuelTyp(Fuel fuelTyp) {
		this.fuelTyp = fuelTyp;
	}
	
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public ArrayList<Feature> getFeatures() {
		return features;
	}
	public void setFeatures(ArrayList<Feature> features) {
		this.features = features;
	}
	public Configurationpackage getConfigurationpackage() {
		return configurationpackage;
	}
	public void setConfigurationpackage(String configurationpackage) {
		this.configurationpackage.setName(configurationpackage);
	}

	public int getCarGeneration() {
		return carGeneration;
	}

	public void setCarGeneration(int carGeneration) {
		this.carGeneration = carGeneration;
	}
	
}

