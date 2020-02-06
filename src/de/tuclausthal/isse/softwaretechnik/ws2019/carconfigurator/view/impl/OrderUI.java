package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OrderUI extends JFrame {

	//<--- Attributes --->
	private JLabel carModelLabel;
	private JLabel numberOfDoorsLabel;
	private JLabel fuelTypeLabel;
	private JLabel featureLabel;
	private JLabel configurationPackageLabel;

	private JButton orderButton;

	private String selectedCarModel;
	private String selectedNumberOfDoors;
	private String selectedFeulType;
	private String selectedFeature;
	private String selectedConfigurationPackage;
	
	private ActionListener actionListener;


	//<--- Constructor --->
	public OrderUI(ActionListener actionListener) {
		super("Autokonfigurator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.actionListener = actionListener;
		this.composeUI();
	}

	//<--- Methodes
	public void composeUI() {
		//<--- Panel for UI-Elements --->
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		JLabel carModelTitleLabel = new JLabel("Automodell: ");
		this.carModelLabel = new JLabel("Automodell");
		JPanel carModelPanel = new JPanel(new BorderLayout());
		carModelPanel.add(carModelTitleLabel, BorderLayout.WEST);
		carModelPanel.add(this.carModelLabel, BorderLayout.CENTER);

		JLabel numberOfDoorsTitleLabel = new JLabel("Tueren: ");
		this.numberOfDoorsLabel = new JLabel("3");
		JPanel numberOfDoorsPanel = new JPanel(new BorderLayout());
		numberOfDoorsPanel.add(numberOfDoorsTitleLabel, BorderLayout.WEST);
		numberOfDoorsPanel.add(this.numberOfDoorsLabel, BorderLayout.CENTER);

		JLabel fuelTypeTitleLabel = new JLabel("Kraftstoff: ");
		this.fuelTypeLabel = new JLabel("Benzin");
		JPanel fuelTypePanel = new JPanel(new BorderLayout());
		fuelTypePanel.add(fuelTypeTitleLabel, BorderLayout.WEST);
		fuelTypePanel.add(this.fuelTypeLabel, BorderLayout.CENTER);

		JLabel featureTitleLabel = new JLabel("Zusatzoption: ");
		this.featureLabel = new JLabel("- none -");
		JPanel featurePanel = new JPanel(new BorderLayout());
		featurePanel.add(featureTitleLabel, BorderLayout.WEST);
		featurePanel.add(this.featureLabel, BorderLayout.CENTER);

		JLabel configurationPackageTitleLabel = new JLabel("Ausstattungspaket: ");
		this.configurationPackageLabel = new JLabel("Sport-Paket");
		JPanel configurationPackagePanel = new JPanel(new BorderLayout());
		configurationPackagePanel.add(configurationPackageTitleLabel, BorderLayout.WEST);
		configurationPackagePanel.add(this.configurationPackageLabel, BorderLayout.CENTER);
		
		mainPanel.add(carModelPanel);
		mainPanel.add(numberOfDoorsPanel);
		mainPanel.add(fuelTypePanel);
		mainPanel.add(featurePanel);
		mainPanel.add(configurationPackagePanel);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout());
		this.orderButton = new JButton("Antrag abschicken");
		this.orderButton.addActionListener(this.actionListener);
		buttonPanel.add(this.orderButton, BorderLayout.EAST);
		
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.getContentPane().add(mainPanel);
		this.getContentPane().add(buttonPanel);
		this.pack();
		this.setSize(1000, 500);
	
	
	}


	//<--- Getter and Setter --->
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
