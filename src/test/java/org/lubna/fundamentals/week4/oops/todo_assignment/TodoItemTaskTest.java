package org.lubna.fundamentals.week4.oops.todo_assignment;

import org.junit.Test;
import org.lubna.fundamentals.week4.oops.todo_assignment.model.Person;
import org.lubna.fundamentals.week4.oops.todo_assignment.model.TodoItem;
import org.lubna.fundamentals.week4.oops.todo_assignment.model.TodoItemTask;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TodoItemTaskTest {

    @Test
    public void getSummaryOfTodoItemTask_test() {
        TodoItemTask todoItemTask = new TodoItemTask(true, new TodoItem("Study", "complete a chapter", LocalDate.of(2022, 11, 4), false, new Person("Lubna", "Farheen", "lubna@gmail.com")), new Person("Farheen", "Khan", "farheen@gmail.com"));
        assertEquals("TodoItemTask{id=0, assigned=true, todoItem=TodoItem{id=0, title='Study', taskDescription='complete a chapter', deadline=2022-11-04, done=false, creator=Person{id=0, name='Lubna Farheen', email='lubna@gmail.com'}}, assignee=Person{id=1, name='Farheen Khan', email='farheen@gmail.com'}}", todoItemTask.toString());
    }
}
