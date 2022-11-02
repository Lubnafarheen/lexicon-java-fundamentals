package org.lubna.fundamentals.week4.oops;

import java.util.Arrays;

public class Book {
    public static int count;
    private String title;
    private String author;
    private boolean available;
    private Person owner;

    public Book(String title,  String author ) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                '}';
    }
    public String getOwnerInformation() {
        if (owner != null) {
            return owner.personInformation();
        } else {
            return null;
        }
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = true;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

}
