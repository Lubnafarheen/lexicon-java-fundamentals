package org.lubna.fundamentals.week6.collections;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class CollectionExercises {
    public static void main(String[] args) {
        ex7();
    }

    public static void ex1() {
        ArrayList<String> days = new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        System.out.println(days);
    }

    public static void ex2() {
        ArrayList<String> days = new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        for (String day : days) {
            System.out.println(day);

        }
    }

    public static void ex3() {
        ArrayList<String> days = new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Friday");
        days.add("Saturday");
        days.add(4, "Thursday");
        System.out.println(days);
    }

    public static void ex4() {
        ArrayList<String> days = new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        ArrayList<String> sublistOfDays = new ArrayList<>();
        sublistOfDays.add(days.get(0));
        sublistOfDays.add(days.get(1));
        sublistOfDays.add(days.get(2));

        System.out.println(sublistOfDays);
    }

    public static void ex5() {
        Set<String> daysOfTheWeek = new HashSet<String>();
        daysOfTheWeek.add("Sunday");
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");

        Iterator<String> iterator = daysOfTheWeek.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void ex6() {
        Set<String> daysOfTheWeek = new HashSet<>();
        daysOfTheWeek.add("Sunday");
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        ArrayList<String> arrayList = new ArrayList<>(daysOfTheWeek);
        System.out.println(arrayList);
    }

    public static void ex7() {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Grapes");
        fruits.add("Banana");

        List<String> arrayList = new ArrayList<>(fruits);
        System.out.println(arrayList);
    }

}




