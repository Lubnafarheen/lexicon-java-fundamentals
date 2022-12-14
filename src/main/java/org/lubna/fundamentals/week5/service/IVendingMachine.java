package org.lubna.fundamentals.week5.service;

import org.lubna.fundamentals.week5.model.Product;

public interface IVendingMachine {
    void depositedAmount(int amount);

    int getBalance();

    Product buyProduct(int id);

    int endSession();

    String getDescription(int id);

    String[] getProducts();
}
