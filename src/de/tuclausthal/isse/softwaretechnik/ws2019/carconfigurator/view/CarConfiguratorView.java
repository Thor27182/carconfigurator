package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CarConfiguratorView {

	public static void main(String[] args) {
		Frame();
	}

	public static void Frame() {
		JFrame frame = new JFrame("Autokonfigurator");
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6, 2));
		frame.add(panel);
		frame.setVisible(true);

		// labels
		JLabel labelChooseModel = new JLabel("wählen Sie ihr Automodell");
		JLabel labelAmountOfDoors = new JLabel("wählen Sie die Anzahl der Türen");
		JLabel labelKraftstoff = new JLabel("wählen Sie Kraftstoff");
		JLabel labelZusatzoptionen = new JLabel("wählen Sie Zusatzoption");
		JLabel labelPaket = new JLabel("wählen Sie ein Ausstattungspaket");

		JButton bestellButton = new JButton("bestellen");
		JButton backButton = new JButton("zurück");

		// DropdownVariablen
		String availableModel[] = { "- none -", "Golf 4", "Golf 3", "Golf 2" };
		String amountOfDoors[] = { "- none -", "3", "5" };
		String kraftstoff[] = { "- none -", "Benzin", "Diesel" };
		String zusatzoptionen[] = { "- none -", "Sitzheizung", "Ledersitze" };
		String paket[] = { "- none -", "Sport-Paket", "Luxus-Paket" };

		// DropdownBoxen
		JComboBox cBamountOfDoors = new JComboBox(amountOfDoors);
		JComboBox cBchooseModel = new JComboBox(availableModel);
		JComboBox cBchooseKraftstoff = new JComboBox(kraftstoff);
		JComboBox cBchooseZusatzoptionen = new JComboBox(zusatzoptionen);
		JComboBox cBchoosePaket = new JComboBox(paket);

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

		cBamountOfDoors.setEnabled(false);
		cBchooseKraftstoff.setEnabled(false);
		cBchooseZusatzoptionen.setEnabled(false);
		cBchoosePaket.setEnabled(false);

		cBamountOfDoors.addItemListener(new ItemChangeListener());
		cBchooseModel.addItemListener(new ItemChangeListener());
		cBchooseKraftstoff.addItemListener(new ItemChangeListener());
		cBchooseZusatzoptionen.addItemListener(new ItemChangeListener());
		cBchoosePaket.addItemListener(new ItemChangeListener());

		// nur auswählbar, wenn ein Fahrzeugtyp gewählt wurde
		cBchooseModel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent event) {

				if (cBchooseModel.getSelectedItem() != "- none -") {
					cBamountOfDoors.setEnabled(true);
					cBchooseKraftstoff.setEnabled(true);
					cBchooseZusatzoptionen.setEnabled(true);
					cBchoosePaket.setEnabled(true);
				} else if (cBchooseModel.getSelectedItem() == "- none -") {
					cBamountOfDoors.setEnabled(false);
					cBchooseKraftstoff.setEnabled(false);
					cBchooseZusatzoptionen.setEnabled(false);
					cBchoosePaket.setEnabled(false);
					cBamountOfDoors.setSelectedIndex(0);
					cBchooseKraftstoff.setSelectedIndex(0);
					cBchooseZusatzoptionen.setSelectedIndex(0);
					cBchoosePaket.setSelectedIndex(0);
				}
			}
		});
	}

}
