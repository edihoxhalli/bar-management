package com.bar.barmanagement.domain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    private Long id;
    private String name;
    private Category category;
    private Float price;

}
