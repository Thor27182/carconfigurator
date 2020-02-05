package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation;

import java.util.ArrayList;

public class Customer {

    //<--- Attributs --->
    private String name;
    private String creditcardnumber;

    //<--- Associations --->
    private Model myCarDealer;
    private Car theCarToBeConfigured;
    private ArrayList<Order> myOrders;

    //<--- Constructors --->
    public Customer(String name, String creditcardnumber, Model myCarDealer){
        this.name = name;
        this.creditcardnumber = creditcardnumber;
        this.myCarDealer = myCarDealer;
    }


    //<---Getters and Setters--->
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCreditcardnumber() {
        return creditcardnumber;
    }
    public void setCreditcardnumber(String creditcardnumber) {
        creditcardnumber = creditcardnumber;
    }

    public Model getMyCarDealer() {
        return myCarDealer;
    }
    public void setMyCarDealer(Model myCarDealer) {
        this.myCarDealer = myCarDealer;
    }

    public Car getTheCarToBeConfigured() {
        return theCarToBeConfigured;
    }
    public void setTheCarToBeConfigured(Car theCarToBeConfigured) {
        this.theCarToBeConfigured = theCarToBeConfigured;
    }

    public ArrayList<Order> getMyOrders() {
        return myOrders;
    }
    public void setMyOrders(ArrayList<Order> myOrders) {
        this.myOrders = myOrders;
    }
}
