package org.lubna.fundamentals.week4.oops.assignment;

public class TodoItemTask {
    private static int personIdSequencer;

    static {
        personIdSequencer = 1;
    }

    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask(boolean assigned , TodoItem todoItem , Person assignee) {
        this.id = personIdSequencer++;
        this.assigned = assigned;
        setTodoItem(todoItem);
        this.assignee = assignee;
    }

    public String getSummaryOfTodoItemTask() {
        return "TodoItemTask{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", todoItem=" + todoItem.getSummaryOfTodoItems() +
                ", assignee=" + assignee.getSummary() +
                '}';
    }

    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("First name cannot be null ");
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assigned = true;
        this.assignee = assignee;
    }


}
