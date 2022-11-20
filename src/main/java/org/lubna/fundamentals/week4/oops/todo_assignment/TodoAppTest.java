package org.lubna.fundamentals.week4.oops.todo_assignment;

import org.lubna.fundamentals.week4.oops.todo_assignment.dao.*;
import org.lubna.fundamentals.week4.oops.todo_assignment.model.*;

import java.time.LocalDate;

public class TodoAppTest {

    public static void main(String[] args) {
        Person lubna = new Person("Lubna", "Farheen", "lubna@gmail.com");
        Person farheen = new Person("Farheen", "Khan", "farheen@gmail.com");

        TodoItem item1 = new TodoItem("Study", "complete a chapter", LocalDate.of(2022, 12, 4), false, lubna);
        TodoItem item2 = new TodoItem("Walk", "A walk for 20 minutes everyday", LocalDate.of(2022, 12, 20), false, lubna);
        TodoItemTask itemTask1 = new TodoItemTask(true, item1, farheen);
        TodoItemTask itemTask2 = new TodoItemTask(false, item2, lubna);

        AppUser appUser = new AppUser("Lubna", "lubna1234", AppRole.ROLE_APP_USER);
        AppUser appUser1 = new AppUser("Lubna Farheen", "lubna123", AppRole.ROLE_APP_USER);

        AppUserDAO appUserDAO = new AppUserDaoCollection();
        appUserDAO.persist(appUser);
        appUserDAO.persist(appUser1);
        System.out.println(appUserDAO.findAll());
        appUserDAO.remove("Lubna");
        System.out.println(appUserDAO.findAll());
        System.out.println("-----");

        PersonDAO person1 = new PersonDAOCollection();
        person1.persist(lubna);
        person1.persist(farheen);
        System.out.println(person1.findAll());
        System.out.println(person1.findById(1));
        person1.remove(1);
        System.out.println(person1.findAll());
        System.out.println("-----");

        TodoItemDAO itemDAO = new TodoItemDAOCollection();
        itemDAO.persist(item1);
        itemDAO.persist(item2);
        System.out.println(itemDAO.findAll());
        System.out.println(itemDAO.findByDeadlineBefore(LocalDate.of(2022, 12, 12)));
        System.out.println(itemDAO.findByTitleContains("Study"));
        System.out.println("-----");

        TodoItemTaskDAO itemTaskDAO = new TodoItemTaskDAOCollection();
        itemTaskDAO.persist(itemTask1);
        itemTaskDAO.persist(itemTask2);
        System.out.println(itemTaskDAO.findAll());
        System.out.println(itemTaskDAO.findById(2));
        System.out.println(itemTaskDAO.findByAssignedStatus(true));
    }
}
