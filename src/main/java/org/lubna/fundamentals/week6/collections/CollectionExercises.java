package org.lubna.fundamentals.week6.collections;

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
        System.out.println(fruits);

        List<String> arrayList = new ArrayList<>(fruits);
        Collections.sort(arrayList);
        System.out.println(arrayList);

    }

    public static void ex8() {
        Set<String> names = new HashSet<>();
        names.add("a");
        names.add("z");
        names.add("m");
        names.add("r");
        names.add("t");
        TreeSet<String> treeSet = new TreeSet<String>(names);
        System.out.println(treeSet);
    }

    public static void ex9() {
        Map<Integer, String> cars = new HashMap<>();
        cars.put(1, "Ford");
        cars.put(2, "BMW");
        cars.put(3, "Mercedes");
        cars.put(4, "Toyota");

        for (Map.Entry entry : cars.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void ex10(){
        Map<Integer, String> cars = new HashMap<>();
        cars.put(1, "Ford");
        cars.put(2, "BMW");
        cars.put(3, "Mercedes");
        cars.put(4, "Toyota");

        for (Map.Entry entry : cars.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void ex11(){
        Map<Integer, String> cars = new HashMap<>();
        cars.put(1, "Ford");
        cars.put(2, "BMW");
        cars.put(3, "Mercedes");
        cars.put(4, "Toyota");

        for (Map.Entry entry : cars.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public static void ex12(){
        Map<Integer, Car> cars = new HashMap<>();
        cars.put(1, new Car(1, "Ford","2012"));
        cars.put(2, new Car(2, "Toyota","2012"));
        System.out.println(cars.get(2));
    }


}




