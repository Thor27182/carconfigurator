package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class CarConfiguratorUI2 extends JFrame {
	
//	private Feature feature = new Feature("1", 1);
//	CarConfiguratorUI view = new CarConfiguratorUI();
	
	private	JFrame frame;
	private JPanel panel;
	private JLabel labelChooseModel;
	private JLabel labelNumOfDoors;
	private JLabel labelFuelType;
	private JLabel labelFeatures;
	private JLabel labelPaket;
	
	private JButton bestellButton;
	private JButton backButton;
	
	private ArrayList<String> viewFeatureList;
	private ArrayList<String> viewConfigurationpackageList;
	private ArrayList<String> viewDoorsList;
	private ArrayList<String> viewCarmodelList;
	private ArrayList<String> viewFuelList;
	
	private String availableModel[];
	private String numOfDoors[];
	private String kraftstoff[];
	private String zusatzoptionen[];
	private String paket[];
	

	private JComboBox cBchooseModel;
	private JComboBox cBchooseKraftstoff;
	private JComboBox cBchooseZusatzoptionen;
	private JComboBox cBchoosePaket;
	private JComboBox cBNumOfDoors;
	
	private ActionListener actionListener;
	
	public CarConfiguratorUI2(ActionListener actionListener) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.actionListener = actionListener;
		this.composeUI();
	}
	public CarConfiguratorUI2() {
		this.composeUI();
	}
	public void composeUI() {
		this.frame = new JFrame("Autokonfigurator");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel = new JPanel();
		panel.setLayout(new GridLayout(6, 2));
		frame.add(panel);
		
		this.labelChooseModel = new JLabel("wählen Sie ihr Automodell");
		this.labelNumOfDoors = new JLabel("wählen Sie die Anzahl der Türen");
		this.labelFuelType = new JLabel("wählen Sie Kraftstoff");
		this.labelFeatures = new JLabel("wählen Sie Zusatzoption");
		this.labelPaket = new JLabel("wählen Sie ein Ausstattungspaket");
		
		this.bestellButton = new JButton("bestätigen");
		this.bestellButton.addActionListener(this.actionListener);
		this.backButton = new JButton("zurück");
		this.backButton.addActionListener(this.actionListener);

		
		this.cBchooseModel = new JComboBox();
		this.cBchooseKraftstoff = new JComboBox();
		this.cBchooseZusatzoptionen = new JComboBox();
		this.cBchoosePaket = new JComboBox();
		this.cBNumOfDoors = new JComboBox();
	
		availableModel = new String[4];
		availableModel[0] = "- none -";
		availableModel[1] = "Golf 4";
		availableModel[2] = "Golf 3";
		availableModel[3] = "Golf 2";
//		this.setCBchooseModel(availableModel);
		numOfDoors = new String[3];
		numOfDoors[0] = "- none -";
		numOfDoors[1] = "3";
		numOfDoors[2] = "5";
//		this.setCBNumOfDoors(numOfDoors);
		kraftstoff = new String[3];
		kraftstoff[0] = "- none -";
		kraftstoff[1] = "Benzin";
		kraftstoff[2] = "Diesel";
//		this.setCBchooseKraftstoff(kraftstoff);
		// availableModel = viewCarmodelList.toArray(new
		// String[viewCarmodelList.size()]);
		// amountOfDoors = viewDoorsList.toArray(new String[viewDoorsList.size()]);
		// kraftstoff = viewFuelList.toArray(new String[viewFuelList.size()]);
//		zusatzoptionen = viewFeatureList.toArray(new String[viewFeatureList.size()]);
		// paket = viewConfigurationpackageList.toArray(new
		// String[viewConfigurationpackageList.size()]);
		paket = new String[3];
		paket[0] = "- none -";
		paket[1] = "Sport-Paket";
		paket[2] = "Luxus-Paket";
//		this.setCBchoosePaket(paket);
		
		setCBchooseModel(availableModel);
		setCBNumOfDoors(numOfDoors);
		setCBchooseKraftstoff(kraftstoff);
//		setCBchooseZusatzoptionen(zusatzoptionen);
		setCBchoosePaket(paket);
		
		cBchooseKraftstoff.setEnabled(false);
		cBchoosePaket.setEnabled(false);
		cBchooseZusatzoptionen.setEnabled(false);
		cBNumOfDoors.setEnabled(false);
		
		this.cBchooseModel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(cBchooseModel.getSelectedItem() == "- none -") {
					cBchooseKraftstoff.setEnabled(false);
					cBchoosePaket.setEnabled(false);
					cBchooseZusatzoptionen.setEnabled(false);
					cBNumOfDoors.setEnabled(false);
				}else {
					cBchooseKraftstoff.setEnabled(true);
					cBchoosePaket.setEnabled(true);
					cBchooseZusatzoptionen.setEnabled(true);
					cBNumOfDoors.setEnabled(true);
				}
				
			}
		});
		
		panel.add(labelChooseModel); // Label Model
		panel.add(cBchooseModel); // Dropdown Model
		panel.add(labelNumOfDoors); // label Türen
		panel.add(cBNumOfDoors); // Dropdown Türen
		panel.add(labelFuelType); // Label Kraftstoff
		panel.add(cBchooseKraftstoff); // Dropdown Kraftstoff
		panel.add(labelFeatures); // Label Zusatzoptionen
		panel.add(cBchooseZusatzoptionen); // Dropdown Zusatzoptionen
		panel.add(labelPaket); // Label Kraftstoff
		panel.add(cBchoosePaket); // Dropdown Kraftstoff
		panel.add(bestellButton);
		panel.add(backButton);
