package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RegistrationUI extends JFrame {

	//<--- Attributes --->
	private JButton regButton;
	private JButton skipButton;

	private JTextField nameTField;
	private JTextField CreditCardNumberTField;

	private ActionListener actionListener;

	//<--- Constructor --->
	public RegistrationUI(ActionListener actionListener) {
		super("Registrierung");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.actionListener = actionListener;
		this.composeUI();
	}

	//<--- Methodes --->
	private void composeUI() {
		//Panel for holding UI-Elements
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3,2));

		//Create UI-Elemets Textframes
		this.nameTField = new JTextField(20);
		this.CreditCardNumberTField = new JTextField(30);

		//Create UI Elements Labels for Description
		JLabel nameLabel = new JLabel("Name");
		JLabel creditCardNumberLabel = new JLabel("Kreditnummer");

		//Create UI-Element Button
		this.regButton = new JButton("registrieren");
		this.regButton.addActionListener(this.actionListener);
		this.skipButton = new JButton("Ueberspringen");
		this.skipButton.addActionListener(this.actionListener);

		//Add UI-Elements to Panel
		mainPanel.add(nameLabel);
		mainPanel.add(this.nameTField);
		mainPanel.add(creditCardNumberLabel);
		mainPanel.add(this.CreditCardNumberTField);
		mainPanel.add(this.skipButton);
		mainPanel.add(this.regButton);

		this.getContentPane().add(mainPanel);
		this.pack();
		
	}


	//<--- Getter and Setter --->
	public JButton getRegButton() {
		return regButton;
	}

	public JButton getSkipButton() {
		return skipButton;
	}

	public String getNameTField() {
		return nameTField.getText();
	}

	public String getCreditCardNumberTField() {
		return CreditCardNumberTField.getText();
	}
}
