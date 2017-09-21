package com.test.bu.dao;

import com.test.bu.entity.Goods;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class GoodsDaoImp implements GoodsDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void save(Goods goods) {
        entityManager.persist(goods);
    }

    @Override
    public Goods getGoodsById(int id) {
        return entityManager.createQuery("SELECT g FROM Goods g WHERE id=:id", Goods.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public Goods update(Goods newGoods) {
        return null;
    }

    @Override
    public List<Goods> getAll() {
        return entityManager.createQuery("SELECT g FROM Goods g", Goods.class).getResultList();
    }

    @Override
    public void delete(int id) {

    }
}
