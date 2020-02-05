package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator;

import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.controler.Controler;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation.Model;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.MainView;
import de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.register.RegisterView;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Carconfigurator {

    public static void main(String[] args) {
        //Create Objects form Model and Controler
        Model model = new Model();
        Controler controler = new Controler();

        //Connect model and controler
        model.setControler(controler);
        controler.setModel(model);

        //Fill model with cars and Staffmember
        controler.initializeModel();

        //Open a window
        JFrame mainframe = new JFrame();

        mainframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainframe.setTitle("Autokonfigurator");
        mainframe.setSize(1000, 620);
        mainframe.setResizable(false);
        mainframe.setVisible(true);

        RegisterView registerView = new RegisterView();
        mainframe.getContentPane().add(registerView);
        //Register a User

        //Configurate a Car

        //Order a Car









    }
}
