package com.toie.shopApp.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.toie.shopApp.domain.EmailRequest;
import com.toie.shopApp.domain.Product;
import com.toie.shopApp.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final EmailPublisher emailPublisher;
    private final AnalyticsPubliser analyticsPubliser;
    private final ObjectMapper objectMapper;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Transactional
    public void buyProduct(String name) {
        var optionalProduct = productRepository.findByName(name);
        if (optionalProduct.isEmpty()) {
            throw new RuntimeException("Product not found by name %s".formatted(name));
        }
        var product = optionalProduct.get();

        if (product.getCount() == 0) {
            throw new RuntimeException("Product %s has an empty stock".formatted(name));
        }

        product.setCount(product.getCount() - 1);
        productRepository.save(product);

        publishEmail(product);
        publishAnalytics(product);
    }

    private void publishEmail(Product product) {
        var emailRequest = EmailRequest.builder()
                .email(SecurityContextHolder.getContext().getAuthentication().getName())
                .productName(product.getName())
                .build();
        emailPublisher.publishEmail(emailRequest);
    }

    private void publishAnalytics(Product product){
        try {
            analyticsPubliser.publishAnalytocs(objectMapper.writeValueAsString(product));
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error while trying to serilize message to send it to Kafka");
        }
    }
}
