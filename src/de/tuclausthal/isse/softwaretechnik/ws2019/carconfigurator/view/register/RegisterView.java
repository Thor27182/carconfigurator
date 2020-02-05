package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.view.register;

import javax.swing.*;

public class RegisterView extends JPanel{

    private JLabel enterName = new JLabel();
    private JTextField name = new JTextField();
    private JLabel enteCreditcard = new JLabel();
    private JTextField creditcard = new JTextField();
    private JButton register = new JButton();

    public RegisterView(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        enterName.setText("Namen eingeben");
        enteCreditcard.setText("Kreditkarte eingeben");
        register.setText("Registrieren");
        this.add(enterName);
        this.add(name);
        this.add(enteCreditcard);
        this.add(creditcard);
        this.add(register);

    }


}
