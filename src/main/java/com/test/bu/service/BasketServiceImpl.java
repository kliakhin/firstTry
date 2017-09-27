package com.test.bu.service;

import com.test.bu.dao.interfaces.BasketDao;
import com.test.bu.entity.Basket;
import com.test.bu.service.interfaces.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    private BasketDao basketDao;

    @Override
    public Basket getById(int id) {
        return basketDao.getById(id);
    }

    @Override
    public Collection<Basket> getAll() {
        return basketDao.getAll();
    }

    @Override
    public void save(Basket user) {
        basketDao.save(user);
    }

    @Override
    public void delete(int id) {
        basketDao.delete(basketDao.getById(id));
    }

    @Override
    public void update(Basket user) {
        basketDao.update(user);
    }
}
