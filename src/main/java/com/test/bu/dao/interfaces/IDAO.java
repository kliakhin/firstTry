package com.test.bu.dao.interfaces;

import java.util.Collection;

public interface IDAO<T> {

    void save(T entity);

    T getById(int id);

    Collection<T> getAll();

    void update(T entity);

    void delete(T entity);
}
