package com.test.bu.dao;

import com.test.bu.entity.Goods;

import java.util.List;

public interface GoodsDao {

    void save(Goods goods);

    Goods getGoodsById(int id);

    Goods update(Goods newGoods);

    List<Goods> getAll();

    void delete(int id);
}
