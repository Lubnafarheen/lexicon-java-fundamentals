package org.lubna.fundamentals.week4.oops.todo_assignment.dao;

import org.lubna.fundamentals.week4.oops.todo_assignment.model.TodoItem;

import java.time.LocalDate;
import java.util.List;

public interface TodoItemDAO {

    TodoItem persist(TodoItem todoItem);

    TodoItem findById(int id);

    List<TodoItem> findAll();

    List<TodoItem> findAllByDoneStatus(boolean done);

    List<TodoItem> findByTitleContains(String title);

    List<TodoItem> findByDeadlineBefore(LocalDate date);

    List<TodoItem> findByDeadlineAfter(LocalDate date);

    void remove(int id);
}
