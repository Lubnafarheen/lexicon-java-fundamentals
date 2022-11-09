package org.lubna.fundamentals.week5.model;

public class Candy implements Product {
    private static int sequencer = 100;
    private int id;
    private String name = "Candies";
    private double price = 25.00;


    public Candy() {
        this.id = ++sequencer;
        this.name = name;
        this.price = price;
    }

    @Override
    public String examine() {
        return "Candy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String use() {
        return "Gelatin free product";
    }

    @Override
    public int getId() {
        return this.id = id;
    }

    @Override
    public String getProductName() {
        return this.name = name;
    }

    @Override
    public void setProductName(String productName) {
        this.name = productName;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
