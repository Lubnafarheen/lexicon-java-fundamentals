package org.lubna.fundamentals.week6.collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionChallengeOne {
    public static void main(String[] args) {
        Set<String> days = new HashSet<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        System.out.println("Days of the week : " + days);

        Set<String> weekends = new HashSet<>();
        weekends.add("Saturday");
        weekends.add("Sunday");
        System.out.println("Weekends: " + weekends);

        days.retainAll(weekends);

        System.out.println(days);
    }
}


