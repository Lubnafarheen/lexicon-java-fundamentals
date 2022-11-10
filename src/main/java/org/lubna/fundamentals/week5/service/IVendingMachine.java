package org.lubna.fundamentals.week5.service;

import org.lubna.fundamentals.week5.model.Product;

public interface IVendingMachine {
    void addCurrency(double amount);

    int getBalance();

    Product request(int id);

    int endSession();

    String getDescription(int id);

    String[] getProducts();
}
