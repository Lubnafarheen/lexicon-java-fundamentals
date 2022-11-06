package org.lubna.fundamentals.week4.oops.assignment;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TodoItemTaskTest {

    @Test
    public void TodoItemTaskConstructor_Test() {
        TodoItemTask todoItemTask = new TodoItemTask(true, new TodoItem("Study", "complete a chapter", LocalDate.of(2022, 11, 4), false, new Person("Lubna", "Farheen", "lubna@gmail.com")), new Person("Farheen", "Khan", "farheen@gmail.com"));
        assertTrue(todoItemTask.isAssigned());
        assertEquals("TodoItem{id=1, title='Study', taskDescription='complete a chapter', deadline=2022-11-04, done=false, creator=Person{id=1, name='Lubna Farheen', email='lubna@gmail.com'}}", todoItemTask.getTodoItem().getSummaryOfTodoItems());
        assertEquals("Person{id=2, name='Farheen Khan', email='farheen@gmail.com'}", todoItemTask.getAssignee().getSummary());
    }

    @Test
    public void getSummaryOfTodoItemTask_test() {
        TodoItemTask todoItemTask = new TodoItemTask(true, new TodoItem("Study", "complete a chapter", LocalDate.of(2022, 11, 4), false, new Person("Lubna", "Farheen", "lubna@gmail.com")), new Person("Farheen", "Khan", "farheen@gmail.com"));
        assertEquals("TodoItemTask{id=1, assigned=true, todoItem=TodoItem{id=1, title='Study', taskDescription='complete a chapter', deadline=2022-11-04, done=false, creator=Person{id=1, name='Lubna Farheen', email='lubna@gmail.com'}}, assignee=Person{id=2, name='Farheen Khan', email='farheen@gmail.com'}}", todoItemTask.getSummaryOfTodoItemTask());
    }
}
