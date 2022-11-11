package org.lubna.fundamentals.week5.inheritance.workshopabstractmodel;

import org.lubna.fundamentals.week5.inheritance.workshopservice.CandyVendingMachine;
import org.lubna.fundamentals.week5.inheritance.workshopservice.CandyVendingMachineImpl;

public class CandyVendingachineTestDrive {
    public static void main(String[] args) {
        Product[] products = { new JellyBean(1, 50, "Jelly Beans", 2),
                new LicoriceCandy(2, 200, "LicoriceCandy", "Caramel"),
                new Marshmallow(3, 100, "Marshmallows", "Vegan")
        };

        CandyVendingMachine machine = new CandyVendingMachineImpl(products);
        machine.depositedAmount(1000);
        System.out.println(machine.getBalance());

        machine.buyProduct(3);
        System.out.println(machine.endSession());

        System.out.println(machine.getDescription(1));

        machine.depositedAmount(500);
        machine.buyProduct(2);
        System.out.println(machine.getBalance());


    }

}
