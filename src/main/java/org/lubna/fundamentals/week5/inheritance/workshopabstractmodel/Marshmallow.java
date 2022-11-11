package org.lubna.fundamentals.week5.inheritance.workshopabstractmodel;

public class Marshmallow extends Product {

    private final String veganOrNot;

    protected Marshmallow(int id, double price, String productName, String veganOrNot) {
        super(id, price, productName);
        this.veganOrNot = veganOrNot;
    }

    @Override
    public String examine() {
        return toString();
    }

    @Override
    public String use() {
        return productName() + "Tested to be 100% vegan";
    }
}
