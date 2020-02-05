package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler.impl;

import java.util.ArrayList;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler.*;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.ModelIf;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl.Feature;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl.ModelImpl;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.ViewIf;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl.ViewImpl;

public class ControllerImpl implements ControllerIf {
	
	private ModelIf model;
	private ViewIf view;
	
	private String currentlySelectedCar;
	private String currCarModel;
	private int currNumOfDoors;
	private String currFuelType;
	private String currConfiPackage;
	private ArrayList<Feature> currFeatures;
	
	
	public ControllerImpl() {
		//set up the model
		this.model= new ModelImpl();
		this.model.setupDummy();
		this.model.addObserver(this);
		
		//initialize and show main UI
		this.view = new ViewImpl(this, this.model);
		this.view.showMainUI();
		
		//after everything was initialized, update the observers
		this.model.notifyObserver();
	}

	@Override
	public void update() {
		System.out.println("Update Controller");
	}

	public String getCurrentlySelectedCar() {
		return currentlySelectedCar;
	}

	@Override
	public void registrationButtonClicked() {
		
		if(!this.view.getName().isEmpty() && !this.view.getCreditCardNumber().isEmpty()) {
			try {
				long creditNumber = Long.parseLong(this.view.getCreditCardNumber());
				this.model.setIsRegistered(true);
				this.model.setCustomerDaten(this.view.getName().toString(), this.view.getCreditCardNumber().toString());
				this.view.showRegistrationMessage(this.view.getName().toString() +  " erfolgreich registriert!");
				this.view.showCarListUI();
				this.view.hideMainUI();
			}catch(Exception e) {
				this.view.showRegistrationMessage("Kreditkartenummer muss nur Zahlen enthalten");
			}
			
		}else {
			this.view.showRegistrationMessage("Name und Kreditkartenummer soll eingegeben wird!");
		}
	}

	@Override
	public void skipButtonClicked() {
		this.view.hideMainUI();
		this.view.showCarListUI();
	}

	@Override
	public void orderButtonClicked() {
		if(this.view.getCheckBoxSelected() != null) {
				this.currentlySelectedCar = this.view.getCheckBoxSelected();
			}else if(this.view.getCheckBoxSelected() == null) {
				this.view.showOrderMessage("Auto muss ausgewählt werden!");
			}
		
			if(this.currentlySelectedCar == "BMW X5 3") {
				this.view.showOrderMessage(this.model.getPreConfiguredCars().get(0).getCarModel() +" " +this.model.getPreConfiguredCars().get(0).getCarGeneration() 
											+ " erfolgreich bestellt");
			}else if(this.currentlySelectedCar == "BMW X6 2") {
				this.view.showOrderMessage(this.model.getPreConfiguredCars().get(1).getCarModel() +" " +this.model.getPreConfiguredCars().get(1).getCarGeneration() 
											+ " erfolgreich bestellt");
			}else if(this.currentlySelectedCar == "Audi R8 2") {
				this.view.showOrderMessage(this.model.getPreConfiguredCars().get(3).getCarModel() +" " +this.model.getPreConfiguredCars().get(3).getCarGeneration() 
											+ " erfolgreich bestellt");
			}else if(this.currentlySelectedCar =="Audi A4 4") {
				this.view.showOrderMessage(this.model.getPreConfiguredCars().get(2).getCarModel() +" " +this.model.getPreConfiguredCars().get(2).getCarGeneration() 
											+ " erfolgreich bestellt");
			}else if(this.currentlySelectedCar == "VW Golf 2") {
				this.view.showOrderMessage(this.model.getPreConfiguredCars().get(4).getCarModel() +" " +this.model.getPreConfiguredCars().get(4).getCarGeneration() 
											+ " erfolgreich bestellt");
			}
			this.currentlySelectedCar = null;
	}

	@Override
	public void configureButtonClicked() {
		if(this.model.getIsRegistered() == false) {
			this.view.showRegistrationMessage("Sie müssen registriert sein!");
			this.view.showMainUI();
			this.view.hideCarListUI();
		}else if(this.model.getIsRegistered() == true) {
			this.view.hideCarListUI();
			this.view.showCarConfiguratorUI();
		}
	}
	
