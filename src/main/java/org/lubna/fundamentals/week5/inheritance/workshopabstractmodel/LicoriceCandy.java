package org.lubna.fundamentals.week5.inheritance.workshopabstractmodel;

public class LicoriceCandy extends Product{

    private final String flavour;

    public LicoriceCandy(int id, double price, String productName, String flavour) {
        super(id, price, productName);
        this.flavour = flavour;
    }

    @Override
    public String examine() {
        return toString();
    }

    @Override
    public String use() {
        return getProductName() + "Taste varies from flavour to flavour";
    }
}
