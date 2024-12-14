package com.toie.shopApp.controller;

import com.toie.shopApp.api.ProductApi;
import com.toie.shopApp.mapper.AnalyticsMapper;
import com.toie.shopApp.mapper.EmailMapper;
import com.toie.shopApp.mapper.ProductMapper;
import com.toie.shopApp.model.AnalyticsDto;
import com.toie.shopApp.model.EmailSentDto;
import com.toie.shopApp.model.ProductDto;
import com.toie.shopApp.service.AnalyticsService;
import com.toie.shopApp.service.EmailSentService;
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

    private final EmailSentService emailSentService;
    private final EmailMapper emailMapper;
    private final AnalyticsService analyticsService;
    private final AnalyticsMapper analyticsMapper;

    @Override
    public ResponseEntity<Void> buyProduct(String name) {
        productService.buyProduct(name);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<List<AnalyticsDto>> getAllAnalytics() {
        var analytics = analyticsService.getAllAnalytics();
        return ResponseEntity.ok(analyticsMapper.map(analytics));
    }

    @Override
    public ResponseEntity<List<EmailSentDto>> getAllEmails() {
        var emails = emailSentService.getAllEmails();
        return ResponseEntity.ok(emailMapper.map(emails));
    }

    @Override
    public ResponseEntity<List<ProductDto>> getAllProducts() {
        var products = productService.getAllProducts();
        return ResponseEntity.ok(productMapper.map(products));
    }


}

