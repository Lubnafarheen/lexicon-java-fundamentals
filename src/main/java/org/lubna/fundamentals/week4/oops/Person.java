package org.lubna.fundamentals.week4.oops;

import java.util.Arrays;

public class Person {

    private static int personIdSequencer;

    static {
        personIdSequencer = 1;
    }

    private final int id;
    private final String firstName;
    private final String lastName;
    private Book[] books = new Book[]{};

    public Person(String firstName , String lastName) {
        this.id = personIdSequencer++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setBorrowedBy(this);
            book.setAvailable(false);

            Book[] temp = Arrays.copyOf(books , books.length + 1);
            temp[temp.length - 1] = book;
            books = temp;

            return true;
        }
        return false;
    }

    public void returnBook(Book bookToRemove) {
        int borrowedBookIndex = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equalsIgnoreCase(bookToRemove.getTitle())) {
                borrowedBookIndex = i;
                break;
            }
        }
        books[borrowedBookIndex].setAvailable(true);
        int counter = 0;
        Book[] temp = new Book[books.length - 1];
        for (int i = 0; i < books.length; i++) {
            if (i == borrowedBookIndex) {
                continue;
            }
            temp[counter++] = books[i];
        }
        books = temp;
    }

    public void displayBorrowedBooks() {
        for (Book book : books) {
            System.out.println(book.bookInformation());
        }
    }

    public String personInformation() {
        return "Person{" +
                "Id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
