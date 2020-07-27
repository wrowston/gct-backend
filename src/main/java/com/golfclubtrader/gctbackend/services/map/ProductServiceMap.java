package com.golfclubtrader.gctbackend.services.map;

import com.golfclubtrader.gctbackend.models.Product;
import com.golfclubtrader.gctbackend.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ProductServiceMap extends AbstractMapService<Product, Long> implements ProductService {

    @Override
    public Set<Product> findAll() {
        return super.findAll();
    }

    @Override
    public Product findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Product create() {
        return null;
    }

    @Override
    public Product update(Product product) {
        return super.update(product);
    }

    @Override
    public void delete(Product product) {
        super.delete(product);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
