package com.test.bu.service.interfaces;

import com.test.bu.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends IService<User>, UserDetailsService {
    User getByName(String userName);

    Page<User> getAll(Integer page, Integer size, String order);
}
