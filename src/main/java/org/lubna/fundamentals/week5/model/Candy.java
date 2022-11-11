package org.lubna.fundamentals.week5.model;

public class Candy implements Product {
    private final int id = 1;
    private String name = "Candies";
    public  double price = 25.00;

    public Candy() {
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
        return id;
    }

    @Override
    public String getProductName() {
        return name;
    }

    @Override
    public void setProductName(String productName) {
        this.name =name;
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
