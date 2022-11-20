package org.lubna.fundamentals.week4.oops.todo_assignment.dao;

import org.lubna.fundamentals.week4.oops.todo_assignment.model.TodoItemTask;

import java.util.ArrayList;
import java.util.List;

public class TodoItemTaskDAOCollection implements TodoItemTaskDAO {

    private final List<TodoItemTask> todoItemTasks;

    public TodoItemTaskDAOCollection() {
        todoItemTasks = new ArrayList<>();
    }

    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        if (todoItemTask == null) System.out.println("TodoItem was null");
        todoItemTasks.add(todoItemTask);
        return todoItemTask;
    }

    @Override
    public TodoItemTask findById(int id) {
        for (TodoItemTask todoItemTask : todoItemTasks) {
            if (todoItemTask.getId() == id)
                return todoItemTask;
        }
        return null;
    }

    @Override
    public List<TodoItemTask> findAll() {
        return todoItemTasks;
    }

    @Override
    public List<TodoItemTask> findByAssignedStatus(boolean status) {
        List<TodoItemTask> todoItemTaskList = new ArrayList<>();
        for (TodoItemTask todoItemTask : todoItemTasks) {
            if (todoItemTask.isAssigned() == status)
                todoItemTaskList.add(todoItemTask);
        }
        return todoItemTaskList;
    }

    @Override
    public void remove(int id) {
        todoItemTasks.removeIf(todoItemTask -> todoItemTask.getId() == id);
    }
}
