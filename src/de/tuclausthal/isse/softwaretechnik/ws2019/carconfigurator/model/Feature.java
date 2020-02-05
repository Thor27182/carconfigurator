package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model;

import java.util.ArrayList;
import java.util.Observable;

public class Feature extends Observable {
	private String name;
	private int price;
	public ArrayList<String> features = new ArrayList<String>();
	public ArrayList<String> chosenFeatures = new ArrayList<String>();
	public String[] arrayFeatures;

	public Feature(String name1, int price1) {
		this.name = name1;
		this.price = price1;
	}

	public void initializeFeatureList() {
		Feature Chromfelgen = new Feature("Chromfelgen", 300);
		Feature Ledersitze = new Feature("Ledersitze", 500);
		Feature Sportsitze = new Feature("Sportsitze", 1000);
		features.add("- none -");
		features.add(Chromfelgen.name);
		features.add(Ledersitze.name);
		features.add(Sportsitze.name);
	}

	public ArrayList<String> setAvailableFeatureList(ArrayList<String> features, ArrayList<String> removeFeatures) {

		ArrayList<String> union = new ArrayList<String>(features);
		union.addAll(removeFeatures);
		ArrayList<String> intersection = new ArrayList<String>(features);
		intersection.retainAll(removeFeatures);
		union.removeAll(intersection);

		return union;
	}

	public void checkAvailableFeatures(ArrayList<String> features, Object item) {
		ArrayList<String> removeFeatures = new ArrayList<String>();
		if (item == "Chromfelgen") {
			chosenFeatures.add("Chromfelgen");
			removeFeatures.add("Chromfelgen");
			removeFeatures.add("Ledersitze");
			features = setAvailableFeatureList(features, removeFeatures);
		}
		if (item == "Ledersitze") {
			chosenFeatures.add("Ledersitze");
			removeFeatures.add("Chromfelgen");
			removeFeatures.add("Ledersitze");
			removeFeatures.add("Sportsitze");
			features = setAvailableFeatureList(features, removeFeatures);
		}
		if (item == "Sportsitze") {
			chosenFeatures.add("Sportsitze");
			removeFeatures.add("Sportsitze");
			removeFeatures.add("Ledersitze");
			features = setAvailableFeatureList(features, removeFeatures);
		}

		setFeatures(features);

	}

	public ArrayList<String> getFeatureList() {
		return features;
	}

	public String[] getZusatzoptionen() {
		return arrayFeatures;
	}

	public void setFeatures(ArrayList<String> arrayList) {
		features = arrayList;
	}

	public void setZusatzoptionen(String[] stringArray) {
		arrayFeatures = stringArray;
	}
}
