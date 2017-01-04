package com.github.xrixcis.thymeleaf.core.service;

import com.github.xrixcis.thymeleaf.core.model.User;

import java.util.List;

/**
 * Created by xrixcis on 4.1.17.
 */
public interface UserService {

    User getUser(String name);

    void addUser(User user);

    List<User> getUsers();
}
