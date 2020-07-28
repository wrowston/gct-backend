package com.golfclubtrader.gctbackend.dao;

import com.golfclubtrader.gctbackend.models.Product;

import java.util.Set;

public interface ProductDAO {
    Set<Product> findAll();

    Product findById(Long id);

    Product save(Product object);

    void deleteById(Long id);
}
