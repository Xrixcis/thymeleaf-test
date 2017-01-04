package com.github.xrixcis.thymeleaf.core.service;

import com.github.xrixcis.thymeleaf.core.model.UserDAO;
import com.github.xrixcis.thymeleaf.core.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xrixcis on 4.1.17.
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserDAO dao;

    @Autowired
    public UserServiceImpl(UserDAO dao) {
        this.dao = dao;
    }

    @Override
    public User getUser(String name) {
        return dao.getUser(name);
    }

    @Override
    public void addUser(User user) {
        dao.addUser(user);
    }

    @Override
    public List<User> getUsers() {
        return dao.getUsers();
    }
}
