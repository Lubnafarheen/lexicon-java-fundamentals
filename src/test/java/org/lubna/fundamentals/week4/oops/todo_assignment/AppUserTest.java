package org.lubna.fundamentals.week4.oops.todo_assignment;

import junit.framework.TestCase;
import org.junit.Test;

public class AppUserTest extends TestCase {

    @Test
    public void testTestEquals() {
        AppUser user1 = new AppUser("Lubna", "lubna1234", AppRole.ROLE_APP_USER);
        AppUser user2 = new AppUser("Lubna", "lubna123", AppRole.ROLE_APP_USER);
        assertEquals(true, user1.equals(user2));
    }

    public void testTestHashCode() {
        AppUser user1 = new AppUser("Lubna", "lubna1234", AppRole.ROLE_APP_USER);
        assertEquals(-1564761965, user1.hashCode());

    }

    @Test
    public void testTestToString() {
        AppUser user1 = new AppUser("Lubna", "lubna1234", AppRole.ROLE_APP_USER);
        assertEquals("AppUser{username='Lubna', role=ROLE_APP_USER}", user1.toString());
    }

}