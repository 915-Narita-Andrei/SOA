package com.toie.shopApp.service;

import com.toie.shopApp.domain.entity.Analytics;
import com.toie.shopApp.domain.entity.EmailSent;
import com.toie.shopApp.repository.AnalyticsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnalyticsService {

    private final AnalyticsRepository analyticsRepository;

    public List<Analytics> getAllAnalytics() {
        return analyticsRepository.findAll();
    }
}
