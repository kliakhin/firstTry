package com.test.bu.service;

import com.test.bu.dao.interfaces.GoodsDao;
import com.test.bu.entity.Goods;
import com.test.bu.service.interfaces.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Goods getById(int id) {
        return goodsDao.getById(id);
    }

    @Override
    public Collection<Goods> getAll() {
        return goodsDao.getAll();
    }

    @Override
    public void save(Goods goods) {
        goodsDao.save(goods);
    }

    @Override
    public void delete(int id) {
        goodsDao.delete(goodsDao.getById(id));
    }

    @Override
    public void update(Goods goods) {
        goodsDao.delete(goods);
    }

}
