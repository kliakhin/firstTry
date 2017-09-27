package com.test.bu.dao;

import com.test.bu.dao.interfaces.BasketDao;
import com.test.bu.entity.Basket;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class BasketDaoImp implements BasketDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void save(Basket entity) {
        entityManager.persist(entity);
    }

    @Override
    public Basket getById(int id) {
        return entityManager.createQuery("SELECT b FROM Basket b WHERE id=:id", Basket.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public void update(Basket entity) {
        entityManager.merge(entity);
    }

    @Override
    public void delete(Basket entity) {
        entityManager.remove(entity);
    }

    @Override
    public List<Basket> getAll() {
        return entityManager.createQuery("SELECT b FROM Basket b", Basket.class).getResultList();
    }
}
