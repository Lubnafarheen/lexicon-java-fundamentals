package org.lubna.fundamentals.week8.anonymous_classesimpl;

import org.lubna.fundamentals.week8.interfaces.DoStringStuff;
import org.lubna.fundamentals.week8.interfaces.IntegerOperator;

public class TestDrive {

    static DoStringStuff concatOperator = new DoStringStuff() {
        @Override
        public String operate(String s1, String s2) {
            return s1.concat(s2);
        }
    };

    static IntegerOperator additionOperation = new IntegerOperator() {
        @Override
        public Integer apply(Integer n1, Integer n2) {
            return n1 + n2;
        }
    };

    static IntegerOperator subtractionOperation = new IntegerOperator() {
        @Override
        public Integer apply(Integer n1, Integer n2) {
            return n1 - n2;
        }
    };

    static DoStringStuff getBiggestString = new DoStringStuff() {
        @Override
        public String operate(String s1, String s2) {
            if (s1.length() > s2.length()) return s1;
            else return s2;
        }
    };

    public static void main(String[] args) {
        ex1();
        System.out.println(doStringStuff("abc", "ehj", concatOperator));
        System.out.println(getBiggestString.operate("Lubna ", "Farheen"));
        System.out.println(doStringStuff("Lubna ", "Farheen", getBiggestString));
        System.out.println(calculationOperator(11, 12, additionOperation));
        System.out.println(subtractionOperation.apply(12, 6));
    }

    public static void ex1() {
        System.out.println(concatOperator.operate("Lubna ", "Farheen"));
        System.out.println(additionOperation.apply(12, 45));
    }

    public static String doStringStuff(String s1, String s2, DoStringStuff concatOperator) {
        return concatOperator.operate(s1, s2);
    }

    public static Integer calculationOperator(Integer n1, Integer n2, IntegerOperator operator) {
        return additionOperation.apply(n1, n2);
    }
}
