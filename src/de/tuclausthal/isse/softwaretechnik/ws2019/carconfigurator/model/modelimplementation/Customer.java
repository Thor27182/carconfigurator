package de.tuclausthal.isse.softwaretechnik.ws2019.carconfigurator.model.modelimplementation;

public class Customer {

    private String name;
    private String creditcardnumber;

    public Customer(String name, String creditcardnumber){
        this.name = name;
        this.creditcardnumber = creditcardnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreditcardnumber() {
        return creditcardnumber;
    }

    public void setCreditcardnumber(String creditcardnumber) {
        creditcardnumber = creditcardnumber;
    }
}
