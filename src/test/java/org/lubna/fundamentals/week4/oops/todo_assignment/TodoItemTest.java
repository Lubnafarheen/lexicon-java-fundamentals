package org.lubna.fundamentals.week4.oops.todo_assignment;

import org.junit.Assert;
import org.junit.Test;
import org.lubna.fundamentals.week4.oops.todo_assignment.model.Person;
import org.lubna.fundamentals.week4.oops.todo_assignment.model.TodoItem;

import java.time.LocalDate;

public class TodoItemTest {

    @Test
    public void getSummaryOfTodoItems_test() {
        TodoItem todoItem = new TodoItem("Study", "complete a chapter", LocalDate.of(2022, 11, 4), false, new Person("Lubna", "Farheen", "lubna@gmail.com"));
        Assert.assertEquals("TodoItem{id=1, title='Study', taskDescription='complete a chapter', deadline=2022-11-04, done=false}", todoItem.toString());
    }
}
