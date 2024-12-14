package com.toie.shopApp.mapper;

import com.toie.shopApp.domain.entity.Analytics;
import com.toie.shopApp.model.AnalyticsDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AnalyticsMapper {
    AnalyticsDto map(Analytics analytics);
    List<AnalyticsDto> map(List<Analytics> analytics);
}
