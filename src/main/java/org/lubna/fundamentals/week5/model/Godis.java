package org.lubna.fundamentals.week5.model;

public class Godis implements Product {

    private int id = 2;
    private String name = "Goodies";
    private double price = 50.00;


    public Godis() {
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
        return id;
    }

    @Override
    public String getProductName() {
        return name;
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
