package org.lubna.fundamentals.week6.collections;


import java.util.*;

public class CollectionPractise {

    public static void main(String[] args) {
        hashMapExample();
    }

    public static void example1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(14);
        numbers.add(156);
        numbers.add(143);
        System.out.println(numbers.size());
        System.out.println("index[0]=" + numbers.get(0));
        System.out.println("index[1]=" + numbers.get(1));
        System.out.println("index[2]=" + numbers.get(2));
        System.out.println("index[3]=" + numbers.get(3));


        //remove element

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer currentElement = iterator.next();
            if (currentElement == 14) {
                iterator.remove();
            }
        }
        System.out.println(numbers.size());


        //or this way

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 143) {
                numbers.remove(numbers.get(i));
            }
        }
        System.out.println(numbers.size());

        for (Integer elements : numbers) {
            System.out.println(elements);
        }


    }

    public static void example2() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(14);
        numbers.add(156);
        numbers.add(143);

        boolean isRemovable = numbers.remove(new Integer(156));
        Integer removeIndex = numbers.remove(0);

        System.out.println(numbers.size());
    }

    public static void example3() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Polestar");
        cars.add("Tesla");

        ArrayList<String> sportsCar = new ArrayList<>();
        sportsCar.add("Ferrari");
        sportsCar.add("Ford");

        cars.addAll(sportsCar);

        Collections.sort(cars);

        for (String car : cars) {
            System.out.println(car);

        }
    }

    public static void example4() {
        List<String> names = new ArrayList<>();
        names.add("Addu");
        names.add("Inara");
        names.add("Elena");
        names.add("peter");
        names.add("camilla");

        Collections.sort(names);
        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
        System.out.println(names);

        //reverse an array
        Collections.sort(names, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        System.out.println(names);
    }

    public static void example5() {
        String test1 = "Test";
        String test2 = "Test";
        test1 = "ABC";
        boolean result = test1.equals(test2);
        System.out.println(result);

        Person person1 = new Person(1, "Caddy");
        Person person2 = new Person(1, "Caddy");
        System.out.println(person1 + "  " + person2);
        boolean results = person1.equals(person2);
        System.out.println(results);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }

    public static void example6() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Anita"));
        people.add(new Person(4, "Alfred"));
        people.add(new Person(3, "emma"));
        people.add(new Person(2, "George"));
        people.add(new Person(5, "Ulf"));

        //sort by Id
        Collections.sort(people);
        for (Person person : people) {
            System.out.println(person.getId() + " " + person.getName());
        }

        System.out.println("------------------");

        //sort by name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Person person : people) {
            System.out.println(person.getId() + " " + person.getName());
        }

    }

    public static void hashSetExample() {
        Set<String> countries = new HashSet<>();
        countries.add("Pakistan");
        countries.add("pakistan");
        countries.add("India");
        System.out.println(countries);

        Set<Person> hashSet = new HashSet<>();
        hashSet.add(new Person(1, "Person1"));
        hashSet.add(new Person(2, "Person2"));
        hashSet.add(new Person(3, "Person3"));
        hashSet.add(new Person(1, "Person1"));
        System.out.println(hashSet);
    }

    public static void example7() {
        List<String> strings = Arrays.asList("A", "B", "C", "D");
        System.out.println(strings);
    }

    public static void treeSetExample() {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(19);
        treeSet.add(25);
        treeSet.add(8);

        System.out.println(treeSet);
    }

    public static void hashMapExample() {
        Map<String, String> details = new HashMap<>();
        details.put("Leena", "leena@gmail.com");
        details.put("eena", "eena@gmail.com");

        System.out.println(details.get("eena"));

        for (Map.Entry print : details.entrySet()) {
            System.out.println(print.getKey() + " " + print.getValue());
        }
    }
}
