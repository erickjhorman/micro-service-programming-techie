package com.programming.techie.productservice.dto;

import com.programming.techie.productservice.model.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder  @Getter  @Setter
public class ProductDto {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

    public Product toEntity(){
        return Product.builder().name(getName())
                .description(getDescription())
                .price(getPrice())
                .build();
    }
}
