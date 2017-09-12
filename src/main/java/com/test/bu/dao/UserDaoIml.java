package com.test.bu.dao;

import com.test.bu.entity.User;
import com.test.bu.mappers.UserMapper;
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
        String sql = "INSERT INTO user(name, email, age) VALUES(?, ?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge());
    }

    @Override
    public User getUserById(int id) {
        String sql = "SELECT * FROM user WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    @Override
    public User update(User newUser) {
        String sql = "UPDATE user SET name=?, email=?, age=? WHERE id=?";
        int update = jdbcTemplate.update(sql, newUser.getName(), newUser.getEmail(), newUser.getAge(), newUser.getId());
        System.out.println("return + " + update);
        return null;
    }

    @Override
    public List<User> getAll() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM user WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void delete(String name) {
        String sql = "DELETE FROM user WHERE name=?";
        jdbcTemplate.update(sql, name);
    }
}
