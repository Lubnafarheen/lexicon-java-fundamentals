package org.lubna.fundamentals.week6.collections;

import java.util.Objects;

public class SuperHero implements Comparable<SuperHero> {
    private final Integer id;
    private final String name;
    private final Integer age;

    public SuperHero(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperHero superHero = (SuperHero) o;
        return Objects.equals(id, superHero.id) && Objects.equals(name, superHero.name) && Objects.equals(age, superHero.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(SuperHero o) {
        // positive, negative or zero
        if(this.age> o.getAge()) return 1;

        else if(this.age < o.getAge()) return -1;

        else return 0;
    }
}
