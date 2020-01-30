package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation;

/*
Fassade für das model
 */

import java.util.ArrayList;

public class CarDealer {
    private ArrayList<Car> cars;
    private ArrayList<Customer> customers;
    private ArrayList<Order> orders;
    private ArrayList<Staffmember> staffmembers;

    public CarDealer(ArrayList<Car> cars, ArrayList<Customer> customers, ArrayList<Order> orders, ArrayList<Staffmember> staffmembers) {
        this.cars = cars;
        this.customers = customers;
        this.orders = orders;
        this.staffmembers = staffmembers;
    }


    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
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
}
