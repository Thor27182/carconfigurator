package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation;

import java.util.ArrayList;

public class Staffmember {

    //<--- Associations --->
    private Model myEmployer;
    private ArrayList<Order> ordersToProcess;

    //<--- Constructors --->
    public Staffmember(Model myEmployer){
        this.myEmployer = myEmployer;
    }

    //<--- Getters and Setters --->
    public Model getMyEmployer() {
        return myEmployer;
    }
    public void setMyEmployer(Model myEmployer) {
        this.myEmployer = myEmployer;
    }
}
