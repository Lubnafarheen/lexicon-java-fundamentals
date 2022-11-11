package org.lubna.fundamentals.week5.service;

import org.lubna.fundamentals.week5.model.Product;

import java.util.Arrays;

public class VendingMachine implements IVendingMachine {

    public static final int[] VALID_DENOMINATIONS = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000 };
    private Product[] products;
    private int depositPool;

    public VendingMachine(Product[] products) {
        this.products = products;
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

    @Override
    public void addCurrency(int amount) {
        for (int validDenomination : VALID_DENOMINATIONS) {
            if (validDenomination == amount) {
                depositPool += amount;
            }
        }
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                if (product.getPrice() <= depositPool) {
                    depositPool = (int) (depositPool - product.getPrice());
                    return product;
                } else {
                    throw new RuntimeException("Product " + product.getProductName() + " is too expensive");
                }
            }
        }
        throw new RuntimeException("Could not find Product with id " + id);
    }

    @Override
    public int endSession() {
        int temp = depositPool;
        depositPool = 0;
        return temp;

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
        for (Product product : products)
            if (product.getProductName() != null)
                return new String[]{ product.examine() };
        return new String[0];
    }
}

