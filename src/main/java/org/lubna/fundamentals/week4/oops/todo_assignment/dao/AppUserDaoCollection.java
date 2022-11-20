package org.lubna.fundamentals.week4.oops.todo_assignment.dao;

import org.lubna.fundamentals.week4.oops.todo_assignment.model.AppUser;

import java.util.ArrayList;
import java.util.List;

public class AppUserDaoCollection implements AppUserDAO {

    private final List<AppUser> users;

    public AppUserDaoCollection() {
        users = new ArrayList<>();
    }

    @Override
    public AppUser persist(AppUser appUser) {
        if (appUser == null) System.out.println("App user was null");
        users.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUserName(String username) {
        if (username == null) System.out.println("username was null");
        for (AppUser user : users)
            if (user.getUsername().equalsIgnoreCase(username))
                return user;
        return null;
    }

    @Override
    public List<AppUser> findAll() {
        return users;
    }

    @Override
    public void remove(String username) {
        users.removeIf(user -> user.getUsername().equalsIgnoreCase(username));
    }
}

