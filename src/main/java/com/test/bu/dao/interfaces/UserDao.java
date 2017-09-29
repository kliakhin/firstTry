package com.test.bu.dao.interfaces;

import com.test.bu.entity.User;

public interface UserDao extends IDAO<User> {
    User getByName(String userName);
}
