package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CarConfiguratorUI2 extends JFrame {

	//<--- Attributes --->
	private JButton bestellButton;
	private JButton backButton;

	private JCheckBox KlimaanlageFeature;
	private JCheckBox infotainmentSystemFeature;
	private JCheckBox SitzheizungFeature;
	private JCheckBox heizungFeature;

	private JComboBox cBchooseModel;
	private JComboBox cBchooseKraftstoff;
	private JComboBox cBchoosePaket;
	private JComboBox cBNumOfDoors;
	
	private ActionListener actionListener;


	//<--- Constructor --->
	public CarConfiguratorUI2(ActionListener actionListener) {
		super("Autokonfigurator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.actionListener = actionListener;
		this.composeUI();
	}

	//<--- Methodes --->
	public void composeUI() {

		this.setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6, 2));
		this.add(panel);

		JLabel labelChooseModel = new JLabel("Generation auswählen" );
		JLabel labelNumOfDoors = new JLabel("waehlen Sie die Anzahl der Tueren");
		JLabel labelFuelType = new JLabel("waehlen Sie Kraftstoff");
		JLabel labelPaket = new JLabel("waehlen Sie ein Ausstattungspaket");
		
		this.bestellButton = new JButton("bestaetigen");
		this.bestellButton.addActionListener(this.actionListener);
		this.backButton = new JButton("zurueck");
		this.backButton.addActionListener(this.actionListener);

		
		this.cBchooseModel = new JComboBox();
		this.cBchooseKraftstoff = new JComboBox();
		this.cBchoosePaket = new JComboBox();
		this.cBNumOfDoors = new JComboBox();

		String[] availableModel = new String[4];
		availableModel[0] = "- none -";
		availableModel[1] = "4";
		availableModel[2] = "3";
		availableModel[3] = "2";

		String[] numOfDoors = new String[3];
		numOfDoors[0] = "- none -";
		numOfDoors[1] = "3";
		numOfDoors[2] = "5";

		String[] kraftstoff = new String[3];
		kraftstoff[0] = "- none -";
		kraftstoff[1] = "Benzin";
		kraftstoff[2] = "Diesel";

		String[] paket = new String[3];
		paket[0] = "- none -";
		paket[1] = "Sport-Paket";
		paket[2] = "Luxus-Paket";

		
		setCBchooseModel(availableModel);
		setCBNumOfDoors(numOfDoors);
		setCBchooseKraftstoff(kraftstoff);
		setCBchoosePaket(paket);
		
		cBchooseKraftstoff.setEnabled(false);
		cBchoosePaket.setEnabled(false);
		cBNumOfDoors.setEnabled(false);
		
		this.cBchooseModel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(cBchooseModel.getSelectedItem() == "- none -") {
					cBchooseKraftstoff.setEnabled(false);
					cBchoosePaket.setEnabled(false);
					cBNumOfDoors.setEnabled(false);
				}else {
					cBchooseKraftstoff.setEnabled(true);
					cBchoosePaket.setEnabled(true);
					cBNumOfDoors.setEnabled(true);
				}
				
			}
		});
		
		panel.add(labelChooseModel); // Label Model
		panel.add(cBchooseModel); // Dropdown Model
		panel.add(labelNumOfDoors); // label Tueren
		panel.add(cBNumOfDoors); // Dropdown Tueren
		panel.add(labelFuelType); // Label Kraftstoff
		panel.add(cBchooseKraftstoff); // Dropdown Kraftstoff
		panel.add(labelPaket); // Label Kraftstoff
		panel.add(cBchoosePaket); // Dropdown Kraftstoff
		panel.add(bestellButton);
		panel.add(backButton);
		
		
		
		this.KlimaanlageFeature = new JCheckBox("Klimaanlage");
		this.KlimaanlageFeature.addActionListener(this.actionListener);
		this.infotainmentSystemFeature = new JCheckBox("Infotainment-System");
		this.infotainmentSystemFeature.addActionListener(this.actionListener);
		this.SitzheizungFeature = new JCheckBox("Sitzheizung");
		this.SitzheizungFeature.addActionListener(this.actionListener);
		this.heizungFeature = new JCheckBox("Heizung");
		this.heizungFeature.addActionListener(this.actionListener);

		JLabel featuresLabel = new JLabel("Waehlen Sie gewuenschte Zusatzoptionen");
		JPanel featuresPanel = new JPanel();
		featuresPanel.add(featuresLabel);
		featuresPanel.add(this.KlimaanlageFeature);
		featuresPanel.add(this.infotainmentSystemFeature);
		featuresPanel.add(this.SitzheizungFeature);
		featuresPanel.add(this.heizungFeature);
		this.add(panel, BorderLayout.CENTER);
		this.add(featuresPanel, BorderLayout.SOUTH);
		this.pack();
		this.setSize(600, 400);
		
		this.SitzheizungFeature.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(SitzheizungFeature.isSelected()) {
					heizungFeature.setEnabled(false);
				}else {
					heizungFeature.setEnabled(true);
				}
			}
		});
		this.heizungFeature.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(heizungFeature.isSelected()) {
					SitzheizungFeature.setEnabled(false);
				}else {
					SitzheizungFeature.setEnabled(true);
				}
			}
		});
		
	}

	
	public  void setCBchooseModel(String[] stringArray) {
		cBchooseModel = new JComboBox(stringArray);
	}

	public  void setCBNumOfDoors(String[] stringArray) {
		cBNumOfDoors = new JComboBox(stringArray);
	}

	public  void setCBchooseKraftstoff(String[] stringArray) {
		cBchooseKraftstoff = new JComboBox(stringArray);
	}

	public  void setCBchoosePaket(String[] stringArray) {
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
	public JComboBox getcBchooseModel() {
		return cBchooseModel;
	}
	public JComboBox getcBchooseKraftstoff() {
		return cBchooseKraftstoff;
	}
	public JComboBox getcBchoosePaket() {
		return cBchoosePaket;
	}
	public JComboBox getcBNumOfDoors() {
		return cBNumOfDoors;
	}
	public JCheckBox getKlimaanlageFeature() {
		return KlimaanlageFeature;
	}
	public JCheckBox getInfotainmentSystemFeature() {
		return infotainmentSystemFeature;
	}
	public JCheckBox getSitzheizungFeature() {
		return SitzheizungFeature;
	}
	public JCheckBox getHeizungFeature() {
		return heizungFeature;
	}
	
	
}
