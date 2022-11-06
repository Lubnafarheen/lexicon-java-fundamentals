package org.lubna.fundamentals.week4.oops.assignment;

import java.time.LocalDate;

public class TodoItem {
    private static int personIdSequencer;

    static {
        personIdSequencer = 1;
    }
    private int id;
    private String title;
    private String taskDescription;
    LocalDate deadline;
    private boolean done;
    private Person creator;

    public TodoItem(String title , String taskDescription , LocalDate deadline , boolean done , Person creator) {
        this.id = personIdSequencer++;
        setTitle(title);
        this.taskDescription = taskDescription;
        setDeadline(deadline);
        this.done = done;
        this.creator = creator;
    }

    public String getSummaryOfTodoItems() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", deadline=" + deadline +
                ", done=" + done +
                ", creator=" + creator.getSummary() +
                '}';
    }

    public boolean isOverdue() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.isAfter(deadline);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title == null) throw new IllegalArgumentException("Not allowed to be null ");
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        if(deadline == null) throw new IllegalArgumentException("Not allowed to be null ");
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
}
