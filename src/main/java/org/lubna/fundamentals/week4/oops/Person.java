package org.lubna.fundamentals.week4.oops;

import java.util.Arrays;

public class Person {

    //fields
    private static int personIdsequencer ;
    private String firstName;
    private String lastName;
    private static String[] books = {};


    public static String[] getBooks() {
        return books;
    }

    public static void setBooks(String[] books) {
        Person.books = books;
    }

    public String personInformation() {
        return "Person{" +
                "Id='"+ personIdsequencer + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Books='" + books + '\'' +
                '}';
    }



    //constructor
    public Person(int personIdsequencer, String firstName, String lastName){
        this.personIdsequencer = ++personIdsequencer;
        this.firstName = firstName;
        this.lastName = lastName;

    }
    //Setters and Getters
    public static int getPersonIdsequencer() {
        return personIdsequencer;
    }

    public static void setPersonIdsequencer(int personIdsequencer) {
        Person.personIdsequencer = personIdsequencer;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //methods

public String[] loanBook(String book) {
    String[] borrowBook = new String[0];
    for (int i = 0; i <books.length ; i++) {
    if (!books[i].equalsIgnoreCase(book)) {
        System.out.println("This is not available");
    } else {
        borrowBook = Arrays.copyOf(books , books.length + 1);
        borrowBook[borrowBook.length - 1] = book;
    }
}
    books = borrowBook;
    return books;
}



}
