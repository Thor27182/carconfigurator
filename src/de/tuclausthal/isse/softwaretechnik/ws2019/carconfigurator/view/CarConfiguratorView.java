package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler.CarConfiguratorController;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.Feature;

public class CarConfiguratorView {
	static Feature feature = new Feature("1", 1);
	static CarConfiguratorView view = new CarConfiguratorView();
	static ArrayList<String> viewFeatureList = new ArrayList<String>();
	static ArrayList<String> viewConfigurationpackageList = new ArrayList<String>();
	static ArrayList<String> viewDoorsList = new ArrayList<String>();
	static ArrayList<String> viewCarmodelList = new ArrayList<String>();
	static ArrayList<String> viewFuelList = new ArrayList<String>();
	static String availableModel[];
	static String amountOfDoors[];
	static String kraftstoff[];
	static String zusatzoptionen[];
	static String paket[];

	static JComboBox cBamountOfDoors = new JComboBox();
	static JComboBox cBchooseModel = new JComboBox();
	static JComboBox cBchooseKraftstoff = new JComboBox();
	static JComboBox cBchooseZusatzoptionen = new JComboBox();
	static JComboBox cBchoosePaket = new JComboBox();

	public CarConfiguratorView() {

	}

	public static void main(String[] args) {
		Frame();
	}

