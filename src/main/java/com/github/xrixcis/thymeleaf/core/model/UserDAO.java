package com.github.xrixcis.thymeleaf.core.model;

import java.util.List;

/**
 * Created by xrixcis on 4.1.17.
 */
public interface UserDAO {
    User getUser(String name);

    void addUser(User user);

    List<User> getUsers();
}
