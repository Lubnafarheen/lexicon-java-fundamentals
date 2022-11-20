package org.lubna.fundamentals.week4.oops.todo_assignment;

import org.junit.Assert;
import org.junit.Test;
import org.lubna.fundamentals.week4.oops.todo_assignment.model.Person;

public class PersonTest {

    @Test
    public void getSummary_test() {
        Person person1 = new Person("Lubna", "Farheen", "lubna@gmail.com");
        Assert.assertEquals("Person{id=1, name='Lubna Farheen', email='lubna@gmail.com'}", person1.toString());
    }

    @Test
    public void testTestEquals() {
        Person person1 = new Person("Lubna", "Farheen", "lubna@gmail.com");
        Person person2 = new Person("Lubna", "Farheen", "lubna@gmail.com");
        Assert.assertEquals(false, person1.equals(person2));
    }

    @Test
    public void testTestHashCode() {
        Person person1 = new Person("Lubna", "Farheen", "lubna@gmail.com");
        Assert.assertEquals(-1607357364, person1.hashCode());
    }


}

