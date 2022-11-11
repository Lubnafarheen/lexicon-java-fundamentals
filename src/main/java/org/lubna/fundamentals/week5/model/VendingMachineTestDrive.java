package org.lubna.fundamentals.week5.model;

import org.lubna.fundamentals.week5.service.IVendingMachine;
import org.lubna.fundamentals.week5.service.VendingMachine;

public class VendingMachineTestDrive {
    public static void main(String[] args) {
        Product[] products = { new Candy(), new Godis(), new Marshmallows() };

        IVendingMachine candyVendingMachine = new VendingMachine(products);

       /* for (String string : candyVendingMachine.getProducts()) {
            System.out.println(string);
*/
        candyVendingMachine.depositedAmount(20);
        candyVendingMachine.depositedAmount(10);
        System.out.println(candyVendingMachine.getBalance());

        candyVendingMachine.buyProduct(1);

        System.out.println(candyVendingMachine.endSession());

        System.out.println(candyVendingMachine.getBalance());

        System.out.println(candyVendingMachine.getDescription(3));
    }
}
