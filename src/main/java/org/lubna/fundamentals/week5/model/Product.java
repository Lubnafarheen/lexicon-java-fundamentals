package org.lubna.fundamentals.week5.model;

public interface Product {
    String examine();
    String use();
    int getId();
    String getProductName();
    void setProductName(String productName);
    double getPrice();
    void setPrice(double price);

}
