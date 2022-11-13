package org.lubna.fundamentals.week4.oops.practisecode;

public class Book {
    private final String title;
    private final String author;
    private boolean available;
    private Person borrowedBy;

    public Book(String title , String author) {
        this.available = true;
        this.title = title;
        this.author = author;
    }

    public String getOwnerInformation() {
        if (borrowedBy != null) {
            return borrowedBy.personInformation();
        }
        return null;
    }

    public void setBorrowedBy(Person person) {
        this.borrowedBy = person;
    }

    public String bookInformation() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Person getBorrowedBy(Person person) {
        return borrowedBy;
    }

}
