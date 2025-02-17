package com.toie.shopApp.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmailRequest {
    private String email;
    private String productName;
}
