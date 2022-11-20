package org.lubna.fundamentals.week4.oops.todo_assignment.dao;

import org.lubna.fundamentals.week4.oops.todo_assignment.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOCollection implements PersonDAO {
    private final List<Person> personList;

    public PersonDAOCollection() {
        personList = new ArrayList<>();
    }

    @Override
    public Person persist(Person person) {
        if (person == null) System.out.println("Person was null");
        personList.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        for (Person person : personList)
            if (person.getId() == id)
                return person;
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        for (Person person : personList)
            if (person.getEmail().equalsIgnoreCase(email))
                return person;
        return null;
    }

    @Override
    public List<Person> findAll() {
        return personList;
    }

    @Override
    public void remove(int id) {
        personList.removeIf(person -> person.getId() == id);
    }
}
