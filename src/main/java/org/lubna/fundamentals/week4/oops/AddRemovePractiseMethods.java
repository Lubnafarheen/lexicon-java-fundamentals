package org.lubna.fundamentals.week4.oops;

import java.util.Arrays;

public class AddRemovePractiseMethods {

    private static String[] fruits = {};

    public static void main(String[] args) {
        AddRemovePractiseMethods test = new AddRemovePractiseMethods();

        String[] fruitNames = { "Mango" , "kiwi" , "banana" };
        test.setFruitNames(fruitNames);

        test.add("litchi");
        test.add("grapes");
        System.out.println(test.getSize());
        System.out.println(Arrays.toString(test.findAll()));

        test.removefruits("kiwi");
        System.out.println(test.getSize());
        System.out.println(Arrays.toString(test.findAll()));

        test.removefruits("Mango");
        System.out.println(test.getSize());
        System.out.println(Arrays.toString(test.findAll()));
    }

    public boolean add(String fruitName) {
        String[] temp = new String[0];
        for (String fruitname : fruits) {
            if (fruitname.equalsIgnoreCase(fruitName)) {
                return false;
            } else {
                temp = Arrays.copyOf(fruits , fruits.length + 1);
                temp[temp.length - 1] = fruitName;
            }
        }
        fruits = temp;
        return true;
    }

    public void removefruits(String fruitName) {
        int index = -1;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(fruitName)) {
                index = i;
                break;
            }
        }
        String[] temp = new String[fruits.length - 1];
        int counter = 0;
        for (int i = 0; i < fruits.length; i++) {
            if (i == index) {
                continue;
            }
            temp[counter++] = fruits[i];
        }
        fruits = temp;
    }

    public int getSize() {
        return fruits.length;
    }

    public void setFruitNames(String[] fruits) {
        AddRemovePractiseMethods.fruits = fruits;
    }

    public String[] findAll() {
        return fruits;
    }
}






