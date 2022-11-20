package org.lubna.fundamentals.week4.oops.todo_assignment.dao;

import org.lubna.fundamentals.week4.oops.todo_assignment.model.TodoItemTask;

import java.util.List;

public interface TodoItemTaskDAO {

    TodoItemTask persist(TodoItemTask todoItemTask);

    TodoItemTask findById(int id);

    List<TodoItemTask> findAll();

    List<TodoItemTask> findByAssignedStatus(boolean status);

    void remove(int id);
}
