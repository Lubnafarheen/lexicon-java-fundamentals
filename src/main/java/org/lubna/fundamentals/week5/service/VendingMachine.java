package org.lubna.fundamentals.week5.service;

import org.lubna.fundamentals.week5.model.Product;

import java.util.Arrays;

public class VendingMachine implements IVendingMachine {

    private Product[] products;
    private int depositPool;
    private double money;

    public VendingMachine(Product[] products, int depositPool) {
        this.products = products;
        this.depositPool = depositPool;
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

    public void addProducts(Product[] products) {
        for (Product product : products) {
            Product[] temp = Arrays.copyOf(products, products.length + 1);
            temp[temp.length - 1] = product;
            products = temp;
        }
    }

    @Override
    public int addCurrency(double amount) {

        return 0;
    }

    @Override
    public int getBalance() {
        for (int i = 0, productsLength = products.length; i < productsLength; i++) {
            Product product = products[i];
            if (product.getPrice() == money) {
                System.out.println("Enjoy your product!");
                break;
            } else if (money > product.getPrice()) {
                int total = (int) (money - product.getPrice());
                return total;
            } else if (money < product.getPrice()) {
                System.out.println("Insufficient amount to buy this product");
                break;
            }
        }
        return depositPool;
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
        for (Product product : products)
            if (product.getProductName() != null)
                return new String[]{ product.examine() };
        return new String[0];
    }
}

