package org.lubna.fundamentals.week4.oops;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person(01, "Nusayba", "Tanzeem");
        System.out.println(person1.toString());

Book book1 = new Book("Harry potter", "JK Rowling");
        Book book2 = new Book("Harry", " Rowling");

        System.out.println(book1.toString());
        person1.loanBook("Harry potter");
        System.out.println(book1);

    }



}
