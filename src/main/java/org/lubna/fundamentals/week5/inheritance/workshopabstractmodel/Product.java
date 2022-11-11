package org.lubna.fundamentals.week5.inheritance.workshopabstractmodel;

public abstract class Product {
    private final int id;
    private final double price;
    private final String productName;

    public Product(int id, double price, String productName) {
        this.id = id;
        this.price = price;
        this.productName = productName;
    }

    public abstract String examine();

    public abstract String use();

    public int id() {
        return id;
    }

    public double price() {
        return price;
    }

    public String productName() {
        return productName;
    }

}
