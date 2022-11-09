package org.lubna.fundamentals.week5.model;

public class Godis implements Product {
    private static int sequencer = 100;
    private int id;
    private String name = "Goodies";
    private double price = 50.00;


    public Godis() {
        this.id = ++sequencer;
        this.name = name;
        this.price = price;
    }

    @Override
    public String examine() {
        return "Goodies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String use() {
        return "Vegan and no added sugar";
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
