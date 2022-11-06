package org.lubna.fundamentals.week4.oops.assignment;

public class Person {
    private static int personIdSequencer;

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(String firstName, String lastName, String email) {
        this.id = ++personIdSequencer;

        validateInput("firstName", firstName);
        this.firstName = firstName;

        validateInput("lastName", lastName);
        this.lastName = lastName;

        validateInput("email", email);
        this.email = email;
    }

    public String getSummary() {
        return "Person{" +
                "id=" + id +
                ", name='" + firstName + " " + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private void validateInput(String fieldName, String input) {
        if (input == null)
            throw new IllegalArgumentException(fieldName + " must be non null");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
