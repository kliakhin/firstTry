package com.test.bu.dao;

import com.test.bu.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserDaoIml implements UserDao {

    private JdbcTemplate jdbcTemplate;

    public UserDaoIml(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(User user) {
        /*String sql = "INSERT INTO user(name, email, age) VALUES(?, ?, ?)";
        jdbcTemplate.query(sql, );*/
        System.out.println("I'm the save method");
    }

    @Override
    public List<User> getAll() {
        System.out.println("I'm the getAll method");
        return null;
    }
}
