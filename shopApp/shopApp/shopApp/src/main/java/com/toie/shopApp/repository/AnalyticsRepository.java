package com.toie.shopApp.repository;

import com.toie.shopApp.domain.entity.Analytics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AnalyticsRepository  extends JpaRepository<Analytics, UUID> {
}
