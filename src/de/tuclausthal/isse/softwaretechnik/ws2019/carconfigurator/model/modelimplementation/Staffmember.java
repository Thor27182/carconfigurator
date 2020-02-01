package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation;

import java.util.ArrayList;

public class Staffmember {

    //<--- Associations --->
    private CarDealer myEmployer;
    private ArrayList<Order> ordersToProcess;

    //<--- Constructors --->
    public Staffmember(CarDealer myEmployer){
        this.myEmployer = myEmployer;
    }

    //<--- Getters and Setters --->
    public CarDealer getMyEmployer() {
        return myEmployer;
    }

    public void setMyEmployer(CarDealer myEmployer) {
        this.myEmployer = myEmployer;
    }
}
