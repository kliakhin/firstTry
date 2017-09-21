package com.test.bu.dao;

import com.test.bu.entity.User;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
public class UserDaoIml implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUserById(int id) {
        return entityManager.createQuery("SELECT u FROM User u WHERE id=:id", User.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    @Transactional
    public User update(User newUser) {
        return entityManager.merge(newUser);
    }

    @Override
    public List<User> getAll() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public void delete(int id) {
    }

    @Override
    public void delete(String name) {

    }

    /*@Override
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
    }*/
}
