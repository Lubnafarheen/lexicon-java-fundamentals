package org.lubna.fundamentals.week5.inheritance.workshopservice;

import org.lubna.fundamentals.week5.inheritance.workshopabstractmodel.Product;

public class CandyVendingMachineImpl implements CandyVendingMachine {
    public static final int[] VALID_DENOMINATIONS = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000 };
    private Product[] products;
    private int depositPool;

    public CandyVendingMachineImpl(Product[] products) {
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
    public void depositedAmount(int amount) {
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
    public Product buyProduct(int id) {
        for (Product product : products) {
            if (product.id() == id) {
                if (product.price() <= depositPool) {
                    depositPool = (int) (depositPool - product.price());
                    return product;
                } else {
                    throw new RuntimeException("Product " + product.productName() + " is too expensive");
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
            if (id == product.id()) {
                return product.use();
            }
        }
        return "This product is not available!";
    }

    @Override
    public String[] getProducts() {
        String[] productsAsString = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productsAsString[i] = products[i].examine();
        }
        return productsAsString;
    }
}
