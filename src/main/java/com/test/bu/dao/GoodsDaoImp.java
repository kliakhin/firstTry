package com.test.bu.dao;

import com.test.bu.dao.interfaces.GoodsDao;
import com.test.bu.entity.Goods;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class GoodsDaoImp implements GoodsDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void save(Goods goods) {
        entityManager.persist(goods);
    }

    @Override
    public Goods getById(int id) {
        return entityManager.createQuery("SELECT g FROM Goods g WHERE id=:id", Goods.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public void update(Goods goods) {
        entityManager.merge(goods);
    }

    @Override
    public void delete(Goods entity) {
        entityManager.remove(entity);
    }

    @Override
    public List<Goods> getAll() {
        return entityManager.createQuery("SELECT g FROM Goods g", Goods.class).getResultList();
    }
}
