package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RegistrationUI extends JFrame {
	
	private JLabel titleLabel;
	private JPanel titlePanel;
	
	private JButton regButton;
	private JTextField nameTField;
	private JTextField CreditCardNumberTField;
	private JLabel nameLabel;
	private JLabel CreditCardNumberLabel;
	
	private JPanel buttonPanel;
	private JButton skipButton;
	
	private JPanel mainPanel;
	
	private ActionListener actionListener;
	
	public RegistrationUI(ActionListener actionListener) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.actionListener = actionListener;
		this.composeUI();
	}
	public RegistrationUI() {
		this.composeUI();
	}

	private void composeUI() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch(ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		this.titleLabel = new JLabel("Registrierung");
		this.titlePanel = new JPanel();
		this.titlePanel.add(this.titleLabel);
		
		this.mainPanel = new JPanel();
		this.mainPanel.setLayout(new GridLayout(3,2));
		
		this.nameTField = new JTextField(20);
		this.CreditCardNumberTField = new JTextField(30);
		this.nameLabel = new JLabel("Name");
		this.CreditCardNumberLabel = new JLabel("Kreditnummer");
		this.regButton = new JButton("registrieren");
		this.regButton.addActionListener(this.actionListener);
		this.mainPanel.add(this.nameLabel);
		this.mainPanel.add(this.nameTField);
		this.mainPanel.add(this.CreditCardNumberLabel);
		this.mainPanel.add(this.CreditCardNumberTField);
		this.mainPanel.add(this.regButton);
		
		
		this.buttonPanel = new JPanel();
		this.buttonPanel.setLayout(new BorderLayout());
		this.skipButton = new JButton("überspringen");
		this.skipButton.addActionListener(this.actionListener);
		this.buttonPanel.add(this.skipButton, BorderLayout.EAST);
		
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.getContentPane().add(this.titlePanel);
		this.getContentPane().add(this.mainPanel);
		this.getContentPane().add(this.buttonPanel);
		this.pack();
		
	}

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
