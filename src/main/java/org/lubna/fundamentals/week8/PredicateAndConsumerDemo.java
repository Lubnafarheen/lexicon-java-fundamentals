package org.lubna.fundamentals.week8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerDemo {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = (number) -> number > 0;
        boolean result = isPositive.test(2);
        System.out.println(result);

        Predicate<Integer> isGraterThanTen = (number) -> number > 10;
        Predicate<Integer> isLessThan20 = (number) -> number < 20;

        Predicate<Person> isLeapYear = person -> person.getBirthDate().isLeapYear();
        Person person = new Person(
                1,
                "Test",
                "Test",
                LocalDate.parse("2020-01-01"),
                true);
        System.out.println(isLeapYear.test(person));
        System.out.println(isGraterThanTen.and(isLessThan20).test(2));

        Consumer<String> printMessage = (s) -> System.out.println(s);
        printMessage.accept("Hello");

        Consumer<Person> printPersonInfo = (person1) -> System.out.println(person1.getFirstName() + " " + person1.getLastName());
        printPersonInfo.accept(person);


        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Lubna", "Farheen", LocalDate.parse("2020-01-01"), false));
        personList.add(new Person(2, "Kate", "Andersson", LocalDate.parse("2020-06-02"), false));
        personList.add(new Person(3, "Emil", "Berg", LocalDate.parse("2020-05-23"), false));
        personList.add(new Person(4, "Lisa", "Johnnson", LocalDate.parse("2020-09-19"), false));

        personList.forEach((person1) -> System.out.println(person1.getFirstName() + " " + person1.getLastName()));

        personList.forEach(p -> p.setActive(true));
        personList.forEach(p -> System.out.println(p.toString()));

    }
}
