package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler.Controler;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Car;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.CarDealer;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Customer;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Staffmember;

import java.util.ArrayList;

public class Carconfigurator {

    public static void main(String[] args) {
        //
        CarDealer model = new CarDealer();
        Controler controler = new Controler(model);

        controler.initializeModel();









    }
}
