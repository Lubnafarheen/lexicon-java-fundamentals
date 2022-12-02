package org.lubna.fundamentals.week8;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionIAndSupplierIDemo {
    public static void main(String[] args) {
        String[] words = { "I", "Love", "Java" };
        Function<String[], String> convertArrayToString = (s) -> {
            String sentence = "";
            for (String word : s) {
                sentence += word;
            }
            return sentence;
        };
        System.out.println(convertArrayToString.apply(words));

        Function<Person, String> getPersonDetails = (person -> person.getFirstName() + " " + person.getLastName());
        Person person = new Person(1, "Lubna", "Farheen", LocalDate.parse("2020-01-01"), false);
        System.out.println(getPersonDetails.apply(person));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Lubna", "Farheen", LocalDate.parse("2020-01-01"), false));
        personList.add(new Person(2, "Kate", "Andersson", LocalDate.parse("2020-06-02"), false));
        personList.add(new Person(3, "Emil", "Berg", LocalDate.parse("2020-05-23"), false));
        personList.add(new Person(4, "Lisa", "Johnnson", LocalDate.parse("2020-09-19"), false));

        List<String> fullNames = new ArrayList<>();
        for (Person list : personList) {
            String names = getPersonDetails.apply(list);
            fullNames.add(names);
        }
        fullNames.forEach(name -> System.out.println(name));

        //Unary
        Function<String, String> toLowerCase = (s) -> s.toLowerCase();
        UnaryOperator<String> capitals = (s) -> s.toUpperCase();
        System.out.println(toLowerCase.apply("ERTGUY"));
        System.out.println(capitals.apply("bnht"));


        //Supplier Interface
        Supplier<Double> randomValue = () -> Math.random();
        Supplier<String> randomUUID = () -> UUID.randomUUID().toString();
        System.out.println(randomUUID.get());
        System.out.println(randomValue.get());
        // System.out.println(takeDecimalInputs.get());
    }

    static Supplier<Double> takeDecimalInputs = () -> {
        double number = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            try {
                number = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Number is not valid!");
            }
        }
        return number;
    };
}
