package com.toie.shopApp.mapper;

import com.toie.shopApp.domain.Product;
import com.toie.shopApp.model.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductDto map(Product product);
    List<ProductDto> map(List<Product> product);
}
