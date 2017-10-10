package com.test.bu.service;

import com.test.bu.dao2.UserDao2;
import com.test.bu.entity.User;
import com.test.bu.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao2 userDao;

    @Override
    public User getById(int id) {
        return userDao.findById(id);
    }

    @Override
    public User getByName(String userName) {
        return userDao.findByUserName(userName);
    }

    @Override
    public Collection<User> getAll() {
        return userDao.findAll();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }

}
