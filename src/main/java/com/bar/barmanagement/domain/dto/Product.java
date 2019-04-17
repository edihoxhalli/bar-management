package com.bar.barmanagement.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    private Long id;
    private String name;
    private Category category;
    private Float price;

    enum Category{
        ALCOHOOLIC, ANALCOHOOLIC, CAFFEINE
    }
}
