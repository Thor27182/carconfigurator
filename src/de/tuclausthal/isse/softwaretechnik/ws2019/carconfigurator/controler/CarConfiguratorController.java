package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JComboBox;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.Feature;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.CarConfiguratorView;

public class CarConfiguratorController implements ActionListener, ItemListener {

	private CarConfiguratorView view;
	private static Feature feature;

	public CarConfiguratorController(CarConfiguratorView view) {
		this.view = view;
		this.feature = new Feature("1", 1);
	}

	@Override
	public void actionPerformed(final ActionEvent event) {

		JComboBox s = (JComboBox) event.getSource();

		String item = (String) s.getSelectedItem();

		JComboBox cBamountOfDoors = new JComboBox();
		JComboBox cBchooseKraftstoff = new JComboBox();
		JComboBox cBchooseZusatzoptionen = new JComboBox();
		JComboBox cBchoosePaket = new JComboBox();

		cBamountOfDoors = view.getCBamountOfDoors();
		cBchooseKraftstoff = view.getCBKraftstoff();
		cBchooseZusatzoptionen = view.getCBchooseZusatzoptionen();
		cBchoosePaket = view.getchoosePaket();

		if (item != "- none -") {
			view.setEnableDropdown(cBamountOfDoors, cBchooseKraftstoff, cBchooseZusatzoptionen, cBchoosePaket);
		} else if (item == "- none -") {
			view.setDisableDropdown(cBamountOfDoors, cBchooseKraftstoff, cBchooseZusatzoptionen, cBchoosePaket);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent event) {
		if (event.getStateChange() == ItemEvent.SELECTED) {
			Object item = event.getItem();

			Object object = event.getSource();
			if (object == view.getCBchooseZusatzoptionen()) {
				ArrayList<String> a = new ArrayList<String>();
				a = feature.getFeatureList();
				feature.checkAvailableFeatures(a, item);
			}

			if (item != "- none -") {
				System.out.print(item);
			}

		}
	}
}
