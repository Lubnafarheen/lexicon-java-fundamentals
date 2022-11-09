package org.lubna.fundamentals.week5.service;

import org.lubna.fundamentals.week5.model.Candy;
import org.lubna.fundamentals.week5.model.Currency;
import org.lubna.fundamentals.week5.model.Product;

public class VendingMachine implements IVendingMachine {

    private Product[] products;
    private int depositPool;
    private Currency checkCurrency;

    public VendingMachine(Product[] products, int depositPool, Currency checkCurrency) {
        this.products = products;
        this.depositPool = depositPool;
        this.checkCurrency = checkCurrency;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getDepositPool() {
        return depositPool;
    }

    public void setDepositPool(int depositPool) {
        this.depositPool = depositPool;
    }

    public Currency getCheckCurrency() {
        return checkCurrency;
    }

    public void setCheckCurrency(Currency checkCurrency) {
        this.checkCurrency = checkCurrency;
    }


    @Override
    public void addCurrency(double amount) {
        for (Product product : products) {


        }
    }

    @Override
    public int getBalance() {

        return 0;
    }

    @Override
    public Product request(int id) {
        return null;
    }

    @Override
    public int endSession() {
        products = new Product[]{};
        return 0;
    }

    @Override
    public String getDescription(int id) {
        return null;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }

}
