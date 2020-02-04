package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler.impl;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler.*;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.ModelIf;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.impl.ModelImpl;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.ViewIf;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl.ViewImpl;

public class ControllerImpl implements ControllerIf {
	
	private ModelIf model;
	private ViewIf view;
	
	private String currentlySelectedCar;
	
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
			this.model.setIsRegistered(true);
			this.model.setCustomerDaten(this.view.getName().toString(), this.view.getCreditCardNumber().toString());
			this.view.showRegistrationMessage(this.view.getName().toString() +  " erfolgreich registriert!");
			this.view.showCarListUI();
			this.view.hideMainUI();
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
	public void im1CheckBoxSelected() {
		if(this.view.getCheckBoxSelected() != null) {
			if(this.view.getCheckBoxSelected() == "BMW X5 3") {
				this.currentlySelectedCar = this.view.getCheckBoxSelected();
			}else {
				
			}
		}
	}
//
//	@Override
//	public void im2CheckBoxSelected() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void im3CheckBoxSelected() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void im4CheckBoxSelected() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void im5CheckBoxSelected() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void orderButtonClicked() {
		this.im1CheckBoxSelected();
		if(this.currentlySelectedCar != null) {
			if(this.currentlySelectedCar == "BMW X5 3") {

			}
		}
		
	}


	

}
