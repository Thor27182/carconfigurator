package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl;

import java.util.ArrayList;

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

