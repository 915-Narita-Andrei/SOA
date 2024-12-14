package com.toie.shopApp.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.lang.NonNull;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    private String id;

    @Column
    @NonNull
    private String name;

    @Column
    @NonNull
    private int price;

    @Column
    @NonNull
    private int count;
}