package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Car;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Customer;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Model;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Staffmember;

public class Controler implements  ModelObserver{
    private Model model;

    public void addCarToModel(Car car){
        model.addCarToCatalog(car);
    }
    
    public void initializeModel(){
        model.addCarToCatalog(new Car("Audi A4", 4, model));
        model.addCarToCatalog(new Car("Audi R8", 2, model));
        model.addCarToCatalog(new Car("BMW X5", 3, model));
        model.addCarToCatalog(new Car("BMW X6", 2, model));
        model.addCarToCatalog(new Car("VW Golf", 2, model));
        model.addCarToCatalog(new Car("VW Passat", 8, model));

        model.addStaffmemberToStaff(new Staffmember(model));
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public void update() {

    }
}
