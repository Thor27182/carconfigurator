package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler.ControllerIf;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.ModelIf;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.ViewIf;

public class ViewImpl implements ViewIf, ActionListener{
	private ModelIf model;
	private ControllerIf controller;
	
	private RegistrationUI regUI;
	private CarListUI carListUI;
	private CarConfiguratorUI2 carConfUI;
	private OrderUI orderUI;
	
	private String name;
	private String creditCardNumber;
	private String checkBoxSelected;
	
	public ViewImpl(ControllerIf controller, ModelIf model) {
		if(model != null) {
			this.model = model;
			this.model.addObserver(this);
		}
		this.controller = controller;
		this.regUI = new RegistrationUI(this);
		this.carListUI = new CarListUI(this);
		this.orderUI = new OrderUI(this);
		this.carConfUI = new CarConfiguratorUI2(this);
		
	}
	@Override
	public void showMainUI() {
		this.regUI.setVisible(true);
	}
	@Override
	public void hideMainUI() {
		this.regUI.setVisible(false);
	}
	@Override
	public void showCarListUI() {
		this.carListUI.setVisible(true);
	}
	@Override
	public void showCarConfiguratorUI() {
//		this.carConfUI = new CarConfiguratorUI();
		this.carConfUI.getFrame().setVisible(true);
	}
	@Override
	public void showMessage(Component parent, String title, String message) {
		JOptionPane.showMessageDialog(parent, message, title, JOptionPane.INFORMATION_MESSAGE);
	}
	@Override
	public void showRegistrationMessage(String message) {
		this.showMessage(this.regUI, "Registration", message);
	}
	@Override
	public void showOrderUI(String message, String carModel, int numOfDoors, String fuelType, String confiPackage) {
		this.orderUI.getCarModelLabel().setText(carModel);
		this.orderUI.getFuelTypeLabel().setText(fuelType);
		this.orderUI.getNumberOfDoorsLabel().setText(Integer.toString(numOfDoors));
		this.orderUI.getConfigurationPackageLabel().setText(confiPackage);
		this.orderUI.doLayout();
		this.orderUI.setVisible(true);
	}
	@Override
	public void showOrderMessage(String message) {
		this.showMessage(this.carListUI, "Bestellung", message);
	}
	@Override
	public void update() {
		System.out.println("Update View");
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.regUI.getRegButton()) {
			this.controller.registrationButtonClicked();
		}else if(e.getSource() == this.regUI.getSkipButton()) {
			this.controller.skipButtonClicked();
		}else if(e.getSource() == this.carListUI.getOrderButton()) {
			this.controller.orderButtonClicked();
		}else if(e.getSource() == this.carListUI.getConfigureButton()) {
			this.controller.configureButtonClicked();
		}else if(e.getSource() == this.carConfUI.getBestellButton()) {
			this.controller.confiUIOrderButtonClicked();
		}else if(e.getSource() == this.orderUI.getOrderButton()) {
			this.controller.orderUIOrderButtonClicked();
		}
		
	}
	
	
	@Override
	public String getName() {
		if(this.regUI.getNameTField().toString() != null) {
			name = this.regUI.getNameTField().toString();
		}
		
		
		return name;
	}
	@Override
	public String getCreditCardNumber() {
		if(this.regUI.getCreditCardNumberTField().toString() != null) {
			creditCardNumber = this.regUI.getCreditCardNumberTField().toString();
		}
		return creditCardNumber;
	}
	@Override
	public String getCheckBoxSelected() {
		if (this.carListUI.getIm1ChBox().isSelected()) {
			this.checkBoxSelected = "BMW X5 3";
		}else if(this.carListUI.getIm2ChBox().isSelected()) {
			this.checkBoxSelected = "Audi R8 2";
		}else if(this.carListUI.getIm3ChBox().isSelected()) {
			this.checkBoxSelected = "Audi A4 4";
		}else if(this.carListUI.getIm4ChBox().isSelected()) {
			this.checkBoxSelected = "BMW X6 2";
		}else if(this.carListUI.getIm5ChBox().isSelected()) {
			this.checkBoxSelected = "VW Golf 2";
		}else {
			this.checkBoxSelected = null;
		}
		return this.checkBoxSelected;
	}

	@Override
	public void hideCarListUI() {
		this.carListUI.setVisible(false);
		
	}
	
	
	@Override
	public void hideCarConfiguratorUI() {
		this.carConfUI.getFrame().setVisible(false);
	}
	
	@Override
	public void hideOrderUI() {
		this.orderUI.setVisible(false);
	}
	@Override
	public String getSelectedFuelType() {
		return this.carConfUI.getCBKraftstoffSelItem().toString();
	}
	@Override
	public String getSelectedModel() {
		return this.carConfUI.getCBModelSelItem().toString();
	}
	@Override
	public String getSelectedFeature() {
		return this.carConfUI.getCBZusatzoptionenSelItem().toString();
	}
	@Override
	public String getSelectedConfiPackage() {
		return this.carConfUI.getCBPaketSelItem().toString();
	}
	@Override
	public String getSelectedNumberOfDoors() {
		return this.carConfUI.getCBDoorsSelItem().toString();
	}
	
}
