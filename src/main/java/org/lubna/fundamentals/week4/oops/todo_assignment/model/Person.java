package org.lubna.fundamentals.week4.oops.todo_assignment.model;

import java.util.Objects;

public class Person {
    private static int personIdSequencer;

    static {
        personIdSequencer = 1;
    }

    private int id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private AppUser credentials;

    public Person(String firstName, String lastName, String email) {
        this.id = personIdSequencer++;
        ;

        validateInput("firstName", firstName);
        this.firstName = firstName;

        validateInput("lastName", lastName);
        this.lastName = lastName;

        validateInput("email", email);
        this.email = email;
    }

    private void validateInput(String fieldName, String input) {
        if (input == null)
            throw new IllegalArgumentException(fieldName + " must be non null");
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }
}
