package org.lubna.fundamentals.week4.oops.todo_assignment.model;

import java.util.Objects;

public class AppUser {

    private final String username;
    private final String password;
    private AppRole role;


    // full constructor - findById
    // constructor without id -  - create

    public AppUser(String username, String password, AppRole role) {

        validateInput("Username", username);
        this.username = username;

        validateInput("Password", password);
        this.password = password;

        this.role = role;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        AppUser appUser = (AppUser) object;
        return Objects.equals(username, appUser.username) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }

    private void validateInput(String fieldName, String input) {
        if (input == null)
            throw new IllegalArgumentException(fieldName + " must be non null");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role == null) throw new IllegalArgumentException("must not be null");
        this.role = role;
    }
}
