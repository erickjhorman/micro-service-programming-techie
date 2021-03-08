package com.programming.techie.productservice.service;

import com.programming.techie.productservice.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();
    void createProduct(Product p);
}
