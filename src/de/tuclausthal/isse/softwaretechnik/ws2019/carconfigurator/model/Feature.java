package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model;

import java.util.ArrayList;

public class Feature {
	private String name;
	private int price;
	public ArrayList<String> features = new ArrayList<String>();
	public String[] arrayFeatures;

	public Feature() {
		this.name = name;
	}

	public void initializeFeatureList(ArrayList<String> features) {
		features.add("- none -");
		features.add("1");
		features.add("2");
		features.add("3");
	}

	public ArrayList<String> setFeatureList(ArrayList<String> features, ArrayList<String> removeFeatures) {

		ArrayList<String> union = new ArrayList<String>(features);
		union.addAll(removeFeatures);
		ArrayList<String> intersection = new ArrayList<String>(features);
		intersection.retainAll(removeFeatures);
		union.removeAll(intersection);

		return union;
	}

	public ArrayList<String> checkAvailableFeatures(ArrayList<String> features, Object item) {
		ArrayList<String> removeFeatures = new ArrayList<String>();
		if (item == "1") {
			removeFeatures.add("2");
			setFeatureList(features, removeFeatures);
		}

		return features;

	}

	public ArrayList<String> getFeatureList() {
		return features;
	}

	public String[] getZusatzoptionen() {
		return arrayFeatures;
	}

	public void setZusatzoptionen(String[] stringArray) {
		arrayFeatures = stringArray;
	}
}
