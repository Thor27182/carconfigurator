package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler.Controler;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.ObservableFromControler;

import java.util.ArrayList;

public class Model extends ObservableFromControler {

    //<--- Attribute --->
    private Controler controler;

    //<--- Associations --->
    private ArrayList<Car> carCatalog;
    private ArrayList<Customer> ourLoyalCustomers;
    private ArrayList<Order> orders;
    private ArrayList<Staffmember> staffmembers;

    //<--- Constructors --->
    public Controler(){
        this.carCatalog = new ArrayList<Car>();
        this.ourLoyalCustomers = new ArrayList<Customer>();
        this.orders = new ArrayList<>();
        this.staffmembers = new ArrayList<>();
    }

    //<--- Getters and Setters --->
    public ArrayList<Car> getCars() {
        return carCatalog;
    }
    public void setCars(ArrayList<Car> carCatalog) {
        this.carCatalog = carCatalog;
    }

    public ArrayList<Customer> getCustomers() {
        return ourLoyalCustomers;
    }
    public void setCustomers(ArrayList<Customer> ourLoyalCustomers) {
        this.ourLoyalCustomers = ourLoyalCustomers;
    }

    public Controler getControler() {
        return controler;
    }
    public void setControler(Controler controler) {
        this.controler = controler;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Staffmember> getStaffmembers() {
        return staffmembers;
    }
    public void setStaffmembers(ArrayList<Staffmember> staffmembers) {
        this.staffmembers = staffmembers;
    }


    //<--- Methodes --->
    public void addCarToCatalog(Car car) {
        carCatalog.add(car);
    }

    public void addStaffmemberToStaff(Staffmember staffmember) {
        staffmembers.add(staffmember);
    }

    public void addCustomer(Customer customer) {
        ourLoyalCustomers.add(customer);
    }

}
