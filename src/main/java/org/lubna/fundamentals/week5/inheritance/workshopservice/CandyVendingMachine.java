package org.lubna.fundamentals.week5.inheritance.workshopservice;

import org.lubna.fundamentals.week5.inheritance.workshopabstractmodel.Product;

public interface CandyVendingMachine {

    void depositedAmount(int amount);

    int getBalance();

    Product buyProduct(int id);

    int endSession();

    String getDescription(int id);

    String[] getProducts();
}

