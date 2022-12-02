package org.lubna.fundamentals.week8.anonymous_classesimpl;

import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ex1();

    }
    public static void ex1(){
        Stream<String> lang = Stream.of("hindi","urdu", "english");
        System.out.println(lang.count());
    }
}