//		frame.setVisible(true);
		
//		cBamountOfDoors.setEnabled(false);
//		cBchooseKraftstoff.setEnabled(false);
//		cBchooseZusatzoptionen.setEnabled(false);
//		cBchoosePaket.setEnabled(false);
//		
//		cBamountOfDoors.addItemListener(new CarConfiguratorController(view));
//		cBchooseModel.addItemListener(new CarConfiguratorController(view));
//		cBchooseKraftstoff.addItemListener(new CarConfiguratorController(view));
//		cBchooseZusatzoptionen.addItemListener(new CarConfiguratorController(view));
//		cBchoosePaket.addItemListener(new CarConfiguratorController(view));
//
//		// nur auswählbar, wenn ein Fahrzeugtyp gewählt wurde
//		cBchooseModel.addActionListener(new CarConfiguratorController(view));
		
		
	}
//	public void setStringArray() {
//		// DropdownVariablen
//		feature.initializeFeatureList();
//		viewFeatureList = feature.getFeatureList();
//		availableModel = new String[4];
//		availableModel[0] = "- none -";
//		availableModel[1] = "Golf 4";
//		availableModel[2] = "Golf 3";
//		availableModel[3] = "Golf 2";
//		numOfDoors = new String[3];
//		numOfDoors[0] = "- none -";
//		numOfDoors[1] = "3";
//		numOfDoors[2] = "5";
//		kraftstoff = new String[3];
//		kraftstoff[0] = "- none -";
//		kraftstoff[1] = "Benzin";
//		kraftstoff[2] = "Diesel";
//		// availableModel = viewCarmodelList.toArray(new
//		// String[viewCarmodelList.size()]);
//		// amountOfDoors = viewDoorsList.toArray(new String[viewDoorsList.size()]);
//		// kraftstoff = viewFuelList.toArray(new String[viewFuelList.size()]);
//		zusatzoptionen = viewFeatureList.toArray(new String[viewFeatureList.size()]);
//		// paket = viewConfigurationpackageList.toArray(new
//		// String[viewConfigurationpackageList.size()]);
//		paket = new String[3];
//		paket[0] = "- none -";
//		paket[1] = "Sport-Paket";
//		paket[2] = "Luxus-Paket";
//
//	}
	
//	public void setEnableDropdown(JComboBox cBamountOfDoors, JComboBox cBchooseKraftstoff,
//			JComboBox cBchooseZusatzoptionen, JComboBox cBchoosePaket) {
//		cBamountOfDoors.setEnabled(true);
//		cBchooseKraftstoff.setEnabled(true);
//		cBchooseZusatzoptionen.setEnabled(true);
//		cBchoosePaket.setEnabled(true);
//	}
//
//	public void setDisableDropdown(JComboBox cBamountOfDoors, JComboBox cBchooseKraftstoff,
//			JComboBox cBchooseZusatzoptionen, JComboBox cBchoosePaket) {
//		cBamountOfDoors.setEnabled(false);
//		cBchooseKraftstoff.setEnabled(false);
//		cBchooseZusatzoptionen.setEnabled(false);
//		cBchoosePaket.setEnabled(false);
//		cBamountOfDoors.setSelectedIndex(0);
//		cBchooseKraftstoff.setSelectedIndex(0);
//		cBchooseZusatzoptionen.setSelectedIndex(0);
//		cBchoosePaket.setSelectedIndex(0);
//	}
	
	public  void setCBchooseModel(String[] stringArray) {
		// model = new DefaultComboBoxModel(stringArray);
		// cBchooseModel.setModel(model);
		cBchooseModel = new JComboBox(stringArray);
	}

	public  void setCBNumOfDoors(String[] stringArray) {
		// model = new DefaultComboBoxModel(stringArray);
		// cBamountOfDoors.setModel(model);
		cBNumOfDoors = new JComboBox(stringArray);
	}

	public  void setCBchooseKraftstoff(String[] stringArray) {
		// model = new DefaultComboBoxModel(stringArray);
		// cBchooseKraftstoff.setModel(model);
		cBchooseKraftstoff = new JComboBox(stringArray);
	}

//	public  void setCBchooseZusatzoptionen(String[] stringArray) {
//		// model = new DefaultComboBoxModel(stringArray);
//		// cBchooseZusatzoptionen.setModel(model);
//		cBchooseZusatzoptionen = new JComboBox(stringArray);
//	}

	public  void setCBchoosePaket(String[] stringArray) {
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
		String item = (String) cBNumOfDoors.getSelectedItem();
		return item;
	}

	public JButton getBestellButton() {
		return bestellButton;
	}

	public JButton getBackButton() {
		return backButton;
	}
	public JFrame getFrame() {
		return frame;
	}
	
	
	
	
	
	
}
