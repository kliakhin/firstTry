package com.test.bu.dao;

import com.test.bu.dao.interfaces.PaymentDao;
import com.test.bu.entity.Payment;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PaymentDaoImpl implements PaymentDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void save(Payment entity) {
        entityManager.persist(entity);
    }

    @Override
    public Payment getById(int id) {
        return entityManager.createQuery("SELECT g FROM Payment g WHERE id=:id", Payment.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    @Transactional
    public void update(Payment entity) {
        entityManager.merge(entity);
    }

    @Override
    public void delete(Payment entity) {
        entityManager.remove(entity);
    }

    @Override
    public List<Payment> getAll() {
        return entityManager.createQuery("SELECT p FROM Payment p", Payment.class).getResultList();
    }

}