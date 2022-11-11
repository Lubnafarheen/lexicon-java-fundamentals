package org.lubna.fundamentals.week5.inheritance.workshopabstractmodel;

public class Marshmallows extends Product {

    private final String veganOrNot;

    protected Marshmallows(int id, double price, String productName, String veganOrNot) {
        super(id, price, productName);
        this.veganOrNot = veganOrNot;
    }

    @Override
    public String examine() {
        return toString();
    }

    @Override
    public String use() {
        return getProductName() + "Tested to be 100% vegan";
    }
}
