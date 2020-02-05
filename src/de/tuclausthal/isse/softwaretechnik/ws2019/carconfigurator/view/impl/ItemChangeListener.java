package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.impl;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ItemChangeListener implements ItemListener {

	@Override
	public void itemStateChanged(ItemEvent event) {
		if (event.getStateChange() == ItemEvent.SELECTED) {
			Object item = event.getItem();

			if (item != "- none -") {
				System.out.print(item);
			}
		}
	}
}