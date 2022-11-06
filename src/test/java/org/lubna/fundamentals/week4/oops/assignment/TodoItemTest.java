package org.lubna.fundamentals.week4.oops.assignment;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class TodoItemTest {

    @Test
    public void TodoItemConstructor_test() {
        TodoItem todoItem = new TodoItem("Study", "complete a chapter", LocalDate.of(2022, 11, 4), false, new Person("Lubna", "Farheen", "lubna@gmail.com"));
        Assert.assertEquals("Study", todoItem.getTitle());
        Assert.assertEquals("complete a chapter", todoItem.getTaskDescription());
        Assert.assertEquals(2022-11-04, todoItem.getDeadline());
        Assert.assertEquals("false", todoItem.isDone());
        Assert.assertEquals("new Person(1, Lubna Farheen, lubna@gmail.com)", todoItem.getCreator());
    }

    @Test
    public void getSummaryOfTodoItems_test() {
        TodoItem todoItem = new TodoItem("Study", "complete a chapter", LocalDate.of(2022, 11, 4), false, new Person("Lubna", "Farheen", "lubna@gmail.com"));
        Assert.assertEquals("TodoItem{id=1, title='Study', taskDescription='complete a chapter', deadline=2022-11-04, done=false, creator=Person{id=1, name='Lubna Farheen', email='lubna@gmail.com'}}", todoItem.getSummaryOfTodoItems());
    }
}
