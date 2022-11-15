package org.lubna.fundamentals.week4.oops.todo_assignment;

import java.time.LocalDate;

public class TodoAppTest {
    public static void main(String[] args) {
        Person lubna = new Person("Lubna", "Farheen", "lubna@gmail.com");
        System.out.println(lubna.toString());
        System.out.println(lubna.hashCode());

        Person farheen = new Person("Farheen", "Khan", "farheen@gmail.com");
        System.out.println(farheen.toString());

        TodoItem item1 = new TodoItem("Study","complete a chapter", LocalDate.of(2022,11,4), false, lubna);

        TodoItemTask itemTask = new TodoItemTask(true, item1, farheen);
        System.out.println(itemTask.getTodoItem().toString());

        AppUser appUser = new AppUser("Lubna", "lubna1234", AppRole.ROLE_APP_USER);
        AppUser appUser1 = new AppUser("Lubna", "lubna123", AppRole.ROLE_APP_USER);
        System.out.println(appUser.toString());
        System.out.println(appUser.equals(appUser1));
        System.out.println(appUser.hashCode());


    }
}