	public static void Frame() {

		JFrame frame = new JFrame("Autokonfigurator");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6, 2));
		frame.add(panel);

		// labels
		JLabel labelChooseModel = new JLabel("wählen Sie ihr Automodell");
		JLabel labelAmountOfDoors = new JLabel("wählen Sie die Anzahl der Türen");
		JLabel labelKraftstoff = new JLabel("wählen Sie Kraftstoff");
		JLabel labelZusatzoptionen = new JLabel("wählen Sie Zusatzoption");
		JLabel labelPaket = new JLabel("wählen Sie ein Ausstattungspaket");

		JButton bestellButton = new JButton("bestellen");
		JButton backButton = new JButton("zurück");

		// DropdownVariablen
		setStringArray();

		setCBchooseModel(availableModel);
		setCBamountOfDoors(amountOfDoors);
		setCBchooseKraftstoff(kraftstoff);
		setCBchooseZusatzoptionen(zusatzoptionen);
		setCBchoosePaket(paket);

		panel.add(labelChooseModel); // Label Model
		panel.add(cBchooseModel); // Dropdown Model
		panel.add(labelAmountOfDoors); // label Türen
		panel.add(cBamountOfDoors); // Dropdown Türen
		panel.add(labelKraftstoff); // Label Kraftstoff
		panel.add(cBchooseKraftstoff); // Dropdown Kraftstoff
		panel.add(labelZusatzoptionen); // Label Zusatzoptionen
		panel.add(cBchooseZusatzoptionen); // Dropdown Zusatzoptionen
		panel.add(labelPaket); // Label Kraftstoff
		panel.add(cBchoosePaket); // Dropdown Kraftstoff
		panel.add(bestellButton);
		panel.add(backButton);
		frame.setVisible(true);

		cBamountOfDoors.setEnabled(false);
		cBchooseKraftstoff.setEnabled(false);
		cBchooseZusatzoptionen.setEnabled(false);
		cBchoosePaket.setEnabled(false);

		cBamountOfDoors.addItemListener(new CarConfiguratorController(view));
		cBchooseModel.addItemListener(new CarConfiguratorController(view));
		cBchooseKraftstoff.addItemListener(new CarConfiguratorController(view));
		cBchooseZusatzoptionen.addItemListener(new CarConfiguratorController(view));
		cBchoosePaket.addItemListener(new CarConfiguratorController(view));

		// nur auswählbar, wenn ein Fahrzeugtyp gewählt wurde
		cBchooseModel.addActionListener(new CarConfiguratorController(view));
	}

	public static void setStringArray() {
		// DropdownVariablen
		feature.initializeFeatureList();
		viewFeatureList = feature.getFeatureList();
		availableModel = new String[4];
		availableModel[0] = "- none -";
		availableModel[1] = "Golf 4";
		availableModel[2] = "Golf 3";
		availableModel[3] = "Golf 2";
		amountOfDoors = new String[3];
		amountOfDoors[0] = "- none -";
		amountOfDoors[1] = "3";
		amountOfDoors[2] = "5";
		kraftstoff = new String[3];
		kraftstoff[0] = "- none -";
		kraftstoff[1] = "Benzin";
		kraftstoff[2] = "Diesel";
		// availableModel = viewCarmodelList.toArray(new
		// String[viewCarmodelList.size()]);
		// amountOfDoors = viewDoorsList.toArray(new String[viewDoorsList.size()]);
		// kraftstoff = viewFuelList.toArray(new String[viewFuelList.size()]);
		zusatzoptionen = viewFeatureList.toArray(new String[viewFeatureList.size()]);
		// paket = viewConfigurationpackageList.toArray(new
		// String[viewConfigurationpackageList.size()]);
		paket = new String[3];
		paket[0] = "- none -";
		paket[1] = "Sport-Paket";
		paket[2] = "Luxus-Paket";

	}

	public void setEnableDropdown(JComboBox cBamountOfDoors, JComboBox cBchooseKraftstoff,
			JComboBox cBchooseZusatzoptionen, JComboBox cBchoosePaket) {
		cBamountOfDoors.setEnabled(true);
		cBchooseKraftstoff.setEnabled(true);
		cBchooseZusatzoptionen.setEnabled(true);
		cBchoosePaket.setEnabled(true);
	}

	public void setDisableDropdown(JComboBox cBamountOfDoors, JComboBox cBchooseKraftstoff,
			JComboBox cBchooseZusatzoptionen, JComboBox cBchoosePaket) {
		cBamountOfDoors.setEnabled(false);
		cBchooseKraftstoff.setEnabled(false);
		cBchooseZusatzoptionen.setEnabled(false);
		cBchoosePaket.setEnabled(false);
		cBamountOfDoors.setSelectedIndex(0);
		cBchooseKraftstoff.setSelectedIndex(0);
		cBchooseZusatzoptionen.setSelectedIndex(0);
		cBchoosePaket.setSelectedIndex(0);
	}

	public JComboBox getCBKraftstoff() {
		return cBchooseKraftstoff;
	}

	public JComboBox getCBamountOfDoors() {
		return cBamountOfDoors;
	}

	public JComboBox getCBchooseModel() {
		return cBchooseModel;
	}

	public JComboBox getCBchooseZusatzoptionen() {
		return cBchooseZusatzoptionen;
	}

	public JComboBox getchoosePaket() {
		return cBchoosePaket;
	}

	public static void setCBchooseModel(String[] stringArray) {
		// model = new DefaultComboBoxModel(stringArray);
		// cBchooseModel.setModel(model);
		cBchooseModel = new JComboBox(stringArray);
	}

	public static void setCBamountOfDoors(String[] stringArray) {
		// model = new DefaultComboBoxModel(stringArray);
		// cBamountOfDoors.setModel(model);
		cBamountOfDoors = new JComboBox(stringArray);
	}

	public static void setCBchooseKraftstoff(String[] stringArray) {
		// model = new DefaultComboBoxModel(stringArray);
		// cBchooseKraftstoff.setModel(model);
		cBchooseKraftstoff = new JComboBox(stringArray);
	}

	public static void setCBchooseZusatzoptionen(String[] stringArray) {
		// model = new DefaultComboBoxModel(stringArray);
		// cBchooseZusatzoptionen.setModel(model);
		cBchooseZusatzoptionen = new JComboBox(stringArray);
	}

	public static void setCBchoosePaket(String[] stringArray) {
		// model = new DefaultComboBoxModel(stringArray);
		// cBchoosePaket.setModel(model);
		cBchoosePaket = new JComboBox(stringArray);
	}

	public String getCBKraftstoffSelItem() {
		String item = (String) cBchooseKraftstoff.getSelectedItem();
		return item;
	}

	public String getCBModelSelItem() {
		String item = (String) cBchooseModel.getSelectedItem();
		return item;
	}

	public String getCBZusatzoptionenSelItem() {
		String item = (String) cBchooseZusatzoptionen.getSelectedItem();
		return item;
	}

	public String getCBPaketSelItem() {
		String item = (String) cBchoosePaket.getSelectedItem();
		return item;
	}

	public String getCBDoorsSelItem() {
		String item = (String) cBamountOfDoors.getSelectedItem();
		return item;
	}

}
