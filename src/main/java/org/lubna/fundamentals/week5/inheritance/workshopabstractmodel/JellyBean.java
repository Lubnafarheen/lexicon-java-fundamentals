package org.lubna.fundamentals.week5.inheritance.workshopabstractmodel;

public class JellyBean extends Product {

    private final int sugarPercentage;

    public JellyBean(int id, double price, String productName, int sugarPercentage) {
        super(id, price, productName);
        this.sugarPercentage = sugarPercentage;
    }

    @Override
    public String examine() {
        return toString();
    }

    @Override
    public String use() {
        String description = "Jelly Beans is a sugarfree candy";
        return description;
    }
}
