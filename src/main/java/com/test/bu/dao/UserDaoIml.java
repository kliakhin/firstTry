package com.test.bu.dao;

import com.test.bu.dao.interfaces.UserDao;
import com.test.bu.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoIml implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    public void save(User entity) {
        entityManager.persist(entity);
    }

    public User getById(int id) {
        return entityManager.createQuery("SELECT u FROM User u WHERE id=:id", User.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public User getByName(String userName) {
        return entityManager.createQuery("SELECT u FROM User u WHERE username=:name", User.class)
                .setParameter("name", userName)
                .getSingleResult();
    }

    @Transactional
    public void update(User entity) {
        entityManager.merge(entity);
    }

    public void delete(User entity) {
        entityManager.remove(entity);
    }

    public List<User> getAll() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }
}