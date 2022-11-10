package org.lubna.fundamentals.week5.service;

import org.lubna.fundamentals.week5.model.Currency;
import org.lubna.fundamentals.week5.model.Product;

public class VendingMachine implements IVendingMachine {

    private Product[] products;
    private Currency depositPool;

    public VendingMachine(Product[] products, Currency depositPool) {
        this.products = products;
        this.depositPool = depositPool;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Currency getDepositPool() {
        return depositPool;
    }

    public void setDepositPool(Currency depositPool) {
        this.depositPool = depositPool;
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
        for (Product product : products) {
            if (id == product.getId()) {
                return product;
            }
        }
        return null;
    }

    @Override
    public int endSession() {
        products = new Product[]{};
        return 0;
    }

    @Override
    public String getDescription(int id) {
        for (Product product : products) {
            if (id == product.getId()) {
                return product.use();
            }
        }
        return "This product is not available!";
    }

    @Override
    public String[] getProducts() {
        for (Product product : products) {
                if(product.getProductName()!= null){
            }
        }

        return new String[0];
    }

}
