package org.lubna.fundamentals.week4.oops.assignment;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void Constructor_test() {
        Person person1 = new Person("Lubna", "Farheen", "lubna@gmail.com");
        Assert.assertEquals("Lubna", person1.getFirstName());
        Assert.assertEquals("Farheen", person1.getLastName());
        Assert.assertEquals("lubna@gmail.com", person1.getEmail());
    }

    @Test
    public void getSummary_test() {
        Person person1 = new Person("Lubna", "Farheen", "lubna@gmail.com");
        Assert.assertEquals("Person{id=1, name='Lubna Farheen', email='lubna@gmail.com'}", person1.getSummary());
    }

}

