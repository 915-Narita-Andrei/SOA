package com.toie.shopApp.controller;

import com.toie.shopApp.api.ProductApi;
import com.toie.shopApp.mapper.ProductMapper;
import com.toie.shopApp.model.ProductDto;
import com.toie.shopApp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ShopController implements ProductApi {

    private final ProductService productService;
    private final ProductMapper productMapper;

    @Override
    public ResponseEntity<List<ProductDto>> getAllProducts() {
        var products = productService.getAllProducts();
        return ResponseEntity.ok(productMapper.map(products));
    }
}

