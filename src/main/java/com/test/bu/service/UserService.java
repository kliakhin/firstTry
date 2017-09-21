package com.test.bu.service;

import com.test.bu.entity.User;

import java.util.List;

public interface UserService {

    User getById(int id);

    List<User> getAll();

    void save(User user);

    void delete(int id);

    void update(User user);
}
