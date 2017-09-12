package com.test.bu.dao;

import com.test.bu.entity.User;

import java.util.List;

public interface UserDao {

    void save(User user);

    List<User> getAll();
}
