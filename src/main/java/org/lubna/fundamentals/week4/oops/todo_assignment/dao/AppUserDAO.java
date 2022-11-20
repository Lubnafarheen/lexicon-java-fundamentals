package org.lubna.fundamentals.week4.oops.todo_assignment.dao;

import org.lubna.fundamentals.week4.oops.todo_assignment.model.AppUser;

import java.util.List;

public interface AppUserDAO {

    AppUser persist(AppUser appUser);

    AppUser findByUserName(String username);

    List<AppUser> findAll();

    void remove(String username);
}
