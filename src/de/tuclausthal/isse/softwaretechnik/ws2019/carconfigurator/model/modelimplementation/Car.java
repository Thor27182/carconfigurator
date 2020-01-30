package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation;

import java.util.ArrayList;

public class Car {

    //<--- Fields --->
    private String model;
    private int generation;
    private Doors doors;
    private Fuel fuel;
    private ArrayList<Feature> features;
    private ArrayList<Configurationpackage> configurationpackages;

    //<--- Construtors --->
    public Car(String model, int generation, Doors doors, Fuel fuel, ArrayList<Feature> features, ArrayList<Configurationpackage> configurationpackages) {
        this.model = model;
        this.generation = generation;
        this.doors = doors;
        this.fuel = fuel;
        this.features = features;
        this.configurationpackages = configurationpackages;
    }

    //<--- Methodes --->
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public Doors getDoors() {
        return doors;
    }

    public void setDoors(Doors doors) {
        this.doors = doors;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public ArrayList<Configurationpackage> getConfigurationpackages() {
        return configurationpackages;
    }

    public void setConfigurationpackages(ArrayList<Configurationpackage> configurationpackages) {
        this.configurationpackages = configurationpackages;
    }
}
