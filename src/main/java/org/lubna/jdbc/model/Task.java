package org.lubna.jdbc.model;

public class Task {

    private Integer id;
    private String description;
    private String title;
    private Person person;

    public Task(Integer id, String description, String title, Person person) {
        this.id = id;
        this.description = description;
        this.title = title;
        this.person = person;
    }

    public Task(String description, String title, Person person) {
        this.description = description;
        this.title = title;
        this.person = person;
    }

    public Task(String description, String title) {
        this.description = description;
        this.title = title;
    }

    public Task(Integer id, String description, String title) {
        this.id = id;
        this.description = description;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", person=" + person +
                '}';
    }
}