	@Override
	public void confiUIOrderButtonClicked() {
			
			this.currFeatures = new ArrayList<Feature>();
			this.currCarModel = this.view.getSelectedModel();
			this.currFuelType = this.view.getSelectedFuelType();
			this.currConfiPackage = this.view.getSelectedConfiPackage();
			try {
			this.currNumOfDoors = Integer.parseInt(this.view.getSelectedNumberOfDoors());
			}catch(Exception e){
			}
			
			if((this.currCarModel != "- none -" && (this.currNumOfDoors == 3 || this.currNumOfDoors == 5) && this.currFuelType !="- none -")
					&& (this.view.klimaanlageFeatureSelected() == true && this.view.infotainmentSystemFeatureSelected() == false)) {
				this.view.showOrderMessage("Infotainment-System muss auch mit Klimaanlage ausgewählt wird");
			}else if((this.currCarModel != "- none -" && (this.currNumOfDoors == 3 || this.currNumOfDoors == 5) && this.currFuelType !="- none -")
					&& (this.view.klimaanlageFeatureSelected() == false && this.view.infotainmentSystemFeatureSelected() == true)) {
				this.view.showOrderMessage("Klimaanlage muss auch mit Infotainment-System ausgewählt wird");
			}else if((this.currCarModel != "- none -" && (this.currNumOfDoors == 3 || this.currNumOfDoors == 5) && this.currFuelType !="- none -")
					&& (this.view.klimaanlageFeatureSelected() == false && this.view.infotainmentSystemFeatureSelected() == false)) {
				
					if(this.view.heizungFeatureSelected() == true) {
						this.currFeatures.add(this.model.getHeizungFeature());
					}else if(this.view.sitzheizungFeatureSelected()) {
						this.currFeatures.add(this.model.getSitzheizungFeature());
					}
				this.model.setConfiguredCarDaten(this.currCarModel, this.currFuelType, this.currNumOfDoors, this.currConfiPackage, this.currFeatures);
				this.view.showOrderUI("Antrag wurde angelegt", currCarModel, currNumOfDoors, currFuelType, currConfiPackage, this.currFeatures);
				
			}else if((this.currCarModel != "- none -" && (this.currNumOfDoors == 3 || this.currNumOfDoors == 5) && this.currFuelType !="- none -")
					&& (this.view.klimaanlageFeatureSelected() == true && this.view.infotainmentSystemFeatureSelected() == true)) {
					if(this.view.heizungFeatureSelected() == true) {
						this.currFeatures.add(this.model.getHeizungFeature());
						this.currFeatures.add(this.model.getInfotainmentSystemFeature());
						this.currFeatures.add(this.model.getKlimaanlageFeature());
					}else if(this.view.sitzheizungFeatureSelected()== true) {
						this.currFeatures.add(this.model.getSitzheizungFeature());
						this.currFeatures.add(this.model.getInfotainmentSystemFeature());
						this.currFeatures.add(this.model.getKlimaanlageFeature());
					}else {
						this.currFeatures.add(this.model.getKlimaanlageFeature());
						this.currFeatures.add(this.model.getInfotainmentSystemFeature());
					}
					this.model.setConfiguredCarDaten(this.currCarModel, this.currFuelType, this.currNumOfDoors, this.currConfiPackage, this.currFeatures);
					this.view.showOrderUI("Antrag wurde angelegt", currCarModel, currNumOfDoors, currFuelType, currConfiPackage, this.currFeatures);

			}else if((this.currCarModel != "- none -" && (this.currNumOfDoors != 3 || this.currNumOfDoors != 5) && (this.currFuelType !="- none -" 
					|| this.currFuelType == "- none -"))){
				this.view.showOrderMessage("Automodell, Türen und Kraftstoff muss ausgewählt werden");
			}
	}

	@Override
	public void orderUIOrderButtonClicked() {
		this.view.showOrderMessage("Ihr Antrag wurde erfolgreich abgeschickt");
		this.view.hideOrderUI();
		this.view.hideCarConfiguratorUI();
		this.view.showCarListUI();
		this.view.resetCarConfiUI();
	}

	@Override
	public void carConfiUIBackButtonClicked() {
		this.view.hideCarConfiguratorUI();
		this.view.showCarListUI();
		this.view.resetCarConfiUI();
	}
}
