package com.golfclubtrader.gctbackend.controllers;

import com.golfclubtrader.gctbackend.models.Product;
import com.golfclubtrader.gctbackend.services.ProductService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Set<Product> allProducts() {

        Set<Product> products = productService.findAll();

        return products;
    }

    @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
    public Product findProductById(Long id) {

        Product product = productService.findById(id);

        return product;
    }
}
