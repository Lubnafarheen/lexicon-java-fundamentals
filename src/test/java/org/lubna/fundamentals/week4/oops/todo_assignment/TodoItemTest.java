package org.lubna.fundamentals.week4.oops.todo_assignment;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class TodoItemTest {

    @Test
    public void getSummaryOfTodoItems_test() {
        TodoItem todoItem = new TodoItem("Study", "complete a chapter", LocalDate.of(2022, 11, 4), false, new Person("Lubna", "Farheen", "lubna@gmail.com"));
        Assert.assertEquals("TodoItem{id=0, title='Study', taskDescription='complete a chapter', deadline=2022-11-04, done=false, creator=Person{id=1, name='Lubna Farheen', email='lubna@gmail.com'}}", todoItem.toString());
    }
}
