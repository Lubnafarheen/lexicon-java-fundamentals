package org.lubna.fundamentals.week4.oops.todo_assignment.dao;

import org.lubna.fundamentals.week4.oops.todo_assignment.model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoItemDAOCollection implements TodoItemDAO {

    private final List<TodoItem> todoItems;

    public TodoItemDAOCollection() {
        todoItems = new ArrayList<>();
    }

    @Override
    public TodoItem persist(TodoItem todoItem) {
        if (todoItem == null) System.out.println("TodoItem was null");
        todoItems.add(todoItem);
        return todoItem;
    }

    @Override
    public TodoItem findById(int id) {
        for (TodoItem todoItem : todoItems)
            if (todoItem.getId() == id)
                return todoItem;
        return null;
    }

    @Override
    public List<TodoItem> findAll() {
        return todoItems;
    }

    @Override
    public List<TodoItem> findAllByDoneStatus(boolean done) {
        List<TodoItem> newList = new ArrayList<>();
        for (TodoItem todoItem : todoItems) {
            if (todoItem.isDone() == done)
                newList.add(todoItem);
        }
        return newList;
    }

    @Override
    public List<TodoItem> findByTitleContains(String title) {
        List<TodoItem> newList = new ArrayList<>();
        for (TodoItem todoItem : todoItems) {
            if (todoItem.getTitle().equalsIgnoreCase(title))
                newList.add(todoItem);
        }
        return newList;
    }

    @Override
    public List<TodoItem> findByDeadlineBefore(LocalDate date) {
        List<TodoItem> newList = new ArrayList<>();
        for (TodoItem todoItem : todoItems) {
            if (todoItem.getDeadline().isBefore(date)) {
                newList.add(todoItem);
            }
        }
        return newList;
    }

    @Override
    public List<TodoItem> findByDeadlineAfter(LocalDate date) {
        List<TodoItem> newList = new ArrayList<>();
        for (TodoItem todoItem : todoItems) {
            if (todoItem.getDeadline().isAfter(date)) {
                newList.add(todoItem);
            }
        }
        return newList;
    }

    @Override
    public void remove(int id) {
        todoItems.removeIf(todoItem -> todoItem.getId() == id);
    }
}
