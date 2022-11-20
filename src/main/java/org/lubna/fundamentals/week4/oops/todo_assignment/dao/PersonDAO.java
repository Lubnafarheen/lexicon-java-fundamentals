package org.lubna.fundamentals.week4.oops.todo_assignment.dao;

import org.lubna.fundamentals.week4.oops.todo_assignment.model.Person;

import java.util.List;

public interface PersonDAO {

    Person persist(Person person);

    Person findById(int id);

    Person findByEmail(String email);

    List<Person> findAll();

    void remove(int id);
}
