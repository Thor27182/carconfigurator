package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.test.controler;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler.Controler;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Model;

import static org.junit.Assert.assertEquals;

class ControlerTest {

    @org.junit.jupiter.api.Test
    void initializeModelwith6Cars(){
        Model model = new Model();
        Controler controler = new Controler();
        controler.initializeModel();
        assertEquals(6, model.getCars().size());
    }

    @org.junit.jupiter.api.Test
    void initializeModelwith1Customer(){
        Model model = new Model();
        Controler controler = new Controler();
        controler.initializeModel();
        assertEquals(1, model.getCustomers().size());
    }

    @org.junit.jupiter.api.Test
    void initializeModelwith1Staffmember(){
        Model model = new Model();
        Controler controler = new Controler();
        controler.initializeModel();
        assertEquals(1, model.getCustomers().size());
    }

}