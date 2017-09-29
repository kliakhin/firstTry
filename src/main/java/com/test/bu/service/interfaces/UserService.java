package com.test.bu.service.interfaces;

import com.test.bu.entity.User;

public interface UserService extends IService<User> {
    User getByName(String userName);
}
