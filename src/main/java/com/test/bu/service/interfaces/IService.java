package com.test.bu.service.interfaces;

import java.util.Collection;

public interface IService<T> {

    T getById(int id);

    Collection<T> getAll();

    void save(T entity);

    void delete(int id);

    void update(T entity);
}
