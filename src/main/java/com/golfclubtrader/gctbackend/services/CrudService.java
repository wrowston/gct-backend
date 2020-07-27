package com.golfclubtrader.gctbackend.services;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T create();

    T update(T object);

    void delete(T object);

    void deleteById(ID id);
}
