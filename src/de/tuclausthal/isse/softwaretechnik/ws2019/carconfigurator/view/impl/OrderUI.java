package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OrderUI extends JFrame {
	
	private JLabel titleLabel;
	private JPanel titlePanel;
	
	private JPanel mainPanel;
	
	private JLabel carModelTitleLabel;
	private JLabel carModelLabel;
	private JPanel carModelPanel;
	private JLabel numberOfDoorsTitleLabel;
	private JLabel numberOfDoorsLabel;
	private JPanel numberOfDoorsPanel;
	private JLabel fuelTypeTitleLabel;
	private JLabel fuelTypeLabel;
	private JPanel fuelTypePanel;
	private JLabel featureTitleLabel;
	private JLabel featureLabel;
	private JPanel featurePanel;
	private JLabel configurationPackageTitleLabel;
	private JLabel configurationPackageLabel;
	private JPanel configurationPackagePanel;
	
	private JButton orderButton;
	private JPanel buttonPanel;
	
	private String selectedCarModel;
	private String selectedNumberOfDoors;
	private String selectedFeulType;
	private String selectedFeature;
	private String selectedConfigurationPackage;
	
	private ActionListener actionListener;
	
	public OrderUI(ActionListener actionListener) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.actionListener = actionListener;
		this.composeUI();
	}
	public OrderUI() {
		this.composeUI();
	}
	
	public void composeUI() {
		this.titleLabel = new JLabel("Bestellungsantrag");
		this.titlePanel = new JPanel();
		this.titlePanel.add(titleLabel);
		
		this.mainPanel = new JPanel();
		this.mainPanel.setLayout(new BoxLayout(this.mainPanel, BoxLayout.Y_AXIS));
		
		this.carModelTitleLabel = new JLabel("Automodell: ");
		this.carModelLabel = new JLabel("Automodell");
		this.carModelPanel = new JPanel(new BorderLayout());
		this.carModelPanel.add(this.carModelTitleLabel, BorderLayout.WEST);
		this.carModelPanel.add(this.carModelLabel, BorderLayout.CENTER);
		
		this.numberOfDoorsTitleLabel = new JLabel("Türen: ");
		this.numberOfDoorsLabel = new JLabel("3");
		this.numberOfDoorsPanel = new JPanel(new BorderLayout());
		this.numberOfDoorsPanel.add(this.numberOfDoorsTitleLabel, BorderLayout.WEST);
		this.numberOfDoorsPanel.add(this.numberOfDoorsLabel, BorderLayout.CENTER);
		
		this.fuelTypeTitleLabel = new JLabel("Kraftstoff: ");
		this.fuelTypeLabel = new JLabel("Benzin");
		this.fuelTypePanel = new JPanel(new BorderLayout());
		this.fuelTypePanel.add(this.fuelTypeTitleLabel, BorderLayout.WEST);
		this.fuelTypePanel.add(this.fuelTypeLabel, BorderLayout.CENTER);
		
		this.featureTitleLabel = new JLabel("Zusatzoption: ");
		this.featureLabel = new JLabel("- none -");
		this.featurePanel = new JPanel(new BorderLayout());
		this.featurePanel.add(this.featureTitleLabel, BorderLayout.WEST);
		this.featurePanel.add(this.featureLabel, BorderLayout.CENTER);
		
		this.configurationPackageTitleLabel = new JLabel("Ausstattungspaket: ");
		this.configurationPackageLabel = new JLabel("Sport-Paket");
		this.configurationPackagePanel = new JPanel(new BorderLayout());
		this.configurationPackagePanel.add(this.configurationPackageTitleLabel, BorderLayout.WEST);
		this.configurationPackagePanel.add(this.configurationPackageLabel, BorderLayout.CENTER);
		
		this.mainPanel.add(this.carModelPanel);
		this.mainPanel.add(this.numberOfDoorsPanel);
		this.mainPanel.add(this.fuelTypePanel);
		this.mainPanel.add(this.featurePanel);
		this.mainPanel.add(this.configurationPackagePanel);
		
		this.buttonPanel = new JPanel();
		this.buttonPanel.setLayout(new BorderLayout());
		this.orderButton = new JButton("Antrag abschicken");
		this.orderButton.addActionListener(this.actionListener);
		this.buttonPanel.add(this.orderButton, BorderLayout.EAST);
		
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.getContentPane().add(this.titlePanel);
		this.getContentPane().add(this.mainPanel);
		this.getContentPane().add(this.buttonPanel);
		this.pack();
		this.setSize(1000, 500);
	
	
	}
	public JLabel getCarModelLabel() {
		return carModelLabel;
	}
	public JLabel getNumberOfDoorsLabel() {
		return numberOfDoorsLabel;
	}
	public JLabel getFuelTypeLabel() {
		return fuelTypeLabel;
	}
	public JLabel getFeatureLabel() {
		return featureLabel;
	}
	public JLabel getConfigurationPackageLabel() {
		return configurationPackageLabel;
	}
	public JButton getOrderButton() {
		return orderButton;
	}
	public String getSelectedCarModel() {
		return selectedCarModel;
	}
	public String getSelectedNumberOfDoors() {
		return selectedNumberOfDoors;
	}
	public String getSelectedFeulType() {
		return selectedFeulType;
	}
	public String getSelectedFeature() {
		return selectedFeature;
	}
	public String getSelectedConfigurationPackage() {
		return selectedConfigurationPackage;
	}
	public void setSelectedCarModel(String selectedCarModel) {
		this.selectedCarModel = selectedCarModel;
	}
	public void setSelectedNumberOfDoors(String selectedNumberOfDoors) {
		this.selectedNumberOfDoors = selectedNumberOfDoors;
	}
	public void setSelectedFeulType(String selectedFeulType) {
		this.selectedFeulType = selectedFeulType;
	}
	public void setSelectedFeature(String selectedFeature) {
		this.selectedFeature = selectedFeature;
	}
	public void setSelectedConfigurationPackage(String selectedConfigurationPackage) {
		this.selectedConfigurationPackage = selectedConfigurationPackage;
	}
	
	
}
