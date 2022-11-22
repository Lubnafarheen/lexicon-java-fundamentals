package org.lubna.fundamentals.week6.collections;

import java.util.Set;
import java.util.TreeSet;

public class CollectionChallengeFour {
    public static void main(String[] args) {
        int[] numbers = {1,4,4,2,6,7};
        Set<Integer> listOfNumbers = new TreeSet<Integer>();
        for (int i : numbers) listOfNumbers.add(i);
        System.out.println(listOfNumbers);
    }
}
