package com.test.bu.dao;

import com.test.bu.entity.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    User getUserById(int id);

    User update(User newUser);

    List<User> getAll();

    void delete(int id);

    void delete(String name);
}
