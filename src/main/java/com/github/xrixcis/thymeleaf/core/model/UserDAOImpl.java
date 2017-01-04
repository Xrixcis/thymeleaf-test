package com.github.xrixcis.thymeleaf.core.model;

import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by xrixcis on 4.1.17.
 */
@Repository
public class UserDAOImpl implements UserDAO {

    private final ConcurrentHashMap<String, User> users = new ConcurrentHashMap<String, User>();

    public UserDAOImpl() {
        users.put("Arthur Dent", new User("Arthur Dent", 42));
        users.put("Zaphod Beeblebrox", new User("Zaphod Beeblebrox", 124));
    }

    @Override
    public User getUser(String name) {
        Assert.notNull(name);
        return users.get(name);
    }

    @Override
    public void addUser(User user) {
        Assert.notNull(user);
        users.put(user.getName(), user);
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<User>(users.values());
    }

}
