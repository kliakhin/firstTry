package com.test.bu.dao2;

import com.test.bu.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao2 extends JpaRepository<User, Integer> {
    User findById(int id);

    User findByUserName(String userName);

    @Override
    Page<User> findAll(Pageable pageable);
}
