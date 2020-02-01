package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.test.model;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Car;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.CarDealer;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Customer;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Staffmember;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarDealerTest {

    @org.junit.jupiter.api.Test
    void addCarToCatalog() {
        CarDealer carDealer = new CarDealer();
        Car car = new Car("i", 1, carDealer);
        carDealer.addCarToCatalog(car);
        assertEquals(false, carDealer.getCars().isEmpty());
    }

    @org.junit.jupiter.api.Test
    void  addStaffmemberToStaff(){
        CarDealer carDealer = new CarDealer();
        Staffmember staffmember = new Staffmember(carDealer);
        carDealer.addStaffmemberToStaff(staffmember);
        assertEquals(false, carDealer.getStaffmembers().isEmpty());
    }

    @org.junit.jupiter.api.Test
    void addCustomer(){
        CarDealer carDealer = new CarDealer();
        Customer customer = new Customer("i", "1", carDealer);
        carDealer.addCustomer(customer);
        assertEquals(false, carDealer.getCustomers().isEmpty());
    }

}