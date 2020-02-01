package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RegistrationUI extends JFrame {
	
	private JLabel titleLabel;
	private JPanel titlePanel;
	
	private JButton regButton;
	private JTextField nameTField;
	private JTextField kreditNummerTField;
	private JLabel nameLabel;
	private JLabel kreditNummerLabel;
	
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
		this.titleLabel = new JLabel("Registrierung");
		this.titlePanel = new JPanel();
		this.titlePanel.add(this.titleLabel);
		
		this.mainPanel = new JPanel();
		this.mainPanel.setLayout(new GridLayout(3,2));
		
		this.nameTField = new JTextField(20);
		this.kreditNummerTField = new JTextField(30);
		this.nameLabel = new JLabel("Name");
		this.kreditNummerLabel = new JLabel("Kreditnummer");
		this.regButton = new JButton("registrieren");
		this.mainPanel.add(this.nameLabel);
		this.mainPanel.add(this.nameTField);
		this.mainPanel.add(this.kreditNummerLabel);
		this.mainPanel.add(this.kreditNummerTField);
		this.mainPanel.add(this.regButton);
		
		
		this.buttonPanel = new JPanel();
		this.buttonPanel.setLayout(new BorderLayout());
		this.skipButton = new JButton("überspringen");
		
		this.buttonPanel.add(this.skipButton, BorderLayout.EAST);
		
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.getContentPane().add(this.titlePanel);
		this.getContentPane().add(this.mainPanel);
		this.getContentPane().add(this.buttonPanel);
		this.pack();
		
	}
	public static void main(String[] args) {
		RegistrationUI regGUI = new RegistrationUI();
		regGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		regGUI.setVisible(true);
	}

	public JButton getRegButton() {
		return regButton;
	}
	public JButton getSkipButton() {
		return skipButton;
	}
	

}
