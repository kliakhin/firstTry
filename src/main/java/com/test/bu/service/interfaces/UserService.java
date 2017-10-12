package com.test.bu.service.interfaces;

import com.test.bu.entity.User;
import org.springframework.data.domain.Page;

public interface UserService extends IService<User> {
    User getByName(String userName);

    Page<User> getAll(Integer page, Integer size, String order);
}
