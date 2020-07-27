package com.golfclubtrader.gctbackend.controllers;

import com.golfclubtrader.gctbackend.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping({"/products"})
    public String allProducts(Model model) {

        model.addAttribute("products", productService.findAll());

        return "products/index";
    }
}
