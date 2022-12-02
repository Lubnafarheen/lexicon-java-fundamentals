package org.lubna.fundamentals.week8;

import org.lubna.fundamentals.week8.interfaces.*;

import java.util.Random;

public class LambdaDemo {

    static DoStringStuff concatStrings = (s1, s2) -> s1.concat(s2);
    static IntegerOperator additionOperator = (n1, n2) -> n1 + n2;
    static IntegerOperator subtractionOperator = (n1, n2) -> n1 - n2;
    static DoStringStuff findMax = (s1, s2) -> s1.length() >= s2.length() ? s1 : s2;
    static Printer display = (message) -> System.out.println(message);
    static Conditional isResultPositive = (num) -> num > 0;
    static IntRandomGenerator generateRandom = () -> new Random().nextInt();


    public static void main(String[] args) {
        System.out.println(doStringStuff("Hello ", "Lambda", concatStrings));
        System.out.println(calculationOperator(34, 56, additionOperator));
        System.out.println(calculationOperator(340, 56, subtractionOperator));
        System.out.println(doStringStuff("Hello", "Lambda", findMax));
        display.print("Hey There!");
        System.out.println(isResultPositive.testInt(1));
        System.out.println(generateRandom.generate());

        Calculator performOperations = (n1, n2, operator) -> {
            switch (operator) {
                case "+":
                    return n1 + n2;
                case "-":
                    return n1 - n2;
                case "*":
                    return n1 * n2;
                case "%":
                    return n1 / n2;
                default:
                    return 0;
            }
        };
        double result = performOperations.calculate(2.0, 5.6, "+");
        System.out.println(result);
    }

    public static String doStringStuff(String s1, String s2, DoStringStuff concatOperator) {
        return concatOperator.operate(s1, s2);
    }

    public static Integer calculationOperator(Integer n1, Integer n2, IntegerOperator operator) {
        return operator.apply(n1, n2);
    }
}
