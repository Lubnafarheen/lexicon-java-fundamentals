package org.lubna.fundamentals.week4.oops.assignment;

import java.time.LocalDate;

public class TodoAppTest {
    public static void main(String[] args) {
        Person lubna = new Person("Lubna", "Farheen", "lubna@gmail.com");
        System.out.println(lubna.getSummary());

        Person farheen = new Person("Farheen", "Khan", "farheen@gmail.com");
        System.out.println(farheen.getSummary());

        TodoItem item1 = new TodoItem("Study","complete a chapter", LocalDate.of(2022,11,04), false, lubna);

        TodoItemTask itemTask = new TodoItemTask(true, item1, farheen);
        System.out.println(itemTask.getTodoItem().getSummaryOfTodoItems());
    }
}
