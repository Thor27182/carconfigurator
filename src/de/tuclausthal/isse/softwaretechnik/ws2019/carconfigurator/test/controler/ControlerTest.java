package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.test.controler;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler.Controler;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.CarDealer;

import static org.junit.jupiter.api.Assertions.*;

class ControlerTest {

    @org.junit.jupiter.api.Test
    void initializeModelwith6Cars(){
        CarDealer model = new CarDealer();
        Controler controler = new Controler(model);
        controler.initializeModel();
        assertEquals(6, model.getCars().size());
    }

    @org.junit.jupiter.api.Test
    void initializeModelwith1Customer(){
        CarDealer model = new CarDealer();
        Controler controler = new Controler(model);
        controler.initializeModel();
        assertEquals(1, model.getCustomers().size());
    }

    @org.junit.jupiter.api.Test
    void initializeModelwith1Staffmember(){
        CarDealer model = new CarDealer();
        Controler controler = new Controler(model);
        controler.initializeModel();
        assertEquals(1, model.getCustomers().size());
    }

}