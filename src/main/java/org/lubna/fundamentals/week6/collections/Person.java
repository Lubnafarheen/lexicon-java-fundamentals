package org.lubna.fundamentals.week6.collections;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person personInput) {
        //sort in ascending order
        if (this.getId() > personInput.getId()) {
            return 1;
        } else if (this.getId() < personInput.getId()) {
            return -1;
        } else
            return 0;
    }

    //sort in descending order
    /* if (this.getId() > personInput.getId()) {
        return -1;
    } else if (this.getId() < personInput.getId()) {
        return 1;
    } else
            return 0;
}*/

}
