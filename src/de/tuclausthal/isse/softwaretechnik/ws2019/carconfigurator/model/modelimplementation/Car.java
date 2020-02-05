package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation;

import java.util.ArrayList;

public class Car {

    //<--- Attibuts --->
    private String carmodel;
    private int generation;
    private Doors doors;
    private Fuel fuel;

    //<--- Associations --->
    private Model model;
    private ArrayList<Feature> features;
    private ArrayList<Configurationpackage> configurationpackages;
    private Customer customer;
    private Order order;

    //<--- Construtors --->
    public Car(String carmodel, int generation, Model model) {
        this.carmodel = carmodel;
        this.generation = generation;
        this.doors = null;
        this.fuel = null;
        this.model = model;
    }

    //<--- Getters and Setters --->
    public String getCarmodel() {
        return carmodel;
    }
    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
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
