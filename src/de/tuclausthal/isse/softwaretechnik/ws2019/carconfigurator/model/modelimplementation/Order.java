package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation;

public class Order {

    //<--- Associations --->
    private Customer customer;
    private Car car;

    //<--- Constructors --->
    public Order(Customer customer, Car car) {
        this.customer = customer;
        this.car = car;
    }

    //<--- Getters and Setters --->
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
