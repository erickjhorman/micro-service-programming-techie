package com.programming.techie.productservice.controller;

import com.programming.techie.productservice.dto.ProductDto;
import com.programming.techie.productservice.model.Product;
import com.programming.techie.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(ProductController.URL_BASE)
public class ProductController {
    public static final String URL_BASE = "/api/v1/products";
    private final ProductService productService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll(){
        return productService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductDto productDto){
        productService.createProduct(productDto.toEntity());
    }
}
