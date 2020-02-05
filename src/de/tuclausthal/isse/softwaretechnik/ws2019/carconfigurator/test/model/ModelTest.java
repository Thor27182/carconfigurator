package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.test.model;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Car;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Customer;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Model;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Staffmember;

import static org.junit.Assert.assertEquals;

class ModelTest {

    @org.junit.jupiter.api.Test
    void addCarToCatalog() {
        Model model = new Model();
        Car car = new Car("i", 1, model);
        model.addCarToCatalog(car);
        assertEquals(false, model.getCars().isEmpty());
    }

    @org.junit.jupiter.api.Test
    void  addStaffmemberToStaff(){
        Model model = new Model();
        Staffmember staffmember = new Staffmember(model);
        model.addStaffmemberToStaff(staffmember);
        assertEquals(false, model.getStaffmembers().isEmpty());
    }

    @org.junit.jupiter.api.Test
    void addCustomer(){
        Model model = new Model();
        Customer customer = new Customer("i", "1", model);
        model.addCustomer(customer);
        assertEquals(false, model.getCustomers().isEmpty());
    }

}