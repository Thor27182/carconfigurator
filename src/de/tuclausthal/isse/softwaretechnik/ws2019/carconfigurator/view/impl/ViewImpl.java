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
	private CarConfiguratorUI carConfUI;
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
		this.orderUI = new OrderUI();
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
	public void showOrderUI() {
		
	}
	@Override
	public void showOrderMessage() {
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
	
}
