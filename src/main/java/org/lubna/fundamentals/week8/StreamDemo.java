package org.lubna.fundamentals.week8;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "user1", "Anna", LocalDate.parse("2022-12-02"), false));
        personList.add(new Person(2, "user2", "Lund", LocalDate.parse("2022-12-03"), false));
        personList.add(new Person(3, "user3", "Ebba", LocalDate.parse("2022-12-05"), false));
        personList.add(new Person(4, "user4", "John", LocalDate.parse("2022-12-07"), false));

        Predicate<Person> isLeapYear = person -> person.getBirthDate().isLeapYear();
        Consumer<Person> printPersonInfo = person -> System.out.println(person.toString());
        personList.stream()
                .filter(person -> person.getLastName().startsWith("E"))
                .forEach(printPersonInfo);
        ex9();
    }

    public static void ex1() {
        Stream<String> languages = Stream.of("Java", "JavaScript", "C++", "Python");
        long result = languages.count();
        System.out.println(result);
    }

    public static void ex2() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 89, 100);
        Optional<Integer> maxNumber = numbers.stream().max((o1, o2) -> o1.compareTo(o2));
        Optional<Integer> minNumber = numbers.stream().min((o1, o2) -> o1.compareTo(o2));
        if (maxNumber.isPresent()) {
            System.out.println(maxNumber.get());
        } else {
            System.out.println("no max number");
        }

        if (minNumber.isPresent()) {
            System.out.println(minNumber.get());
        } else {
            System.out.println("no min number");
        }


    }

    public static void ex3() {
        List<String> names = Arrays.asList("Erik", "John", "Mona", "Simon", "Elsa");
        Optional<String> findFirstName = names.stream().findFirst();
        if (findFirstName.isPresent())
            System.out.println(findFirstName.get());
    }

    public static void ex4(){
        List<String> names = Arrays.asList("Erik", "John", "Mona", "Simon", "Elsa");
        Predicate<String> checkLength = name -> name.length() > 2;
        System.out.println(names.stream().allMatch(checkLength));
        System.out.println(names.stream().noneMatch(checkLength));
        System.out.println(names.stream().anyMatch(checkLength));
    }

    public static void ex5(){
        List<String> names = Arrays.asList("Erik", "John", "Mona", "Simon", "Elsa");
        List<String> filteredName = names.stream()
                .filter(n -> n.startsWith("M"))
                .collect(Collectors.toList());
        //COLLECT AS A LIST AND PRINT
        filteredName.forEach(n -> System.out.println(n));
    }
    public static void ex6(){
        List<String> names = Arrays.asList("Erik", "John", "Mona", "Simon", "Elsa");
        names.stream()
                .filter(n -> n.startsWith("M"))
                .filter(n -> n.endsWith("A"))
                .forEach(s -> System.out.println(s));
    }

    public static void ex7(){
        Stream<Integer> integerStream = Stream.iterate(1, integer -> integer +1);
        integerStream.limit(20).forEach(System.out::println);
    }

    public static void ex8(){
        List<String> names = Arrays.asList("Erik", "John", "Mona", "Simon", "Elsa");
        names.stream().skip(2).limit(2).forEach(System.out::println);
    }

    public static void ex9(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "user1", "Anna", LocalDate.parse("2022-12-02"), false));
        personList.add(new Person(2, "user2", "Lund", LocalDate.parse("2022-12-03"), false));
        personList.add(new Person(3, "user3", "Ebba", LocalDate.parse("2022-12-05"), false));
        personList.add(new Person(4, "user4", "John", LocalDate.parse("2022-12-07"), false));

        personList.stream().sorted(Comparator.comparing(Person::getBirthDate)).forEach(System.out::println);
    }

}
