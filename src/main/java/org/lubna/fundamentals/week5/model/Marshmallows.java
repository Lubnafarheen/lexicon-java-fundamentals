package org.lubna.fundamentals.week5.model;

public class Marshmallows implements Product {

    private final int id = 3;
    private String name = "Marshmallows";
    private double price = 100.00;

    public Marshmallows() {
    }

    @Override
    public String examine() {
        return "Marshmallows{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public String use() {
        return "Suitable for hot chocolate and grilling";
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
