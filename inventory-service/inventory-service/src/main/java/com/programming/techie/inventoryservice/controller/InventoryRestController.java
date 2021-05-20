package com.programming.techie.inventoryservice.controller;

import com.programming.techie.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(InventoryRestController.URL_BASE)
@RequiredArgsConstructor
public class InventoryRestController {
    public static final String URL_BASE = "/api/v1/inventory";
    private final InventoryService inventoryService;

    @GetMapping("/{skuCode}")
    public boolean isInStock(@PathVariable String skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
