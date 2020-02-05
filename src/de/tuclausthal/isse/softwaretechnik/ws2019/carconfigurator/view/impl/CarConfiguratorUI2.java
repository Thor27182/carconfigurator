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

//import com.sun.crypto.provider.JceKeyStore;



public class CarConfiguratorUI2 extends JFrame {
	
	private	JFrame frame;
	private JPanel panel;
	
	private JLabel labelChooseModel;
	private JLabel labelNumOfDoors;
	private JLabel labelFuelType;
	private JLabel labelFeatures;
	private JLabel labelPaket;
	
	private JButton bestellButton;
	private JButton backButton;
	
	private String availableModel[];
	private String numOfDoors[];
	private String kraftstoff[];
	private String paket[];
	
	private JCheckBox KlimaanlageFeature;
	private JCheckBox infotainmentSystemFeature;
	private JCheckBox SitzheizungFeature;
	private JCheckBox heizungFeature;

	private JComboBox cBchooseModel;
	private JComboBox cBchooseKraftstoff;
	private JComboBox cBchoosePaket;
	private JComboBox cBNumOfDoors;
	
	private ActionListener actionListener;
	
	private JLabel featuresLabel;
	private JPanel featuresPanel;
	
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
		this.frame.setLayout(new BorderLayout());
		this.panel = new JPanel();
		panel.setLayout(new GridLayout(6, 2));
		frame.add(panel);
		
		this.labelChooseModel = new JLabel("wählen Sie ihr Automodell");
		this.labelNumOfDoors = new JLabel("wählen Sie die Anzahl der Türen");
		this.labelFuelType = new JLabel("wählen Sie Kraftstoff");
		this.labelPaket = new JLabel("wählen Sie ein Ausstattungspaket");
		
		this.bestellButton = new JButton("bestätigen");
		this.bestellButton.addActionListener(this.actionListener);
		this.backButton = new JButton("zurück");
		this.backButton.addActionListener(this.actionListener);

		
		this.cBchooseModel = new JComboBox();
		this.cBchooseKraftstoff = new JComboBox();
		this.cBchoosePaket = new JComboBox();
		this.cBNumOfDoors = new JComboBox();
	
		availableModel = new String[4];
		availableModel[0] = "- none -";
		availableModel[1] = "Golf 4";
		availableModel[2] = "Golf 3";
		availableModel[3] = "Golf 2";

		numOfDoors = new String[3];
		numOfDoors[0] = "- none -";
		numOfDoors[1] = "3";
		numOfDoors[2] = "5";

		kraftstoff = new String[3];
		kraftstoff[0] = "- none -";
		kraftstoff[1] = "Benzin";
		kraftstoff[2] = "Diesel";

		paket = new String[3];
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
		panel.add(labelNumOfDoors); // label Türen
		panel.add(cBNumOfDoors); // Dropdown Türen
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
		
		this.featuresLabel = new JLabel("Wählen Sie gewünschte Zusatzoptionen");
		this.featuresPanel = new JPanel();
		this.featuresPanel.add(this.featuresLabel);
		this.featuresPanel.add(this.KlimaanlageFeature);
		this.featuresPanel.add(this.infotainmentSystemFeature);
		this.featuresPanel.add(this.SitzheizungFeature);
		this.featuresPanel.add(this.heizungFeature);
		this.frame.add(this.panel, BorderLayout.CENTER);
		this.frame.add(this.featuresPanel, BorderLayout.SOUTH);
		this.frame.pack();
		this.frame.setSize(600, 400);
		
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
	public JFrame getFrame() {
		return frame;
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
